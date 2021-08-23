// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

use crate::info::tests::constants::*;
use crate::info::tests::mem_size_test_case::*;
use crate::test_utils::from_str_conv::*;
use alloc::string::String;
use alloc::vec::Vec;
use core::iter::IntoIterator;
use static_assertions::const_assert_eq;
use std::collections::HashMap;
use std::fs::File;
use std::io::prelude::*;
use std::io::{BufReader, Lines};
use std::path::Path;

pub(super) struct MemorySizeInfoTestParser {
	filename: String,
	lines: Lines<BufReader<File>>,
}

impl MemorySizeInfoTestParser {
	pub(super) fn new(filename: &Path) -> Self {
		let display_filename = filename.display().to_string();
		let file = File::open(filename).unwrap_or_else(|_| panic!("Couldn't open file {}", display_filename));
		let lines = BufReader::new(file).lines();
		Self { filename: display_filename, lines }
	}
}

impl IntoIterator for MemorySizeInfoTestParser {
	type Item = MemorySizeInfoTestCase;
	type IntoIter = IntoIter;

	fn into_iter(self) -> Self::IntoIter {
		// GENERATOR-BEGIN: FlagsDict
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		let mut to_flags: HashMap<&'static str, u32> = HashMap::with_capacity(3);
		let _ = to_flags.insert("signed", MemorySizeFlags::SIGNED);
		let _ = to_flags.insert("bcst", MemorySizeFlags::BROADCAST);
		let _ = to_flags.insert("packed", MemorySizeFlags::PACKED);
		// GENERATOR-END: FlagsDict

		IntoIter { filename: self.filename, lines: self.lines, line_number: 0, to_flags }
	}
}

pub(super) struct IntoIter {
	filename: String,
	lines: Lines<BufReader<File>>,
	line_number: u32,
	to_flags: HashMap<&'static str, u32>,
}

impl Iterator for IntoIter {
	type Item = MemorySizeInfoTestCase;

	fn next(&mut self) -> Option<Self::Item> {
		loop {
			let result = match self.lines.next()? {
				Ok(line) => {
					self.line_number += 1;
					if line.is_empty() || line.starts_with('#') {
						continue;
					}
					self.read_next_test_case(line, self.line_number)
				}
				Err(err) => Err(err.to_string()),
			};
			match result {
				Ok(tc) => return Some(tc),
				Err(err) => panic!("Error parsing memory size info test case file '{}', line {}: {}", self.filename, self.line_number, err),
			}
		}
	}
}

impl IntoIter {
	fn read_next_test_case(&self, line: String, line_number: u32) -> Result<MemorySizeInfoTestCase, String> {
		const_assert_eq!(MiscInstrInfoTestConstants::MEMORY_SIZE_ELEMS_PER_LINE, 6);
		let elems: Vec<_> = line.splitn(MiscInstrInfoTestConstants::MEMORY_SIZE_ELEMS_PER_LINE, ',').collect();
		if elems.len() != MiscInstrInfoTestConstants::MEMORY_SIZE_ELEMS_PER_LINE {
			return Err(format!("Invalid number of commas: {}", elems.len() - 1));
		}

		let mut tc = MemorySizeInfoTestCase::default();
		tc.line_number = line_number;
		tc.memory_size = to_memory_size(elems[0])?;
		tc.size = to_u32(elems[1])? as usize;
		tc.element_size = to_u32(elems[2])? as usize;
		tc.element_type = to_memory_size(elems[3])?;
		tc.element_count = to_u32(elems[4])? as usize;
		for value in elems[5].split_whitespace() {
			if value.is_empty() {
				continue;
			}
			match self.to_flags.get(value) {
				Some(flags) => tc.flags |= *flags,
				None => return Err(format!("Invalid flags value: {}", value)),
			}
		}

		Ok(tc)
	}
}
