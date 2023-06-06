// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

@SuppressWarnings("cast")
final class CodeAssembler32GenOTests extends CodeAssemblerTestsBase {
	CodeAssembler32GenOTests() {
		super(32);
	}

	@Test
	void or_r8_r8() {
		testAssembler(c -> c.or(dl, bl), Instruction.create(Code.OR_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void or_m_r8() {
		testAssembler(c -> c.or(byte_ptr(0x0L).base(ecx), bl), Instruction.create(Code.OR_RM8_R8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void or_r16_r16() {
		testAssembler(c -> c.or(dx, bx), Instruction.create(Code.OR_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void or_m_r16() {
		testAssembler(c -> c.or(word_ptr(0x0L).base(ecx), bx), Instruction.create(Code.OR_RM16_R16, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void or_r32_r32() {
		testAssembler(c -> c.or(edx, ebx), Instruction.create(Code.OR_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void or_m_r32() {
		testAssembler(c -> c.or(dword_ptr(0x0L).base(ecx), ebx), Instruction.create(Code.OR_RM32_R32, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void or_r8_m() {
		testAssembler(c -> c.or(dl, byte_ptr(0x0L).base(ecx)), Instruction.create(Code.OR_R8_RM8, ICRegisters.dl, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void or_r16_m() {
		testAssembler(c -> c.or(dx, word_ptr(0x0L).base(ecx)), Instruction.create(Code.OR_R16_RM16, ICRegisters.dx, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void or_r32_m() {
		testAssembler(c -> c.or(edx, dword_ptr(0x0L).base(ecx)), Instruction.create(Code.OR_R32_RM32, ICRegisters.edx, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void or_r8_i() {
		{ /* if (dst.getRegister() == Register.AL) */
			testAssembler(c -> c.or(al, -5), Instruction.create(Code.OR_AL_IMM8, ICRegisters.al, -5));
		} /* else */ testAssembler(c -> c.or(dl, -5), Instruction.create(Code.OR_RM8_IMM8, ICRegisters.dl, -5));
	}

	@Test
	void or_r16_i() {
		{ /* if (dst.getRegister() == Register.AX) */
			testAssembler(c -> c.or(ax, 0x40B7), Instruction.create(Code.OR_AX_IMM16, ICRegisters.ax, 0x40B7));
		} /* else */ { /* if (imm >= -0x80 && imm <= 0x7F) */
			testAssembler(c -> c.or(dx, -0x80), Instruction.create(Code.OR_RM16_IMM8, ICRegisters.dx, -0x80));
			testAssembler(c -> c.or(dx, 0x7F), Instruction.create(Code.OR_RM16_IMM8, ICRegisters.dx, 0x7F));
		} /* else */ testAssembler(c -> c.or(dx, 0x40B7), Instruction.create(Code.OR_RM16_IMM16, ICRegisters.dx, 0x40B7));
	}

	@Test
	void or_r32_i() {
		{ /* if (dst.getRegister() == Register.EAX) */
			testAssembler(c -> c.or(eax, 0x7FFFFFFF), Instruction.create(Code.OR_EAX_IMM32, ICRegisters.eax, 0x7FFFFFFF));
		} /* else */ { /* if (imm >= -0x80 && imm <= 0x7F) */
			testAssembler(c -> c.or(edx, -0x80), Instruction.create(Code.OR_RM32_IMM8, ICRegisters.edx, -0x80));
			testAssembler(c -> c.or(edx, 0x7F), Instruction.create(Code.OR_RM32_IMM8, ICRegisters.edx, 0x7F));
		} /* else */ testAssembler(c -> c.or(edx, 0x7FFFFFFF), Instruction.create(Code.OR_RM32_IMM32, ICRegisters.edx, 0x7FFFFFFF));
	}

	@Test
	void or_m_i() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				// Skipping OR_RM64_IMM8 - Not supported by current bitness
				// Skipping OR_RM64_IMM8 - Not supported by current bitness
			} /* else */ // Skipping OR_RM64_IMM32 - Not supported by current bitness
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				testAssembler(c -> c.or(dword_ptr(0x0L).base(edx), -0x80), Instruction.create(Code.OR_RM32_IMM8, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80));
				testAssembler(c -> c.or(dword_ptr(0x0L).base(edx), 0x7F), Instruction.create(Code.OR_RM32_IMM8, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7F));
			} /* else */ testAssembler(c -> c.or(dword_ptr(0x0L).base(edx), 0x7FFFFFFF), Instruction.create(Code.OR_RM32_IMM32, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7FFFFFFF));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				testAssembler(c -> c.or(word_ptr(0x0L).base(edx), -0x80), Instruction.create(Code.OR_RM16_IMM8, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80));
				testAssembler(c -> c.or(word_ptr(0x0L).base(edx), 0x7F), Instruction.create(Code.OR_RM16_IMM8, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7F));
			} /* else */ testAssembler(c -> c.or(word_ptr(0x0L).base(edx), 0x40B7), Instruction.create(Code.OR_RM16_IMM16, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x40B7));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.or(byte_ptr(0x0L).base(edx), -5), Instruction.create(Code.OR_RM8_IMM8, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.or(zmmword_ptr(0x0L).base(edx), -5), Instruction.create(Code.OR_RM8_IMM8, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
			});
		}
	}

	@Test
	void orpd_xmm_xmm() {
		testAssembler(c -> c.orpd(xmm2, xmm3), Instruction.create(Code.ORPD_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void orpd_xmm_m() {
		testAssembler(c -> c.orpd(xmm2, xmmword_ptr(0x0L).base(ecx)), Instruction.create(Code.ORPD_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void orps_xmm_xmm() {
		testAssembler(c -> c.orps(xmm2, xmm3), Instruction.create(Code.ORPS_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void orps_xmm_m() {
		testAssembler(c -> c.orps(xmm2, xmmword_ptr(0x0L).base(ecx)), Instruction.create(Code.ORPS_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void out_r16_r8() {
		testAssembler(c -> c.out(dx, al), Instruction.create(Code.OUT_DX_AL, ICRegisters.dx, ICRegisters.al));
	}

	@Test
	void out_i_r8() {
		testAssembler(c -> c.out(-5, al), Instruction.create(Code.OUT_IMM8_AL, -5, ICRegisters.al));
	}

	@Test
	void out_r16_r16() {
		testAssembler(c -> c.out(dx, ax), Instruction.create(Code.OUT_DX_AX, ICRegisters.dx, ICRegisters.ax));
	}

	@Test
	void out_i_r16() {
		testAssembler(c -> c.out(-5, ax), Instruction.create(Code.OUT_IMM8_AX, -5, ICRegisters.ax));
	}

	@Test
	void out_r16_r32() {
		testAssembler(c -> c.out(dx, eax), Instruction.create(Code.OUT_DX_EAX, ICRegisters.dx, ICRegisters.eax));
	}

	@Test
	void out_i_r32() {
		testAssembler(c -> c.out(-5, eax), Instruction.create(Code.OUT_IMM8_EAX, -5, ICRegisters.eax));
	}

	@Test
	void outsb() {
		testAssembler(c -> c.outsb(), Instruction.createOutsb(32));
	}

	@Test
	void outsd() {
		testAssembler(c -> c.outsd(), Instruction.createOutsd(32));
	}

	@Test
	void outsw() {
		testAssembler(c -> c.outsw(), Instruction.createOutsw(32));
	}

	@Test
	void vorpd_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorpd(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VORPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorpd(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorpd_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorpd(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VORPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorpd(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorpd_zmm_zmm_zmm() {
		testAssembler(c -> c.vorpd(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VORPD_ZMM_K1Z_ZMM_ZMMM512B64, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vorpd_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vorpd(xmm2.k1(), xmm3, dword_bcst(0x0L).base(edx)), applyK(Instruction.create(Code.EVEX_VORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorpd(xmm2, xmm3, xmmword_ptr(0x0L).base(ecx)), Instruction.create(Code.VEX_VORPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorpd(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorpd_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vorpd(ymm2.k1(), ymm3, dword_bcst(0x0L).base(edx)), applyK(Instruction.create(Code.EVEX_VORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorpd(ymm2, ymm3, ymmword_ptr(0x0L).base(ecx)), Instruction.create(Code.VEX_VORPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorpd(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorpd_zmm_zmm_m() {
		testAssembler(c -> c.vorpd(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VORPD_ZMM_K1Z_ZMM_ZMMM512B64, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vorps_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorps(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VORPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorps(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorps_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorps(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VORPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorps(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorps_zmm_zmm_zmm() {
		testAssembler(c -> c.vorps(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VORPS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vorps_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vorps(xmm2.k1(), xmm3, dword_bcst(0x0L).base(edx)), applyK(Instruction.create(Code.EVEX_VORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorps(xmm2, xmm3, xmmword_ptr(0x0L).base(ecx)), Instruction.create(Code.VEX_VORPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorps(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorps_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vorps(ymm2.k1(), ymm3, dword_bcst(0x0L).base(edx)), applyK(Instruction.create(Code.EVEX_VORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.edx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vorps(ymm2, ymm3, ymmword_ptr(0x0L).base(ecx)), Instruction.create(Code.VEX_VORPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vorps(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vorps_zmm_zmm_m() {
		testAssembler(c -> c.vorps(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VORPS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

}
