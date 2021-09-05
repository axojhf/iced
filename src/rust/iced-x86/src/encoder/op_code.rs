// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

use crate::encoder::iced_constants::IcedConstants;
use crate::encoder::instruction_fmt::*;
use crate::encoder::op_code_fmt::*;
use crate::encoder::op_kind_tables::*;
use crate::*;
use alloc::string::String;
use core::{fmt, mem};

// GENERATOR-BEGIN: ToDecoderOptionsTable
// ⚠️This was generated by GENERATOR!🦹‍♂️
#[cfg(feature = "decoder")]
#[rustfmt::skip]
static TO_DECODER_OPTIONS: [u32; 17] = [
	DecoderOptions::NONE,
	DecoderOptions::ALTINST,
	DecoderOptions::CL1INVMB,
	DecoderOptions::CMPXCHG486A,
	DecoderOptions::CYRIX,
	DecoderOptions::CYRIX_DMI,
	DecoderOptions::CYRIX_SMINT_0F7E,
	DecoderOptions::JMPE,
	DecoderOptions::LOADALL286,
	DecoderOptions::LOADALL386,
	DecoderOptions::MOV_TR,
	DecoderOptions::MPX,
	DecoderOptions::OLD_FPU,
	DecoderOptions::PCOMMIT,
	DecoderOptions::UMOV,
	DecoderOptions::XBTS,
	DecoderOptions::UDBG,
];
// GENERATOR-END: ToDecoderOptionsTable

struct Flags;
impl Flags {
	pub const NONE: u16 = 0;
	pub const IGNORES_ROUNDING_CONTROL: u16 = 0x0001;
	pub const AMD_LOCK_REG_BIT: u16 = 0x0002;
	pub const LIG: u16 = 0x0004;
	pub const W: u16 = 0x0008;
	pub const WIG: u16 = 0x0010;
	pub const WIG32: u16 = 0x0020;
	pub const CPL0: u16 = 0x0040;
	pub const CPL1: u16 = 0x0080;
	pub const CPL2: u16 = 0x0100;
	pub const CPL3: u16 = 0x0200;
}

/// Opcode info, returned by [`Code::op_code()`] and [`Instruction::op_code()`]
///
/// [`Code::op_code()`]: enum.Code.html#method.op_code
/// [`Instruction::op_code()`]: struct.Instruction.html#method.op_code
#[derive(Debug, Clone)]
pub struct OpCodeInfo {
	op_code_string: String,
	instruction_string: String,
	enc_flags2: u32,
	enc_flags3: u32,
	opc_flags1: u32,
	opc_flags2: u32,
	code: Code,
	op_code: u16,
	flags: u16,
	encoding: EncodingKind,
	operand_size: u8,
	address_size: u8,
	l: u8,
	tuple_type: TupleType,
	table: OpCodeTableKind,
	mandatory_prefix: MandatoryPrefix,
	group_index: i8,
	rm_group_index: i8,
	op_kinds: [OpCodeOperandKind; IcedConstants::MAX_OP_COUNT],
}

