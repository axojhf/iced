// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

use crate::MvexTupleTypeLutKind;
use lazy_static::lazy_static;
use std::collections::HashMap;

lazy_static! {
	pub(super) static ref TO_MVEX_TT_LUT_KIND_HASH: HashMap<&'static str, MvexTupleTypeLutKind> = {
		// GENERATOR-BEGIN: MvexTupleTypeLutKindHash
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		let mut h = HashMap::with_capacity(14);
		let _ = h.insert("Int32", MvexTupleTypeLutKind::Int32);
		let _ = h.insert("Int32_Half", MvexTupleTypeLutKind::Int32_Half);
		let _ = h.insert("Int32_4to16", MvexTupleTypeLutKind::Int32_4to16);
		let _ = h.insert("Int32_1to16_or_elem", MvexTupleTypeLutKind::Int32_1to16_or_elem);
		let _ = h.insert("Int64", MvexTupleTypeLutKind::Int64);
		let _ = h.insert("Int64_4to8", MvexTupleTypeLutKind::Int64_4to8);
		let _ = h.insert("Int64_1to8_or_elem", MvexTupleTypeLutKind::Int64_1to8_or_elem);
		let _ = h.insert("Float32", MvexTupleTypeLutKind::Float32);
		let _ = h.insert("Float32_Half", MvexTupleTypeLutKind::Float32_Half);
		let _ = h.insert("Float32_4to16", MvexTupleTypeLutKind::Float32_4to16);
		let _ = h.insert("Float32_1to16_or_elem", MvexTupleTypeLutKind::Float32_1to16_or_elem);
		let _ = h.insert("Float64", MvexTupleTypeLutKind::Float64);
		let _ = h.insert("Float64_4to8", MvexTupleTypeLutKind::Float64_4to8);
		let _ = h.insert("Float64_1to8_or_elem", MvexTupleTypeLutKind::Float64_1to8_or_elem);
		// GENERATOR-END: MvexTupleTypeLutKindHash
		h
	};
}
