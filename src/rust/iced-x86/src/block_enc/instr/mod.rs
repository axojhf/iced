// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

mod call_instr;
mod ip_relmem_instr;
mod jcc_instr;
mod jmp_instr;
mod simple_br_instr;
mod simple_instr;
mod xbegin_instr;

use crate::block_enc::block::{Block, BlockData};
use crate::block_enc::instr::call_instr::CallInstr;
use crate::block_enc::instr::ip_relmem_instr::IpRelMemOpInstr;
use crate::block_enc::instr::jcc_instr::JccInstr;
use crate::block_enc::instr::jmp_instr::JmpInstr;
use crate::block_enc::instr::simple_br_instr::SimpleBranchInstr;
use crate::block_enc::instr::simple_instr::SimpleInstr;
use crate::block_enc::instr::xbegin_instr::XbeginInstr;
use crate::block_enc::*;
use crate::iced_error::IcedError;
use alloc::rc::Rc;
use alloc::string::String;
use core::cell::RefCell;
use core::fmt::Display;
use core::i32;

pub(super) trait Instr {
	fn block(&self) -> Rc<RefCell<Block>>;
	fn size(&self) -> u32;
	fn ip(&self) -> u64;
	fn set_ip(&mut self, new_ip: u64);
	fn orig_ip(&self) -> u64;

	/// Initializes the target address and tries to optimize the instruction
	fn initialize(&mut self, block_encoder: &BlockEncoder);

	/// Returns `true` if the instruction was updated to a shorter instruction, `false` if nothing changed
	fn optimize(&mut self, gained: u64) -> bool;

	fn encode(&mut self, block: &mut Block) -> Result<(ConstantOffsets, bool), IcedError>;
}

fn correct_diff(in_block: bool, diff: i64, gained: u64) -> i64 {
	if in_block && diff >= gained as i64 {
		diff - gained as i64
	} else {
		diff
	}
}

pub(super) enum TargetInstr {
	Uninitialized,
	Instruction(Rc<RefCell<dyn Instr>>),
	Address(u64),
	IsOwner,
}

impl Default for TargetInstr {
	fn default() -> Self {
		Self::Uninitialized
	}
}

impl TargetInstr {
	#[inline]
	pub(super) fn new_instr(instruction: Rc<RefCell<dyn Instr>>) -> Self {
		TargetInstr::Instruction(instruction)
	}

	#[inline]
	pub(super) fn new_address(address: u64) -> Self {
		TargetInstr::Address(address)
	}

	#[inline]
	pub(super) fn new_owner() -> Self {
		TargetInstr::IsOwner
	}

	fn is_in_block(&self, block: Rc<RefCell<Block>>) -> bool {
		match self {
			TargetInstr::Instruction(instr) => Rc::ptr_eq(&instr.borrow().block(), &block),
			TargetInstr::Address(_) => false,
			// The owner checks if the input block is part of its block, so return true
			TargetInstr::IsOwner => true,
			TargetInstr::Uninitialized => unreachable!(),
		}
	}

	fn address(&self, owner: &dyn Instr) -> u64 {
		match self {
			TargetInstr::Instruction(instr) => instr.borrow().ip(),
			TargetInstr::Address(address) => *address,
			TargetInstr::IsOwner => owner.ip(),
			TargetInstr::Uninitialized => unreachable!(),
		}
	}
}

pub(super) struct InstrUtils;
impl InstrUtils {
	// 6 = FF 15 XXXXXXXX = call qword ptr [rip+mem_target]
	const CALL_OR_JMP_POINTER_DATA_INSTRUCTION_SIZE64: u32 = 6;

	#[cfg(any(feature = "gas", feature = "intel", feature = "masm", feature = "nasm"))]
	fn create_error_message<T: Display>(error_message: T, instruction: &Instruction) -> String {
		format!("{} : 0x{:X} {}", error_message, instruction.ip(), instruction)
	}

	#[cfg(not(any(feature = "gas", feature = "intel", feature = "masm", feature = "nasm")))]
	fn create_error_message<T: Display>(error_message: T, instruction: &Instruction) -> String {
		format!("{} : 0x{:X}", error_message, instruction.ip())
	}

