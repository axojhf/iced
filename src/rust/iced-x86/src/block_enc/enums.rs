// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

use crate::block_enc::iced_constants::IcedConstants;
use crate::block_enc::iced_error::IcedError;
use core::fmt;
use core::iter::{ExactSizeIterator, FusedIterator, Iterator};

// GENERATOR-BEGIN: RelocKind
// ⚠️This was generated by GENERATOR!🦹‍♂️
/// Relocation kind
#[derive(Copy, Clone, Eq, PartialEq, Ord, PartialOrd, Hash)]
#[cfg_attr(not(feature = "exhaustive_enums"), non_exhaustive)]
pub enum RelocKind {
	/// 64-bit offset. Only used if it's 64-bit code.
	Offset64 = 0,
}
#[rustfmt::skip]
static GEN_DEBUG_RELOC_KIND: [&str; 1] = [
	"Offset64",
];
impl fmt::Debug for RelocKind {
	#[inline]
	fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
		write!(f, "{}", GEN_DEBUG_RELOC_KIND[*self as usize])
	}
}
impl Default for RelocKind {
	#[must_use]
	#[inline]
	fn default() -> Self {
		RelocKind::Offset64
	}
}
#[allow(non_camel_case_types)]
#[allow(dead_code)]
pub(crate) type RelocKindUnderlyingType = ();
#[rustfmt::skip]
impl RelocKind {
	/// Iterates over all `RelocKind` enum values
	#[inline]
	pub fn values() -> impl Iterator<Item = RelocKind> + DoubleEndedIterator + ExactSizeIterator + FusedIterator {
		static VALUES: [RelocKind; 1] = [RelocKind::Offset64];
		VALUES.iter().copied()
	}
}
#[test]
#[rustfmt::skip]
fn test_relockind_values() {
	let mut iter = RelocKind::values();
	assert_eq!(iter.size_hint(), (IcedConstants::RELOC_KIND_ENUM_COUNT, Some(IcedConstants::RELOC_KIND_ENUM_COUNT)));
	assert_eq!(iter.len(), IcedConstants::RELOC_KIND_ENUM_COUNT);
	assert!(iter.next().is_some());
	assert_eq!(iter.size_hint(), (IcedConstants::RELOC_KIND_ENUM_COUNT - 1, Some(IcedConstants::RELOC_KIND_ENUM_COUNT - 1)));
	assert_eq!(iter.len(), IcedConstants::RELOC_KIND_ENUM_COUNT - 1);

	let values: Vec<RelocKind> = RelocKind::values().collect();
	assert_eq!(values.len(), IcedConstants::RELOC_KIND_ENUM_COUNT);
	for (i, value) in values.into_iter().enumerate() {
		assert_eq!(i, value as usize);
	}

	let values1: Vec<RelocKind> = RelocKind::values().collect();
	let mut values2: Vec<RelocKind> = RelocKind::values().rev().collect();
	values2.reverse();
	assert_eq!(values1, values2);
}
#[rustfmt::skip]
impl TryFrom<usize> for RelocKind {
	type Error = IcedError;
	#[inline]
	fn try_from(value: usize) -> Result<Self, Self::Error> {
		if value < IcedConstants::RELOC_KIND_ENUM_COUNT {
			Ok(RelocKind::Offset64)
		} else {
			Err(IcedError::new("Invalid RelocKind value"))
		}
	}
}
#[test]
#[rustfmt::skip]
fn test_relockind_try_from_usize() {
	for value in RelocKind::values() {
		let converted = <RelocKind as TryFrom<usize>>::try_from(value as usize).unwrap();
		assert_eq!(converted, value);
	}
	assert!(<RelocKind as TryFrom<usize>>::try_from(IcedConstants::RELOC_KIND_ENUM_COUNT).is_err());
	assert!(<RelocKind as TryFrom<usize>>::try_from(core::usize::MAX).is_err());
}
#[cfg(feature = "serde")]
#[rustfmt::skip]
#[allow(clippy::zero_sized_map_values)]
const _: () = {
	use core::marker::PhantomData;
	use serde::de;
	use serde::{Deserialize, Deserializer, Serialize, Serializer};
	type EnumType = RelocKind;
	impl Serialize for EnumType {
		#[inline]
		fn serialize<S>(&self, serializer: S) -> Result<S::Ok, S::Error>
		where
			S: Serializer,
		{
			serializer.serialize_unit()
		}
	}
	impl<'de> Deserialize<'de> for EnumType {
		#[inline]
		fn deserialize<D>(deserializer: D) -> Result<Self, D::Error>
		where
			D: Deserializer<'de>,
		{
			struct Visitor<'de> {
				marker: PhantomData<EnumType>,
				lifetime: PhantomData<&'de ()>,
			}
			impl<'de> de::Visitor<'de> for Visitor<'de> {
				type Value = EnumType;
				#[inline]
				fn expecting(&self, formatter: &mut fmt::Formatter<'_>) -> fmt::Result {
					formatter.write_str("enum RelocKind")
				}
				#[inline]
				fn visit_unit<E>(self) -> Result<Self::Value, E>
				where
					E: de::Error,
				{
					Ok(RelocKind::Offset64)
				}
			}
			deserializer.deserialize_unit(Visitor { marker: PhantomData::<EnumType>, lifetime: PhantomData })
		}
	}
};
// GENERATOR-END: RelocKind

// GENERATOR-BEGIN: BlockEncoderOptions
// ⚠️This was generated by GENERATOR!🦹‍♂️
/// [`BlockEncoder`] options
///
/// [`BlockEncoder`]: struct.BlockEncoder.html
#[allow(missing_copy_implementations)]
#[allow(missing_debug_implementations)]
pub struct BlockEncoderOptions;
impl BlockEncoderOptions {
	/// No option is set
	pub const NONE: u32 = 0x0000_0000;
	/// By default, branches get updated if the target is too far away, eg. `Jcc SHORT` -> `Jcc NEAR` or if 64-bit mode, `Jcc + JMP [RIP+mem]`. If this option is enabled, no branches are fixed.
	pub const DONT_FIX_BRANCHES: u32 = 0x0000_0001;
	/// The [`BlockEncoder`] should return [`RelocInfo`]s
	///
	/// [`BlockEncoder`]: struct.BlockEncoder.html
	/// [`RelocInfo`]: struct.RelocInfo.html
	pub const RETURN_RELOC_INFOS: u32 = 0x0000_0002;
	/// The [`BlockEncoder`] should return new instruction offsets
	///
	/// [`BlockEncoder`]: struct.BlockEncoder.html
	pub const RETURN_NEW_INSTRUCTION_OFFSETS: u32 = 0x0000_0004;
	/// The [`BlockEncoder`] should return [`ConstantOffsets`]
	///
	/// [`BlockEncoder`]: struct.BlockEncoder.html
	/// [`ConstantOffsets`]: struct.ConstantOffsets.html
	pub const RETURN_CONSTANT_OFFSETS: u32 = 0x0000_0008;
}
// GENERATOR-END: BlockEncoderOptions