impl OpCodeInfo {
	#[allow(unused_mut)]
	pub(super) fn new(code: Code, enc_flags1: u32, enc_flags2: u32, enc_flags3: u32, opc_flags1: u32, opc_flags2: u32, sb: &mut String) -> Self {
		let mut flags = Flags::NONE;
		let op_code = (enc_flags2 >> EncFlags2::OP_CODE_SHIFT) as u16;

		if (enc_flags1 & EncFlags1::IGNORES_ROUNDING_CONTROL) != 0 {
			flags |= Flags::IGNORES_ROUNDING_CONTROL;
		}
		if (enc_flags1 & EncFlags1::AMD_LOCK_REG_BIT) != 0 {
			flags |= Flags::AMD_LOCK_REG_BIT;
		}
		match opc_flags1 & (OpCodeInfoFlags1::CPL0_ONLY | OpCodeInfoFlags1::CPL3_ONLY) {
			OpCodeInfoFlags1::CPL0_ONLY => flags |= Flags::CPL0,
			OpCodeInfoFlags1::CPL3_ONLY => flags |= Flags::CPL3,
			_ => flags |= Flags::CPL0 | Flags::CPL1 | Flags::CPL2 | Flags::CPL3,
		}

		let op0_kind;
		let op1_kind;
		let op2_kind;
		let op3_kind;
		let op4_kind;
		let mut l;
		let mandatory_prefix;
		let table;
		let group_index;
		let rm_group_index;
		let tuple_type;
		let operand_size;
		let address_size;
		let lkind;

		// SAFETY: all generated (and also immutable) data is valid, eg. using transmute to
		// convert an integer to an enum value is valid

		let encoding = unsafe { mem::transmute(((enc_flags3 >> EncFlags3::ENCODING_SHIFT) & EncFlags3::ENCODING_MASK) as u8) };
		mandatory_prefix =
			match unsafe { mem::transmute(((enc_flags2 >> EncFlags2::MANDATORY_PREFIX_SHIFT) & EncFlags2::MANDATORY_PREFIX_MASK) as u8) } {
				MandatoryPrefixByte::None => {
					if (enc_flags2 & EncFlags2::HAS_MANDATORY_PREFIX) != 0 {
						MandatoryPrefix::PNP
					} else {
						MandatoryPrefix::None
					}
				}
				MandatoryPrefixByte::P66 => MandatoryPrefix::P66,
				MandatoryPrefixByte::PF3 => MandatoryPrefix::PF3,
				MandatoryPrefixByte::PF2 => MandatoryPrefix::PF2,
			};
		operand_size = match unsafe { mem::transmute(((enc_flags3 >> EncFlags3::OPERAND_SIZE_SHIFT) & EncFlags3::OPERAND_SIZE_MASK) as u8) } {
			CodeSize::Unknown => 0,
			CodeSize::Code16 => 16,
			CodeSize::Code32 => 32,
			CodeSize::Code64 => 64,
		};
		address_size = match unsafe { mem::transmute(((enc_flags3 >> EncFlags3::ADDRESS_SIZE_SHIFT) & EncFlags3::ADDRESS_SIZE_MASK) as u8) } {
			CodeSize::Unknown => 0,
			CodeSize::Code16 => 16,
			CodeSize::Code32 => 32,
			CodeSize::Code64 => 64,
		};
		group_index = if (enc_flags2 & EncFlags2::HAS_GROUP_INDEX) == 0 { -1 } else { ((enc_flags2 >> EncFlags2::GROUP_INDEX_SHIFT) & 7) as i8 };
		rm_group_index =
			if (enc_flags3 & EncFlags3::HAS_RM_GROUP_INDEX) == 0 { -1 } else { ((enc_flags2 >> EncFlags2::GROUP_INDEX_SHIFT) & 7) as i8 };
		tuple_type = unsafe { mem::transmute(((enc_flags3 >> EncFlags3::TUPLE_TYPE_SHIFT) & EncFlags3::TUPLE_TYPE_MASK) as u8) };

		#[cfg(not(any(not(feature = "no_vex"), not(feature = "no_xop"), not(feature = "no_evex"))))]
		{
			lkind = LKind::LZ;
			l = 0;
		}
		#[cfg(any(not(feature = "no_vex"), not(feature = "no_xop"), not(feature = "no_evex")))]
		match unsafe { mem::transmute(((enc_flags2 >> EncFlags2::LBIT_SHIFT) & EncFlags2::LBIT_MASK) as u8) } {
			LBit::LZ => {
				lkind = LKind::LZ;
				l = 0;
			}
			LBit::L0 => {
				lkind = LKind::L0;
				l = 0;
			}
			LBit::L1 => {
				lkind = LKind::L0;
				l = 1;
			}
			LBit::L128 => {
				lkind = LKind::L128;
				l = 0;
			}
			LBit::L256 => {
				lkind = LKind::L128;
				l = 1;
			}
			LBit::L512 => {
				lkind = LKind::L128;
				l = 2;
			}
			LBit::LIG => {
				lkind = LKind::None;
				l = 0;
				flags |= Flags::LIG;
			}
		}

		#[cfg(any(not(feature = "no_vex"), not(feature = "no_xop"), not(feature = "no_evex")))]
		match unsafe { mem::transmute(((enc_flags2 >> EncFlags2::WBIT_SHIFT) & EncFlags2::WBIT_MASK) as u8) } {
			WBit::W0 => {}
			WBit::W1 => flags |= Flags::W,
			WBit::WIG => flags |= Flags::WIG,
			WBit::WIG32 => flags |= Flags::WIG32,
		}

		let mut string_format = true;
		match encoding {
			EncodingKind::Legacy => {
				op0_kind = LEGACY_OP_KINDS[((enc_flags1 >> EncFlags1::LEGACY_OP0_SHIFT) & EncFlags1::LEGACY_OP_MASK) as usize];
				op1_kind = LEGACY_OP_KINDS[((enc_flags1 >> EncFlags1::LEGACY_OP1_SHIFT) & EncFlags1::LEGACY_OP_MASK) as usize];
				op2_kind = LEGACY_OP_KINDS[((enc_flags1 >> EncFlags1::LEGACY_OP2_SHIFT) & EncFlags1::LEGACY_OP_MASK) as usize];
				op3_kind = LEGACY_OP_KINDS[((enc_flags1 >> EncFlags1::LEGACY_OP3_SHIFT) & EncFlags1::LEGACY_OP_MASK) as usize];
				op4_kind = OpCodeOperandKind::None;

				table = match unsafe { mem::transmute(((enc_flags2 >> EncFlags2::TABLE_SHIFT) & EncFlags2::TABLE_MASK) as u8) } {
					LegacyOpCodeTable::MAP0 => OpCodeTableKind::Normal,
					LegacyOpCodeTable::MAP0F => OpCodeTableKind::T0F,
					LegacyOpCodeTable::MAP0F38 => OpCodeTableKind::T0F38,
					LegacyOpCodeTable::MAP0F3A => OpCodeTableKind::T0F3A,
				};
			}

			#[cfg(feature = "no_vex")]
			EncodingKind::VEX => {
				op0_kind = OpCodeOperandKind::None;
				op1_kind = OpCodeOperandKind::None;
				op2_kind = OpCodeOperandKind::None;
				op3_kind = OpCodeOperandKind::None;
				op4_kind = OpCodeOperandKind::None;
				table = OpCodeTableKind::Normal;
				string_format = false;
			}

			#[cfg(not(feature = "no_vex"))]
			EncodingKind::VEX => {
				op0_kind = VEX_OP_KINDS[((enc_flags1 >> EncFlags1::VEX_OP0_SHIFT) & EncFlags1::VEX_OP_MASK) as usize];
				op1_kind = VEX_OP_KINDS[((enc_flags1 >> EncFlags1::VEX_OP1_SHIFT) & EncFlags1::VEX_OP_MASK) as usize];
				op2_kind = VEX_OP_KINDS[((enc_flags1 >> EncFlags1::VEX_OP2_SHIFT) & EncFlags1::VEX_OP_MASK) as usize];
				op3_kind = VEX_OP_KINDS[((enc_flags1 >> EncFlags1::VEX_OP3_SHIFT) & EncFlags1::VEX_OP_MASK) as usize];
				op4_kind = VEX_OP_KINDS[((enc_flags1 >> EncFlags1::VEX_OP4_SHIFT) & EncFlags1::VEX_OP_MASK) as usize];

				table = match unsafe { mem::transmute(((enc_flags2 >> EncFlags2::TABLE_SHIFT) & EncFlags2::TABLE_MASK) as u8) } {
					VexOpCodeTable::MAP0F => OpCodeTableKind::T0F,
					VexOpCodeTable::MAP0F38 => OpCodeTableKind::T0F38,
					VexOpCodeTable::MAP0F3A => OpCodeTableKind::T0F3A,
				};
			}

			#[cfg(feature = "no_evex")]
			EncodingKind::EVEX => {
				op0_kind = OpCodeOperandKind::None;
				op1_kind = OpCodeOperandKind::None;
				op2_kind = OpCodeOperandKind::None;
				op3_kind = OpCodeOperandKind::None;
				op4_kind = OpCodeOperandKind::None;
				table = OpCodeTableKind::Normal;
				string_format = false;
			}

			#[cfg(not(feature = "no_evex"))]
			EncodingKind::EVEX => {
				op0_kind = EVEX_OP_KINDS[((enc_flags1 >> EncFlags1::EVEX_OP0_SHIFT) & EncFlags1::EVEX_OP_MASK) as usize];
				op1_kind = EVEX_OP_KINDS[((enc_flags1 >> EncFlags1::EVEX_OP1_SHIFT) & EncFlags1::EVEX_OP_MASK) as usize];
				op2_kind = EVEX_OP_KINDS[((enc_flags1 >> EncFlags1::EVEX_OP2_SHIFT) & EncFlags1::EVEX_OP_MASK) as usize];
				op3_kind = EVEX_OP_KINDS[((enc_flags1 >> EncFlags1::EVEX_OP3_SHIFT) & EncFlags1::EVEX_OP_MASK) as usize];
				op4_kind = OpCodeOperandKind::None;

				table = match unsafe { mem::transmute(((enc_flags2 >> EncFlags2::TABLE_SHIFT) & EncFlags2::TABLE_MASK) as u8) } {
					EvexOpCodeTable::MAP0F => OpCodeTableKind::T0F,
					EvexOpCodeTable::MAP0F38 => OpCodeTableKind::T0F38,
					EvexOpCodeTable::MAP0F3A => OpCodeTableKind::T0F3A,
					EvexOpCodeTable::MAP5 => OpCodeTableKind::MAP5,
					EvexOpCodeTable::MAP6 => OpCodeTableKind::MAP6,
				};
			}

			#[cfg(feature = "no_xop")]
			EncodingKind::XOP => {
				op0_kind = OpCodeOperandKind::None;
				op1_kind = OpCodeOperandKind::None;
				op2_kind = OpCodeOperandKind::None;
				op3_kind = OpCodeOperandKind::None;
				op4_kind = OpCodeOperandKind::None;
				table = OpCodeTableKind::Normal;
				string_format = false;
			}

			#[cfg(not(feature = "no_xop"))]
			EncodingKind::XOP => {
				op0_kind = XOP_OP_KINDS[((enc_flags1 >> EncFlags1::XOP_OP0_SHIFT) & EncFlags1::XOP_OP_MASK) as usize];
				op1_kind = XOP_OP_KINDS[((enc_flags1 >> EncFlags1::XOP_OP1_SHIFT) & EncFlags1::XOP_OP_MASK) as usize];
				op2_kind = XOP_OP_KINDS[((enc_flags1 >> EncFlags1::XOP_OP2_SHIFT) & EncFlags1::XOP_OP_MASK) as usize];
				op3_kind = XOP_OP_KINDS[((enc_flags1 >> EncFlags1::XOP_OP3_SHIFT) & EncFlags1::XOP_OP_MASK) as usize];
				op4_kind = OpCodeOperandKind::None;

				table = match unsafe { mem::transmute(((enc_flags2 >> EncFlags2::TABLE_SHIFT) & EncFlags2::TABLE_MASK) as u8) } {
					XopOpCodeTable::MAP8 => OpCodeTableKind::MAP8,
					XopOpCodeTable::MAP9 => OpCodeTableKind::MAP9,
					XopOpCodeTable::MAP10 => OpCodeTableKind::MAP10,
				};
			}

			#[cfg(feature = "no_d3now")]
			EncodingKind::D3NOW => {
				op0_kind = OpCodeOperandKind::None;
				op1_kind = OpCodeOperandKind::None;
				op2_kind = OpCodeOperandKind::None;
				op3_kind = OpCodeOperandKind::None;
				op4_kind = OpCodeOperandKind::None;
				table = OpCodeTableKind::Normal;
				string_format = false;
			}

			#[cfg(not(feature = "no_d3now"))]
			EncodingKind::D3NOW => {
				op0_kind = OpCodeOperandKind::mm_reg;
				op1_kind = OpCodeOperandKind::mm_or_mem;
				op2_kind = OpCodeOperandKind::None;
				op3_kind = OpCodeOperandKind::None;
				op4_kind = OpCodeOperandKind::None;
				table = OpCodeTableKind::T0F;
			}
		}

		let mut result = Self {
			op_code_string: String::new(),
			instruction_string: String::new(),
			enc_flags2,
			enc_flags3,
			opc_flags1,
			opc_flags2,
			code,
			op_code,
			flags,
			encoding,
			operand_size,
			address_size,
			l,
			tuple_type,
			table,
			mandatory_prefix,
			group_index,
			rm_group_index,
			op_kinds: [op0_kind, op1_kind, op2_kind, op3_kind, op4_kind],
		};

		if string_format {
			let op_code_string = OpCodeFormatter::new(&result, sb, lkind, (opc_flags1 & OpCodeInfoFlags1::MOD_REG_RM_STRING) != 0).format();
			result.op_code_string = op_code_string;
			let fmt_opt = unsafe {
				mem::transmute(((opc_flags2 >> OpCodeInfoFlags2::INSTR_STR_FMT_OPTION_SHIFT) & OpCodeInfoFlags2::INSTR_STR_FMT_OPTION_MASK) as u8)
			};
			let instruction_string = InstructionFormatter::new(&result, fmt_opt, sb).format();
			result.instruction_string = instruction_string;
		}

		result
	}