	pub(super) fn create(block_encoder: &mut BlockEncoder, block: Rc<RefCell<Block>>, instruction: &Instruction) -> Rc<RefCell<dyn Instr>> {
		#[cfg_attr(feature = "cargo-fmt", rustfmt::skip)]
		match instruction.code() {
			// GENERATOR-BEGIN: JccInstr
			// ⚠️This was generated by GENERATOR!🦹‍♂️
			Code::Jo_rel8_16
			| Code::Jo_rel8_32
			| Code::Jo_rel8_64
			| Code::Jno_rel8_16
			| Code::Jno_rel8_32
			| Code::Jno_rel8_64
			| Code::Jb_rel8_16
			| Code::Jb_rel8_32
			| Code::Jb_rel8_64
			| Code::Jae_rel8_16
			| Code::Jae_rel8_32
			| Code::Jae_rel8_64
			| Code::Je_rel8_16
			| Code::Je_rel8_32
			| Code::Je_rel8_64
			| Code::Jne_rel8_16
			| Code::Jne_rel8_32
			| Code::Jne_rel8_64
			| Code::Jbe_rel8_16
			| Code::Jbe_rel8_32
			| Code::Jbe_rel8_64
			| Code::Ja_rel8_16
			| Code::Ja_rel8_32
			| Code::Ja_rel8_64
			| Code::Js_rel8_16
			| Code::Js_rel8_32
			| Code::Js_rel8_64
			| Code::Jns_rel8_16
			| Code::Jns_rel8_32
			| Code::Jns_rel8_64
			| Code::Jp_rel8_16
			| Code::Jp_rel8_32
			| Code::Jp_rel8_64
			| Code::Jnp_rel8_16
			| Code::Jnp_rel8_32
			| Code::Jnp_rel8_64
			| Code::Jl_rel8_16
			| Code::Jl_rel8_32
			| Code::Jl_rel8_64
			| Code::Jge_rel8_16
			| Code::Jge_rel8_32
			| Code::Jge_rel8_64
			| Code::Jle_rel8_16
			| Code::Jle_rel8_32
			| Code::Jle_rel8_64
			| Code::Jg_rel8_16
			| Code::Jg_rel8_32
			| Code::Jg_rel8_64
			| Code::Jo_rel16
			| Code::Jo_rel32_32
			| Code::Jo_rel32_64
			| Code::Jno_rel16
			| Code::Jno_rel32_32
			| Code::Jno_rel32_64
			| Code::Jb_rel16
			| Code::Jb_rel32_32
			| Code::Jb_rel32_64
			| Code::Jae_rel16
			| Code::Jae_rel32_32
			| Code::Jae_rel32_64
			| Code::Je_rel16
			| Code::Je_rel32_32
			| Code::Je_rel32_64
			| Code::Jne_rel16
			| Code::Jne_rel32_32
			| Code::Jne_rel32_64
			| Code::Jbe_rel16
			| Code::Jbe_rel32_32
			| Code::Jbe_rel32_64
			| Code::Ja_rel16
			| Code::Ja_rel32_32
			| Code::Ja_rel32_64
			| Code::Js_rel16
			| Code::Js_rel32_32
			| Code::Js_rel32_64
			| Code::Jns_rel16
			| Code::Jns_rel32_32
			| Code::Jns_rel32_64
			| Code::Jp_rel16
			| Code::Jp_rel32_32
			| Code::Jp_rel32_64
			| Code::Jnp_rel16
			| Code::Jnp_rel32_32
			| Code::Jnp_rel32_64
			| Code::Jl_rel16
			| Code::Jl_rel32_32
			| Code::Jl_rel32_64
			| Code::Jge_rel16
			| Code::Jge_rel32_32
			| Code::Jge_rel32_64
			| Code::Jle_rel16
			| Code::Jle_rel32_32
			| Code::Jle_rel32_64
			| Code::Jg_rel16
			| Code::Jg_rel32_32
			| Code::Jg_rel32_64
			=> return Rc::new(RefCell::new(JccInstr::new(block_encoder, block, instruction))),
			// GENERATOR-END: JccInstr

			// GENERATOR-BEGIN: SimpleBranchInstr
			// ⚠️This was generated by GENERATOR!🦹‍♂️
			Code::Loopne_rel8_16_CX
			| Code::Loopne_rel8_32_CX
			| Code::Loopne_rel8_16_ECX
			| Code::Loopne_rel8_32_ECX
			| Code::Loopne_rel8_64_ECX
			| Code::Loopne_rel8_16_RCX
			| Code::Loopne_rel8_64_RCX
			| Code::Loope_rel8_16_CX
			| Code::Loope_rel8_32_CX
			| Code::Loope_rel8_16_ECX
			| Code::Loope_rel8_32_ECX
			| Code::Loope_rel8_64_ECX
			| Code::Loope_rel8_16_RCX
			| Code::Loope_rel8_64_RCX
			| Code::Loop_rel8_16_CX
			| Code::Loop_rel8_32_CX
			| Code::Loop_rel8_16_ECX
			| Code::Loop_rel8_32_ECX
			| Code::Loop_rel8_64_ECX
			| Code::Loop_rel8_16_RCX
			| Code::Loop_rel8_64_RCX
			| Code::Jcxz_rel8_16
			| Code::Jcxz_rel8_32
			| Code::Jecxz_rel8_16
			| Code::Jecxz_rel8_32
			| Code::Jecxz_rel8_64
			| Code::Jrcxz_rel8_16
			| Code::Jrcxz_rel8_64
			=> return Rc::new(RefCell::new(SimpleBranchInstr::new(block_encoder, block, instruction))),
			// GENERATOR-END: SimpleBranchInstr

			// GENERATOR-BEGIN: CallInstr
			// ⚠️This was generated by GENERATOR!🦹‍♂️
			Code::Call_rel16
			| Code::Call_rel32_32
			| Code::Call_rel32_64
			=> return Rc::new(RefCell::new(CallInstr::new(block_encoder, block, instruction))),
			// GENERATOR-END: CallInstr

			// GENERATOR-BEGIN: JmpInstr
			// ⚠️This was generated by GENERATOR!🦹‍♂️
			Code::Jmp_rel16
			| Code::Jmp_rel32_32
			| Code::Jmp_rel32_64
			| Code::Jmp_rel8_16
			| Code::Jmp_rel8_32
			| Code::Jmp_rel8_64
			=> return Rc::new(RefCell::new(JmpInstr::new(block_encoder, block, instruction))),
			// GENERATOR-END: JmpInstr

			// GENERATOR-BEGIN: XbeginInstr
			// ⚠️This was generated by GENERATOR!🦹‍♂️
			Code::Xbegin_rel16
			| Code::Xbegin_rel32
			=> return Rc::new(RefCell::new(XbeginInstr::new(block_encoder, block, instruction))),
			// GENERATOR-END: XbeginInstr

			_ => {},
		}

		if block_encoder.bitness() == 64 {
			for i in 0..instruction.op_count() {
				if let Ok(op_kind) = instruction.try_op_kind(i) {
					if op_kind == OpKind::Memory {
						if instruction.is_ip_rel_memory_operand() {
							return Rc::new(RefCell::new(IpRelMemOpInstr::new(block_encoder, block, instruction)));
						}
						break;
					}
				}
			}
		}

		Rc::new(RefCell::new(SimpleInstr::new(block_encoder, block, instruction)))
	}

