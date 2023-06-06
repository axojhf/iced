// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

@SuppressWarnings("cast")
final class CodeAssembler64GenHTests extends CodeAssemblerTestsBase {
	CodeAssembler64GenHTests() {
		super(64);
	}

	@Test
	void haddpd_xmm_xmm() {
		testAssembler(c -> c.haddpd(xmm2, xmm3), Instruction.create(Code.HADDPD_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void haddpd_xmm_m() {
		testAssembler(c -> c.haddpd(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.HADDPD_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void haddps_xmm_xmm() {
		testAssembler(c -> c.haddps(xmm2, xmm3), Instruction.create(Code.HADDPS_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void haddps_xmm_m() {
		testAssembler(c -> c.haddps(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.HADDPS_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void hlt() {
		testAssembler(c -> c.hlt(), Instruction.create(Code.HLT));
	}

	@Test
	void hreset_i() {
		testAssembler(c -> c.hreset(-5), Instruction.create(Code.HRESET_IMM8, -5));
	}

	@Test
	void hsubpd_xmm_xmm() {
		testAssembler(c -> c.hsubpd(xmm2, xmm3), Instruction.create(Code.HSUBPD_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void hsubpd_xmm_m() {
		testAssembler(c -> c.hsubpd(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.HSUBPD_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void hsubps_xmm_xmm() {
		testAssembler(c -> c.hsubps(xmm2, xmm3), Instruction.create(Code.HSUBPS_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void hsubps_xmm_m() {
		testAssembler(c -> c.hsubps(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.HSUBPS_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhaddpd_xmm_xmm_xmm() {
		testAssembler(c -> c.vhaddpd(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VHADDPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4));
	}

	@Test
	void vhaddpd_ymm_ymm_ymm() {
		testAssembler(c -> c.vhaddpd(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VHADDPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4));
	}

	@Test
	void vhaddpd_xmm_xmm_m() {
		testAssembler(c -> c.vhaddpd(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHADDPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhaddpd_ymm_ymm_m() {
		testAssembler(c -> c.vhaddpd(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHADDPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhaddps_xmm_xmm_xmm() {
		testAssembler(c -> c.vhaddps(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VHADDPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4));
	}

	@Test
	void vhaddps_ymm_ymm_ymm() {
		testAssembler(c -> c.vhaddps(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VHADDPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4));
	}

	@Test
	void vhaddps_xmm_xmm_m() {
		testAssembler(c -> c.vhaddps(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHADDPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhaddps_ymm_ymm_m() {
		testAssembler(c -> c.vhaddps(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHADDPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhsubpd_xmm_xmm_xmm() {
		testAssembler(c -> c.vhsubpd(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VHSUBPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4));
	}

	@Test
	void vhsubpd_ymm_ymm_ymm() {
		testAssembler(c -> c.vhsubpd(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VHSUBPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4));
	}

	@Test
	void vhsubpd_xmm_xmm_m() {
		testAssembler(c -> c.vhsubpd(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHSUBPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhsubpd_ymm_ymm_m() {
		testAssembler(c -> c.vhsubpd(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHSUBPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhsubps_xmm_xmm_xmm() {
		testAssembler(c -> c.vhsubps(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VHSUBPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4));
	}

	@Test
	void vhsubps_ymm_ymm_ymm() {
		testAssembler(c -> c.vhsubps(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VHSUBPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4));
	}

	@Test
	void vhsubps_xmm_xmm_m() {
		testAssembler(c -> c.vhsubps(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHSUBPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vhsubps_ymm_ymm_m() {
		testAssembler(c -> c.vhsubps(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VHSUBPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

}