	/// Gets the code
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// let op_code = Code::EVEX_Vmovapd_ymm_k1z_ymmm256.op_code();
	/// assert_eq!(op_code.code(), Code::EVEX_Vmovapd_ymm_k1z_ymmm256);
	/// ```
	#[must_use]
	#[inline]
	pub fn code(&self) -> Code {
		self.code
	}

	/// Gets the mnemonic
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// let op_code = Code::EVEX_Vmovapd_ymm_k1z_ymmm256.op_code();
	/// assert_eq!(op_code.mnemonic(), Mnemonic::Vmovapd);
	/// ```
	#[must_use]
	#[inline]
	pub fn mnemonic(&self) -> Mnemonic {
		self.code.mnemonic()
	}

	/// Gets the encoding
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// let op_code = Code::EVEX_Vmovapd_ymm_k1z_ymmm256.op_code();
	/// assert_eq!(op_code.encoding(), EncodingKind::EVEX);
	/// ```
	#[must_use]
	#[inline]
	pub fn encoding(&self) -> EncodingKind {
		self.encoding
	}

	/// `true` if it's an instruction, `false` if it's eg. [`Code::INVALID`], [`db`], [`dw`], [`dd`], [`dq`]
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// assert!(Code::EVEX_Vmovapd_ymm_k1z_ymmm256.op_code().is_instruction());
	/// assert!(!Code::INVALID.op_code().is_instruction());
	/// assert!(!Code::DeclareByte.op_code().is_instruction());
	/// ```
	///
	/// [`Code::INVALID`]: enum.Code.html#variant.INVALID
	/// [`db`]: enum.Code.html#variant.DeclareByte
	/// [`dw`]: enum.Code.html#variant.DeclareWord
	/// [`dd`]: enum.Code.html#variant.DeclareDword
	/// [`dq`]: enum.Code.html#variant.DeclareQword
	#[must_use]
	#[inline]
	pub fn is_instruction(&self) -> bool {
		self.code > Code::DeclareQword
	}