	fn encode_branch_to_pointer_data(
		block: &mut Block, is_call: bool, ip: u64, pointer_data: Rc<RefCell<BlockData>>, min_size: u32,
	) -> Result<u32, IcedError> {
		if min_size > i32::MAX as u32 {
			return Err(IcedError::new("Internal error"));
		}

		let mut instr = Instruction::default();
		instr.set_op0_kind(OpKind::Memory);
		instr.set_memory_displ_size(block.encoder.bitness() / 8);
		let reloc_kind;
		match block.encoder.bitness() {
			64 => {
				instr.set_code(if is_call { Code::Call_rm64 } else { Code::Jmp_rm64 });
				instr.set_memory_base(Register::RIP);

				let target_addr = pointer_data.borrow().address()?;
				let next_rip = ip.wrapping_add(Self::CALL_OR_JMP_POINTER_DATA_INSTRUCTION_SIZE64 as u64);
				let diff = target_addr.wrapping_sub(next_rip) as i64;
				if !(i32::MIN as i64 <= diff && diff <= i32::MAX as i64) {
					return Err(IcedError::new("Block is too big"));
				}

				instr.set_memory_displacement64(target_addr);
				reloc_kind = RelocKind::Offset64;
			}

			_ => unreachable!(),
		}

		let mut size = block.encoder.encode(&instr, ip)? as u32;
		if block.can_add_reloc_infos() && reloc_kind != RelocKind::Offset64 {
			let co = block.encoder.get_constant_offsets();
			if !co.has_displacement() {
				return Err(IcedError::new("Internal error"));
			}
			block.add_reloc_info(RelocInfo::new(reloc_kind, ip.wrapping_add(co.displacement_offset() as u64)));
		}
		while size < min_size {
			size += 1;
			block.write_byte(0x90);
		}
		Ok(size)
	}
}
