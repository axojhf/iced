// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

@SuppressWarnings("cast")
final class CodeAssembler16GenTTests extends CodeAssemblerTestsBase {
	CodeAssembler16GenTTests() {
		super(16);
	}

	@Test
	void t1mskc_r32_r32() {
		testAssembler(c -> c.t1mskc(edx, ebx), Instruction.create(Code.XOP_T1MSKC_R32_RM32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void t1mskc_r32_m() {
		testAssembler(c -> c.t1mskc(edx, dword_ptr(0x0L).base(si)), Instruction.create(Code.XOP_T1MSKC_R32_RM32, ICRegisters.edx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void tdcall() {
		testAssembler(c -> c.tdcall(), Instruction.create(Code.TDCALL));
	}

	@Test
	void test_r8_r8() {
		testAssembler(c -> c.test(dl, bl), Instruction.create(Code.TEST_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void test_m_r8() {
		testAssembler(c -> c.test(byte_ptr(0x0L).base(si), bl), Instruction.create(Code.TEST_RM8_R8, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void test_r16_r16() {
		testAssembler(c -> c.test(dx, bx), Instruction.create(Code.TEST_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void test_m_r16() {
		testAssembler(c -> c.test(word_ptr(0x0L).base(si), bx), Instruction.create(Code.TEST_RM16_R16, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void test_r32_r32() {
		testAssembler(c -> c.test(edx, ebx), Instruction.create(Code.TEST_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void test_m_r32() {
		testAssembler(c -> c.test(dword_ptr(0x0L).base(si), ebx), Instruction.create(Code.TEST_RM32_R32, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void test_r8_i() {
		{ /* if (dst.getRegister() == Register.AL) */
			testAssembler(c -> c.test(al, -5), Instruction.create(Code.TEST_AL_IMM8, ICRegisters.al, -5));
		} /* else */ testAssembler(c -> c.test(dl, -5), Instruction.create(Code.TEST_RM8_IMM8, ICRegisters.dl, -5));
	}

	@Test
	void test_r16_i() {
		{ /* if (dst.getRegister() == Register.AX) */
			testAssembler(c -> c.test(ax, 0x40B7), Instruction.create(Code.TEST_AX_IMM16, ICRegisters.ax, 0x40B7));
		} /* else */ testAssembler(c -> c.test(dx, 0x40B7), Instruction.create(Code.TEST_RM16_IMM16, ICRegisters.dx, 0x40B7));
	}

	@Test
	void test_r32_i() {
		{ /* if (dst.getRegister() == Register.EAX) */
			testAssembler(c -> c.test(eax, 0x7FFFFFFF), Instruction.create(Code.TEST_EAX_IMM32, ICRegisters.eax, 0x7FFFFFFF));
		} /* else */ testAssembler(c -> c.test(edx, 0x7FFFFFFF), Instruction.create(Code.TEST_RM32_IMM32, ICRegisters.edx, 0x7FFFFFFF));
	}

	@Test
	void test_m_i() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			// Skipping TEST_RM64_IMM32 - Not supported by current bitness
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			testAssembler(c -> c.test(dword_ptr(0x0L).base(di), 0x7FFFFFFF), Instruction.create(Code.TEST_RM32_IMM32, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7FFFFFFF));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			testAssembler(c -> c.test(word_ptr(0x0L).base(di), 0x40B7), Instruction.create(Code.TEST_RM16_IMM16, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x40B7));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.test(byte_ptr(0x0L).base(di), -5), Instruction.create(Code.TEST_RM8_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.test(zmmword_ptr(0x0L).base(di), -5), Instruction.create(Code.TEST_RM8_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
			});
		}
	}

	@Test
	void tlbsync() {
		testAssembler(c -> c.tlbsync(), Instruction.create(Code.TLBSYNC));
	}

	@Test
	void tpause_r32() {
		testAssembler(c -> c.tpause(edx), Instruction.create(Code.TPAUSE_R32, ICRegisters.edx));
	}

	@Test
	void tzcnt_r16_r16() {
		testAssembler(c -> c.tzcnt(dx, bx), Instruction.create(Code.TZCNT_R16_RM16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void tzcnt_r32_r32() {
		testAssembler(c -> c.tzcnt(edx, ebx), Instruction.create(Code.TZCNT_R32_RM32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void tzcnt_r16_m() {
		testAssembler(c -> c.tzcnt(dx, word_ptr(0x0L).base(si)), Instruction.create(Code.TZCNT_R16_RM16, ICRegisters.dx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void tzcnt_r32_m() {
		testAssembler(c -> c.tzcnt(edx, dword_ptr(0x0L).base(si)), Instruction.create(Code.TZCNT_R32_RM32, ICRegisters.edx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void tzmsk_r32_r32() {
		testAssembler(c -> c.tzmsk(edx, ebx), Instruction.create(Code.XOP_TZMSK_R32_RM32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void tzmsk_r32_m() {
		testAssembler(c -> c.tzmsk(edx, dword_ptr(0x0L).base(si)), Instruction.create(Code.XOP_TZMSK_R32_RM32, ICRegisters.edx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vtestpd_xmm_xmm() {
		testAssembler(c -> c.vtestpd(xmm2, xmm3), Instruction.create(Code.VEX_VTESTPD_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void vtestpd_ymm_ymm() {
		testAssembler(c -> c.vtestpd(ymm2, ymm3), Instruction.create(Code.VEX_VTESTPD_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3));
	}

	@Test
	void vtestpd_xmm_m() {
		testAssembler(c -> c.vtestpd(xmm2, xmmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VTESTPD_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vtestpd_ymm_m() {
		testAssembler(c -> c.vtestpd(ymm2, ymmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VTESTPD_YMM_YMMM256, ICRegisters.ymm2, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vtestps_xmm_xmm() {
		testAssembler(c -> c.vtestps(xmm2, xmm3), Instruction.create(Code.VEX_VTESTPS_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void vtestps_ymm_ymm() {
		testAssembler(c -> c.vtestps(ymm2, ymm3), Instruction.create(Code.VEX_VTESTPS_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3));
	}

	@Test
	void vtestps_xmm_m() {
		testAssembler(c -> c.vtestps(xmm2, xmmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VTESTPS_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void vtestps_ymm_m() {
		testAssembler(c -> c.vtestps(ymm2, ymmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VTESTPS_YMM_YMMM256, ICRegisters.ymm2, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

}