	/// `true` if it's an instruction available in 16-bit mode
	#[must_use]
	#[inline]
	pub fn mode16(&self) -> bool {
		(self.enc_flags3 & EncFlags3::BIT16OR32) != 0
	}

	/// `true` if it's an instruction available in 32-bit mode
	#[must_use]
	#[inline]
	pub fn mode32(&self) -> bool {
		(self.enc_flags3 & EncFlags3::BIT16OR32) != 0
	}

	/// `true` if it's an instruction available in 64-bit mode
	#[must_use]
	#[inline]
	pub fn mode64(&self) -> bool {
		(self.enc_flags3 & EncFlags3::BIT64) != 0
	}

	/// `true` if an `FWAIT` (`9B`) instruction is added before the instruction
	#[must_use]
	#[inline]
	pub fn fwait(&self) -> bool {
		(self.enc_flags3 & EncFlags3::FWAIT) != 0
	}

	/// (Legacy encoding) Gets the required operand size (16,32,64) or 0
	#[must_use]
	#[inline]
	pub fn operand_size(&self) -> u32 {
		self.operand_size as u32
	}

	/// (Legacy encoding) Gets the required address size (16,32,64) or 0
	#[must_use]
	#[inline]
	pub fn address_size(&self) -> u32 {
		self.address_size as u32
	}

	/// (VEX/XOP/EVEX) `L` / `L'L` value or default value if [`is_lig()`] is `true`
	///
	/// [`is_lig()`]: #method.is_lig
	#[must_use]
	#[inline]
	pub fn l(&self) -> u32 {
		self.l as u32
	}

	/// (VEX/XOP/EVEX) `W` value or default value if [`is_wig()`] or [`is_wig32()`] is `true`
	///
	/// [`is_wig()`]: #method.is_wig
	/// [`is_wig32()`]: #method.is_wig32
	#[must_use]
	#[inline]
	pub fn w(&self) -> u32 {
		if (self.flags & Flags::W) != 0 {
			1
		} else {
			0
		}
	}

	/// (VEX/XOP/EVEX) `true` if the `L` / `L'L` fields are ignored.
	///
	/// EVEX: if reg-only ops and `{er}` (`EVEX.b` is set), `L'L` is the rounding control and not ignored.
	#[must_use]
	#[inline]
	pub fn is_lig(&self) -> bool {
		(self.flags & Flags::LIG) != 0
	}

	/// (VEX/XOP/EVEX) `true` if the `W` field is ignored in 16/32/64-bit modes
	#[must_use]
	#[inline]
	pub fn is_wig(&self) -> bool {
		(self.flags & Flags::WIG) != 0
	}

	/// (VEX/XOP/EVEX) `true` if the `W` field is ignored in 16/32-bit modes (but not 64-bit mode)
	#[must_use]
	#[inline]
	pub fn is_wig32(&self) -> bool {
		(self.flags & Flags::WIG32) != 0
	}

	/// (EVEX) Gets the tuple type
	#[must_use]
	#[inline]
	pub fn tuple_type(&self) -> TupleType {
		self.tuple_type
	}

	/// If it has a memory operand, gets the [`MemorySize`] (non-broadcast memory type)
	///
	/// [`MemorySize`]: enum.MemorySize.html
	#[must_use]
	#[inline]
	pub fn memory_size(&self) -> MemorySize {
		instruction_memory_sizes::SIZES_NORMAL[self.code() as usize]
	}

	/// If it has a memory operand, gets the [`MemorySize`] (broadcast memory type)
	///
	/// [`MemorySize`]: enum.MemorySize.html
	#[must_use]
	#[inline]
	pub fn broadcast_memory_size(&self) -> MemorySize {
		instruction_memory_sizes::SIZES_BCST[self.code() as usize]
	}

	/// (EVEX) `true` if the instruction supports broadcasting (`EVEX.b` bit) (if it has a memory operand)
	#[must_use]
	#[inline]
	pub fn can_broadcast(&self) -> bool {
		(self.enc_flags3 & EncFlags3::BROADCAST) != 0
	}

	/// (EVEX) `true` if the instruction supports rounding control
	#[must_use]
	#[inline]
	pub fn can_use_rounding_control(&self) -> bool {
		(self.enc_flags3 & EncFlags3::ROUNDING_CONTROL) != 0
	}

	/// (EVEX) `true` if the instruction supports suppress all exceptions
	#[must_use]
	#[inline]
	pub fn can_suppress_all_exceptions(&self) -> bool {
		(self.enc_flags3 & EncFlags3::SUPPRESS_ALL_EXCEPTIONS) != 0
	}

	/// (EVEX) `true` if an opmask register can be used
	#[must_use]
	#[inline]
	pub fn can_use_op_mask_register(&self) -> bool {
		(self.enc_flags3 & EncFlags3::OP_MASK_REGISTER) != 0
	}

	/// (EVEX) `true` if a non-zero opmask register must be used
	#[must_use]
	#[inline]
	pub fn require_op_mask_register(&self) -> bool {
		(self.enc_flags3 & EncFlags3::REQUIRE_OP_MASK_REGISTER) != 0
	}

	/// (EVEX) `true` if the instruction supports zeroing masking (if one of the opmask registers `K1`-`K7` is used and destination operand is not a memory operand)
	#[must_use]
	#[inline]
	pub fn can_use_zeroing_masking(&self) -> bool {
		(self.enc_flags3 & EncFlags3::ZEROING_MASKING) != 0
	}

	/// `true` if the `LOCK` (`F0`) prefix can be used
	#[must_use]
	#[inline]
	pub fn can_use_lock_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::LOCK) != 0
	}

	/// `true` if the `XACQUIRE` (`F2`) prefix can be used
	#[must_use]
	#[inline]
	pub fn can_use_xacquire_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::XACQUIRE) != 0
	}

	/// `true` if the `XRELEASE` (`F3`) prefix can be used
	#[must_use]
	#[inline]
	pub fn can_use_xrelease_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::XRELEASE) != 0
	}

	/// `true` if the `REP` / `REPE` (`F3`) prefixes can be used
	#[must_use]
	#[inline]
	pub fn can_use_rep_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::REP) != 0
	}

	/// `true` if the `REPNE` (`F2`) prefix can be used
	#[must_use]
	#[inline]
	pub fn can_use_repne_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::REPNE) != 0
	}

	/// `true` if the `BND` (`F2`) prefix can be used
	#[must_use]
	#[inline]
	pub fn can_use_bnd_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::BND) != 0
	}

	/// `true` if the `HINT-TAKEN` (`3E`) and `HINT-NOT-TAKEN` (`2E`) prefixes can be used
	#[must_use]
	#[inline]
	pub fn can_use_hint_taken_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::HINT_TAKEN) != 0
	}

	/// `true` if the `NOTRACK` (`3E`) prefix can be used
	#[must_use]
	#[inline]
	pub fn can_use_notrack_prefix(&self) -> bool {
		(self.enc_flags3 & EncFlags3::NOTRACK) != 0
	}

	/// `true` if rounding control is ignored (#UD is not generated)
	#[must_use]
	#[inline]
	pub fn ignores_rounding_control(&self) -> bool {
		(self.flags & Flags::IGNORES_ROUNDING_CONTROL) != 0
	}

	/// `true` if the `LOCK` prefix can be used as an extra register bit (bit 3) to access registers 8-15 without a `REX` prefix (eg. in 32-bit mode)
	#[must_use]
	#[inline]
	pub fn amd_lock_reg_bit(&self) -> bool {
		(self.flags & Flags::AMD_LOCK_REG_BIT) != 0
	}

	/// `true` if the default operand size is 64 in 64-bit mode. A `66` prefix can switch to 16-bit operand size.
	#[must_use]
	#[inline]
	pub fn default_op_size64(&self) -> bool {
		(self.enc_flags3 & EncFlags3::DEFAULT_OP_SIZE64) != 0
	}

	/// `true` if the operand size is always 64 in 64-bit mode. A `66` prefix is ignored.
	#[must_use]
	#[inline]
	pub fn force_op_size64(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::FORCE_OP_SIZE64) != 0
	}

	/// `true` if the Intel decoder forces 64-bit operand size. A `66` prefix is ignored.
	#[must_use]
	#[inline]
	pub fn intel_force_op_size64(&self) -> bool {
		(self.enc_flags3 & EncFlags3::INTEL_FORCE_OP_SIZE64) != 0
	}

	/// `true` if it can only be executed when CPL=0
	#[must_use]
	#[inline]
	pub fn must_be_cpl0(&self) -> bool {
		(self.flags & (Flags::CPL0 | Flags::CPL1 | Flags::CPL2 | Flags::CPL3)) == Flags::CPL0
	}

	/// `true` if it can be executed when CPL=0
	#[must_use]
	#[inline]
	pub fn cpl0(&self) -> bool {
		(self.flags & Flags::CPL0) != 0
	}

	/// `true` if it can be executed when CPL=1
	#[must_use]
	#[inline]
	pub fn cpl1(&self) -> bool {
		(self.flags & Flags::CPL1) != 0
	}

	/// `true` if it can be executed when CPL=2
	#[must_use]
	#[inline]
	pub fn cpl2(&self) -> bool {
		(self.flags & Flags::CPL2) != 0
	}

	/// `true` if it can be executed when CPL=3
	#[must_use]
	#[inline]
	pub fn cpl3(&self) -> bool {
		(self.flags & Flags::CPL3) != 0
	}

	/// `true` if the instruction accesses the I/O address space (eg. `IN`, `OUT`, `INS`, `OUTS`)
	#[must_use]
	#[inline]
	pub fn is_input_output(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::INPUT_OUTPUT) != 0
	}

	/// `true` if it's one of the many nop instructions (does not include FPU nop instructions, eg. `FNOP`)
	#[must_use]
	#[inline]
	pub fn is_nop(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::NOP) != 0
	}

	/// `true` if it's one of the many reserved nop instructions (eg. `0F0D`, `0F18-0F1F`)
	#[must_use]
	#[inline]
	pub fn is_reserved_nop(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::RESERVED_NOP) != 0
	}

	/// `true` if it's a serializing instruction (Intel CPUs)
	#[must_use]
	#[inline]
	pub fn is_serializing_intel(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::SERIALIZING_INTEL) != 0
	}

	/// `true` if it's a serializing instruction (AMD CPUs)
	#[must_use]
	#[inline]
	pub fn is_serializing_amd(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::SERIALIZING_AMD) != 0
	}

	/// `true` if the instruction requires either CPL=0 or CPL<=3 depending on some CPU option (eg. `CR4.TSD`, `CR4.PCE`, `CR4.UMIP`)
	#[must_use]
	#[inline]
	pub fn may_require_cpl0(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::MAY_REQUIRE_CPL0) != 0
	}

	/// `true` if it's a tracked `JMP`/`CALL` indirect instruction (CET)
	#[must_use]
	#[inline]
	pub fn is_cet_tracked(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::CET_TRACKED) != 0
	}

	/// `true` if it's a non-temporal hint memory access (eg. `MOVNTDQ`)
	#[must_use]
	#[inline]
	pub fn is_non_temporal(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::NON_TEMPORAL) != 0
	}

	/// `true` if it's a no-wait FPU instruction, eg. `FNINIT`
	#[must_use]
	#[inline]
	pub fn is_fpu_no_wait(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::FPU_NO_WAIT) != 0
	}

	/// `true` if the mod bits are ignored and it's assumed `modrm[7:6] == 11b`
	#[must_use]
	#[inline]
	pub fn ignores_mod_bits(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::IGNORES_MOD_BITS) != 0
	}

	/// `true` if the `66` prefix is not allowed (it will #UD)
	#[must_use]
	#[inline]
	pub fn no66(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::NO66) != 0
	}

	/// `true` if the `F2`/`F3` prefixes aren't allowed
	#[must_use]
	#[inline]
	pub fn nfx(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::NFX) != 0
	}

	/// `true` if the index reg's reg-num (vsib op) (if any) and register ops' reg-nums must be unique,
	/// eg. `MNEMONIC XMM1,YMM1,[RAX+ZMM1*2]` is invalid. Registers = `XMM`/`YMM`/`ZMM`/`TMM`.
	#[must_use]
	#[inline]
	pub fn requires_unique_reg_nums(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::REQUIRES_UNIQUE_REG_NUMS) != 0
	}

	/// `true` if the destination register's reg-num must not be present in any other operand, eg. `MNEMONIC XMM1,YMM1,[RAX+ZMM1*2]`
	/// is invalid. Registers = `XMM`/`YMM`/`ZMM`/`TMM`.
	#[must_use]
	#[inline]
	pub fn requires_unique_dest_reg_num(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::REQUIRES_UNIQUE_DEST_REG_NUM) != 0
	}

	/// `true` if it's a privileged instruction (all CPL=0 instructions (except `VMCALL`) and IOPL instructions `IN`, `INS`, `OUT`, `OUTS`, `CLI`, `STI`)
	#[must_use]
	#[inline]
	pub fn is_privileged(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::PRIVILEGED) != 0
	}

	/// `true` if it reads/writes too many registers
	#[must_use]
	#[inline]
	pub fn is_save_restore(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::SAVE_RESTORE) != 0
	}

	/// `true` if it's an instruction that implicitly uses the stack register, eg. `CALL`, `POP`, etc
	#[must_use]
	#[inline]
	pub fn is_stack_instruction(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::STACK_INSTRUCTION) != 0
	}

	/// `true` if the instruction doesn't read the segment register if it uses a memory operand
	#[must_use]
	#[inline]
	pub fn ignores_segment(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::IGNORES_SEGMENT) != 0
	}

	/// `true` if the opmask register is read and written (instead of just read). This also implies that it can't be `K0`.
	#[must_use]
	#[inline]
	pub fn is_op_mask_read_write(&self) -> bool {
		(self.opc_flags1 & OpCodeInfoFlags1::OP_MASK_READ_WRITE) != 0
	}

	/// `true` if it can be executed in real mode
	#[must_use]
	#[inline]
	pub fn real_mode(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::REAL_MODE) != 0
	}

	/// `true` if it can be executed in protected mode
	#[must_use]
	#[inline]
	pub fn protected_mode(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::PROTECTED_MODE) != 0
	}

	/// `true` if it can be executed in virtual 8086 mode
	#[must_use]
	#[inline]
	pub fn virtual8086_mode(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::VIRTUAL8086_MODE) != 0
	}

	/// `true` if it can be executed in compatibility mode
	#[must_use]
	#[inline]
	pub fn compatibility_mode(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::COMPATIBILITY_MODE) != 0
	}

	/// `true` if it can be executed in 64-bit mode
	#[must_use]
	#[inline]
	pub fn long_mode(&self) -> bool {
		(self.enc_flags3 & EncFlags3::BIT64) != 0
	}

	/// `true` if it can be used outside SMM
	#[must_use]
	#[inline]
	pub fn use_outside_smm(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_OUTSIDE_SMM) != 0
	}

	/// `true` if it can be used in SMM
	#[must_use]
	#[inline]
	pub fn use_in_smm(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_IN_SMM) != 0
	}

	/// `true` if it can be used outside an enclave (SGX)
	#[must_use]
	#[inline]
	pub fn use_outside_enclave_sgx(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_OUTSIDE_ENCLAVE_SGX) != 0
	}

	/// `true` if it can be used inside an enclave (SGX1)
	#[must_use]
	#[inline]
	pub fn use_in_enclave_sgx1(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_IN_ENCLAVE_SGX1) != 0
	}

	/// `true` if it can be used inside an enclave (SGX2)
	#[must_use]
	#[inline]
	pub fn use_in_enclave_sgx2(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_IN_ENCLAVE_SGX2) != 0
	}

	/// `true` if it can be used outside VMX operation
	#[must_use]
	#[inline]
	pub fn use_outside_vmx_op(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_OUTSIDE_VMX_OP) != 0
	}

	/// `true` if it can be used in VMX root operation
	#[must_use]
	#[inline]
	pub fn use_in_vmx_root_op(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_IN_VMX_ROOT_OP) != 0
	}

	/// `true` if it can be used in VMX non-root operation
	#[must_use]
	#[inline]
	pub fn use_in_vmx_non_root_op(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_IN_VMX_NON_ROOT_OP) != 0
	}

	/// `true` if it can be used outside SEAM
	#[must_use]
	#[inline]
	pub fn use_outside_seam(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_OUTSIDE_SEAM) != 0
	}

	/// `true` if it can be used in SEAM
	#[must_use]
	#[inline]
	pub fn use_in_seam(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::USE_IN_SEAM) != 0
	}

	/// `true` if #UD is generated in TDX non-root operation
	#[must_use]
	#[inline]
	pub fn tdx_non_root_gen_ud(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::TDX_NON_ROOT_GEN_UD) != 0
	}

	/// `true` if #VE is generated in TDX non-root operation
	#[must_use]
	#[inline]
	pub fn tdx_non_root_gen_ve(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::TDX_NON_ROOT_GEN_VE) != 0
	}

	/// `true` if an exception (eg. #GP(0), #VE) may be generated in TDX non-root operation
	#[must_use]
	#[inline]
	pub fn tdx_non_root_may_gen_ex(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::TDX_NON_ROOT_MAY_GEN_EX) != 0
	}

	/// (Intel VMX) `true` if it causes a VM exit in VMX non-root operation
	#[must_use]
	#[inline]
	pub fn intel_vm_exit(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::INTEL_VM_EXIT) != 0
	}

	/// (Intel VMX) `true` if it may cause a VM exit in VMX non-root operation
	#[must_use]
	#[inline]
	pub fn intel_may_vm_exit(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::INTEL_MAY_VM_EXIT) != 0
	}

	/// (Intel VMX) `true` if it causes an SMM VM exit in VMX root operation (if dual-monitor treatment is activated)
	#[must_use]
	#[inline]
	pub fn intel_smm_vm_exit(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::INTEL_SMM_VM_EXIT) != 0
	}

	/// (AMD SVM) `true` if it causes a #VMEXIT in guest mode
	#[must_use]
	#[inline]
	pub fn amd_vm_exit(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::AMD_VM_EXIT) != 0
	}

	/// (AMD SVM) `true` if it may cause a #VMEXIT in guest mode
	#[must_use]
	#[inline]
	pub fn amd_may_vm_exit(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::AMD_MAY_VM_EXIT) != 0
	}

	/// `true` if it causes a TSX abort inside a TSX transaction
	#[must_use]
	#[inline]
	pub fn tsx_abort(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::TSX_ABORT) != 0
	}

	/// `true` if it causes a TSX abort inside a TSX transaction depending on the implementation
	#[must_use]
	#[inline]
	pub fn tsx_impl_abort(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::TSX_IMPL_ABORT) != 0
	}

	/// `true` if it may cause a TSX abort inside a TSX transaction depending on some condition
	#[must_use]
	#[inline]
	pub fn tsx_may_abort(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::TSX_MAY_ABORT) != 0
	}

	/// `true` if it's decoded by iced's 16-bit Intel decoder
	#[must_use]
	#[inline]
	pub fn intel_decoder16(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::INTEL_DECODER16OR32) != 0
	}

	/// `true` if it's decoded by iced's 32-bit Intel decoder
	#[must_use]
	#[inline]
	pub fn intel_decoder32(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::INTEL_DECODER16OR32) != 0
	}

	/// `true` if it's decoded by iced's 64-bit Intel decoder
	#[must_use]
	#[inline]
	pub fn intel_decoder64(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::INTEL_DECODER64) != 0
	}

	/// `true` if it's decoded by iced's 16-bit AMD decoder
	#[must_use]
	#[inline]
	pub fn amd_decoder16(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::AMD_DECODER16OR32) != 0
	}

	/// `true` if it's decoded by iced's 32-bit AMD decoder
	#[must_use]
	#[inline]
	pub fn amd_decoder32(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::AMD_DECODER16OR32) != 0
	}

	/// `true` if it's decoded by iced's 64-bit AMD decoder
	#[must_use]
	#[inline]
	pub fn amd_decoder64(&self) -> bool {
		(self.opc_flags2 & OpCodeInfoFlags2::AMD_DECODER64) != 0
	}

	/// Gets the decoder option that's needed to decode the instruction or [`DecoderOptions::NONE`].
	/// The return value is a [`DecoderOptions`] value.
	///
	/// [`DecoderOptions::NONE`]: struct.DecoderOptions.html#associatedconstant.NONE
	/// [`DecoderOptions`]: struct.DecoderOptions.html
	#[cfg(feature = "decoder")]
	#[must_use]
	#[inline]
	pub fn decoder_option(&self) -> u32 {
		// SAFETY: `opc_flags1` is generated and only contains valid enum variants
		let dec_opt_value: DecOptionValue = unsafe {
			mem::transmute(((self.opc_flags1 >> OpCodeInfoFlags1::DEC_OPTION_VALUE_SHIFT) & OpCodeInfoFlags1::DEC_OPTION_VALUE_MASK) as u8)
		};
		TO_DECODER_OPTIONS[dec_opt_value as usize]
	}

	/// Gets the opcode table
	#[must_use]
	#[inline]
	pub fn table(&self) -> OpCodeTableKind {
		self.table
	}

	/// Gets the mandatory prefix
	#[must_use]
	#[inline]
	pub fn mandatory_prefix(&self) -> MandatoryPrefix {
		self.mandatory_prefix
	}

	/// Gets the opcode byte(s). The low byte(s) of this value is the opcode. The length is in [`op_code_len()`].
	/// It doesn't include the table value, see [`table()`].
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// assert_eq!(Code::Ffreep_sti.op_code().op_code(), 0xDFC0);
	/// assert_eq!(Code::Vmrunw.op_code().op_code(), 0x01D8);
	/// assert_eq!(Code::Sub_r8_rm8.op_code().op_code(), 0x2A);
	/// assert_eq!(Code::Cvtpi2ps_xmm_mmm64.op_code().op_code(), 0x2A);
	/// ```
	///
	/// [`op_code_len()`]: #method.op_code_len
	/// [`table()`]: #method.table
	#[must_use]
	#[inline]
	pub fn op_code(&self) -> u32 {
		self.op_code as u32
	}

	/// Gets the length of the opcode bytes ([`op_code()`]). The low bytes is the opcode value.
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// assert_eq!(Code::Ffreep_sti.op_code().op_code_len(), 2);
	/// assert_eq!(Code::Vmrunw.op_code().op_code_len(), 2);
	/// assert_eq!(Code::Sub_r8_rm8.op_code().op_code_len(), 1);
	/// assert_eq!(Code::Cvtpi2ps_xmm_mmm64.op_code().op_code_len(), 1);
	/// ```
	///
	/// [`op_code()`]: #method.op_code
	#[must_use]
	#[inline]
	pub fn op_code_len(&self) -> u32 {
		if (self.enc_flags2 & EncFlags2::OP_CODE_IS2_BYTES) != 0 {
			2
		} else {
			1
		}
	}

	/// `true` if it's part of a group
	#[must_use]
	#[inline]
	pub fn is_group(&self) -> bool {
		self.group_index >= 0
	}

	/// Group index (0-7) or -1. If it's 0-7, it's stored in the `reg` field of the `modrm` byte.
	#[must_use]
	#[inline]
	pub fn group_index(&self) -> i32 {
		self.group_index as i32
	}

	/// `true` if it's part of a modrm.rm group
	#[must_use]
	#[inline]
	pub fn is_rm_group(&self) -> bool {
		self.rm_group_index >= 0
	}

	/// Group index (0-7) or -1. If it's 0-7, it's stored in the `rm` field of the `modrm` byte.
	#[must_use]
	#[inline]
	pub fn rm_group_index(&self) -> i32 {
		self.rm_group_index as i32
	}

	/// Gets the number of operands
	#[must_use]
	#[inline]
	pub fn op_count(&self) -> u32 {
		instruction_op_counts::OP_COUNT[self.code() as usize] as u32
	}

	/// Gets operand #0's opkind
	#[must_use]
	#[inline]
	pub fn op0_kind(&self) -> OpCodeOperandKind {
		self.op_kinds[0]
	}

	/// Gets operand #1's opkind
	#[must_use]
	#[inline]
	pub fn op1_kind(&self) -> OpCodeOperandKind {
		self.op_kinds[1]
	}

	/// Gets operand #2's opkind
	#[must_use]
	#[inline]
	pub fn op2_kind(&self) -> OpCodeOperandKind {
		self.op_kinds[2]
	}

	/// Gets operand #3's opkind
	#[must_use]
	#[inline]
	pub fn op3_kind(&self) -> OpCodeOperandKind {
		self.op_kinds[3]
	}

	/// Gets operand #4's opkind
	#[must_use]
	#[inline]
	pub fn op4_kind(&self) -> OpCodeOperandKind {
		self.op_kinds[4]
	}

	/// Gets an operand's opkind
	///
	/// # Arguments
	///
	/// * `operand`: Operand number, 0-4
	#[must_use]
	#[inline]
	pub fn op_kind(&self, operand: u32) -> OpCodeOperandKind {
		match self.op_kinds.get(operand as usize) {
			Some(&op_access) => op_access,
			None => {
				debug_assert!(false, "Invalid operand: {}", operand);
				OpCodeOperandKind::default()
			}
		}
	}

	#[inline]
	#[allow(clippy::missing_inline_in_public_items)]
	#[doc(hidden)]
	pub fn try_op_kind(&self, operand: u32) -> Result<OpCodeOperandKind, IcedError> {
		match self.op_kinds.get(operand as usize) {
			Some(&op_access) => Ok(op_access),
			None => Err(IcedError::new("Invalid operand")),
		}
	}

	/// Gets all operand kinds
	#[must_use]
	#[inline]
	pub fn op_kinds(&self) -> &[OpCodeOperandKind] {
		&self.op_kinds[0..self.op_count() as usize]
	}

	/// Checks if the instruction is available in 16-bit mode, 32-bit mode or 64-bit mode
	///
	/// # Arguments
	///
	/// * `bitness`: 16, 32 or 64
	#[must_use]
	#[allow(clippy::missing_inline_in_public_items)]
	pub fn is_available_in_mode(&self, bitness: u32) -> bool {
		match bitness {
			16 => self.mode16(),
			32 => self.mode32(),
			64 => self.mode64(),
			_ => false,
		}
	}

	/// Gets the opcode string, eg. `VEX.128.66.0F38.W0 78 /r`, see also [`instruction_string()`]
	///
	/// [`instruction_string()`]: #method.instruction_string
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// let op_code = Code::EVEX_Vmovapd_ymm_k1z_ymmm256.op_code();
	/// assert_eq!(op_code.op_code_string(), "EVEX.256.66.0F.W1 28 /r");
	/// ```
	#[must_use]
	#[inline]
	pub fn op_code_string(&self) -> &str {
		self.op_code_string.as_str()
	}

	/// Gets the instruction string, eg. `VPBROADCASTB xmm1, xmm2/m8`, see also [`op_code_string()`]
	///
	/// [`op_code_string()`]: #method.op_code_string
	///
	/// # Examples
	///
	/// ```
	/// use iced_x86::*;
	///
	/// let op_code = Code::EVEX_Vmovapd_ymm_k1z_ymmm256.op_code();
	/// assert_eq!(op_code.instruction_string(), "VMOVAPD ymm1 {k1}{z}, ymm2/m256");
	/// ```
	#[must_use]
	#[inline]
	pub fn instruction_string(&self) -> &str {
		self.instruction_string.as_str()
	}
}

impl fmt::Display for OpCodeInfo {
	#[inline]
	fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
		write!(f, "{}", self.instruction_string)
	}
}
