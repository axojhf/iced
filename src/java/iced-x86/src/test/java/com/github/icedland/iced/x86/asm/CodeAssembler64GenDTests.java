// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

final class CodeAssembler64GenDTests extends CodeAssemblerTestsBase {
	CodeAssembler64GenDTests() {
		super(64);
	}

	@Test
	void dec_r8() {
		testAssembler(c -> c.dec(dl), Instruction.create(Code.DEC_RM8, ICRegisters.dl));
	}

	@Test
	void dec_r16() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.dec(dx), Instruction.create(Code.DEC_RM16, ICRegisters.dx));
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void dec_r32() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.dec(edx), Instruction.create(Code.DEC_RM32, ICRegisters.edx));
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void dec_r64() {
		testAssembler(c -> c.dec(rdx), Instruction.create(Code.DEC_RM64, ICRegisters.rdx));
	}

	@Test
	void dec_m() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			testAssembler(c -> c.dec(qword_ptr(0x0L).base(rdx)), Instruction.create(Code.DEC_RM64, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			testAssembler(c -> c.dec(dword_ptr(0x0L).base(rdx)), Instruction.create(Code.DEC_RM32, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			testAssembler(c -> c.dec(word_ptr(0x0L).base(rdx)), Instruction.create(Code.DEC_RM16, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.dec(byte_ptr(0x0L).base(rdx)), Instruction.create(Code.DEC_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.dec(zmmword_ptr(0x0L).base(rdx)), Instruction.create(Code.DEC_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
			});
		}
	}

	@Test
	void div_r8() {
		testAssembler(c -> c.div(dl), Instruction.create(Code.DIV_RM8, ICRegisters.dl));
	}

	@Test
	void div_r16() {
		testAssembler(c -> c.div(dx), Instruction.create(Code.DIV_RM16, ICRegisters.dx));
	}

	@Test
	void div_r32() {
		testAssembler(c -> c.div(edx), Instruction.create(Code.DIV_RM32, ICRegisters.edx));
	}

	@Test
	void div_r64() {
		testAssembler(c -> c.div(rdx), Instruction.create(Code.DIV_RM64, ICRegisters.rdx));
	}

	@Test
	void div_m() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			testAssembler(c -> c.div(qword_ptr(0x0L).base(rdx)), Instruction.create(Code.DIV_RM64, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			testAssembler(c -> c.div(dword_ptr(0x0L).base(rdx)), Instruction.create(Code.DIV_RM32, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			testAssembler(c -> c.div(word_ptr(0x0L).base(rdx)), Instruction.create(Code.DIV_RM16, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.div(byte_ptr(0x0L).base(rdx)), Instruction.create(Code.DIV_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.div(zmmword_ptr(0x0L).base(rdx)), Instruction.create(Code.DIV_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
			});
		}
	}

	@Test
	void divpd_xmm_xmm() {
		testAssembler(c -> c.divpd(xmm2, xmm3), Instruction.create(Code.DIVPD_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void divpd_xmm_m() {
		testAssembler(c -> c.divpd(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.DIVPD_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void divps_xmm_xmm() {
		testAssembler(c -> c.divps(xmm2, xmm3), Instruction.create(Code.DIVPS_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void divps_xmm_m() {
		testAssembler(c -> c.divps(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.DIVPS_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void divsd_xmm_xmm() {
		testAssembler(c -> c.divsd(xmm2, xmm3), Instruction.create(Code.DIVSD_XMM_XMMM64, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void divsd_xmm_m() {
		testAssembler(c -> c.divsd(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.DIVSD_XMM_XMMM64, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void divss_xmm_xmm() {
		testAssembler(c -> c.divss(xmm2, xmm3), Instruction.create(Code.DIVSS_XMM_XMMM32, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void divss_xmm_m() {
		testAssembler(c -> c.divss(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.DIVSS_XMM_XMMM32, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void dppd_xmm_xmm_i() {
		testAssembler(c -> c.dppd(xmm2, xmm3, -5), Instruction.create(Code.DPPD_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, -5));
	}

	@Test
	void dppd_xmm_m_i() {
		testAssembler(c -> c.dppd(xmm2, xmmword_ptr(0x0L).base(rcx), -5), Instruction.create(Code.DPPD_XMM_XMMM128_IMM8, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
	}

	@Test
	void dpps_xmm_xmm_i() {
		testAssembler(c -> c.dpps(xmm2, xmm3, -5), Instruction.create(Code.DPPS_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, -5));
	}

	@Test
	void dpps_xmm_m_i() {
		testAssembler(c -> c.dpps(xmm2, xmmword_ptr(0x0L).base(rcx), -5), Instruction.create(Code.DPPS_XMM_XMMM128_IMM8, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
	}

	@Test
	void vdbpsadbw_xmm_xmm_xmm_i() {
		testAssembler(c -> c.vdbpsadbw(xmm2.k1(), xmm3, xmm4, -5), applyK(Instruction.create(Code.EVEX_VDBPSADBW_XMM_K1Z_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4, -5), Register.K1));
	}

	@Test
	void vdbpsadbw_ymm_ymm_ymm_i() {
		testAssembler(c -> c.vdbpsadbw(ymm2.k1(), ymm3, ymm4, -5), applyK(Instruction.create(Code.EVEX_VDBPSADBW_YMM_K1Z_YMM_YMMM256_IMM8, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4, -5), Register.K1));
	}

	@Test
	void vdbpsadbw_zmm_zmm_zmm_i() {
		testAssembler(c -> c.vdbpsadbw(zmm2.k1(), zmm3, zmm4, -5), applyK(Instruction.create(Code.EVEX_VDBPSADBW_ZMM_K1Z_ZMM_ZMMM512_IMM8, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4, -5), Register.K1));
	}

	@Test
	void vdbpsadbw_xmm_xmm_m_i() {
		testAssembler(c -> c.vdbpsadbw(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx), -5), applyK(Instruction.create(Code.EVEX_VDBPSADBW_XMM_K1Z_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5), Register.K1));
	}

	@Test
	void vdbpsadbw_ymm_ymm_m_i() {
		testAssembler(c -> c.vdbpsadbw(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(rcx), -5), applyK(Instruction.create(Code.EVEX_VDBPSADBW_YMM_K1Z_YMM_YMMM256_IMM8, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5), Register.K1));
	}

	@Test
	void vdbpsadbw_zmm_zmm_m_i() {
		testAssembler(c -> c.vdbpsadbw(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(rcx), -5), applyK(Instruction.create(Code.EVEX_VDBPSADBW_ZMM_K1Z_ZMM_ZMMM512_IMM8, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5), Register.K1));
	}

	@Test
	void vdivpd_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivpd(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VDIVPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivpd(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VDIVPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivpd_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivpd(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VDIVPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivpd(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VDIVPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivpd_zmm_zmm_zmm() {
		testAssembler(c -> c.vdivpd(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VDIVPD_ZMM_K1Z_ZMM_ZMMM512B64_ER, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vdivpd_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vdivpd(xmm2.k1(), xmm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VDIVPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivpd(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VDIVPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivpd(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivpd_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vdivpd(ymm2.k1(), ymm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VDIVPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivpd(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VDIVPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivpd(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivpd_zmm_zmm_m() {
		testAssembler(c -> c.vdivpd(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPD_ZMM_K1Z_ZMM_ZMMM512B64_ER, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdivph_xmm_xmm_xmm() {
		testAssembler(c -> c.vdivph(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VDIVPH_XMM_K1Z_XMM_XMMM128B16, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1));
	}

	@Test
	void vdivph_ymm_ymm_ymm() {
		testAssembler(c -> c.vdivph(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VDIVPH_YMM_K1Z_YMM_YMMM256B16, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1));
	}

	@Test
	void vdivph_zmm_zmm_zmm() {
		testAssembler(c -> c.vdivph(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VDIVPH_ZMM_K1Z_ZMM_ZMMM512B16_ER, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vdivph_xmm_xmm_m() {
		testAssembler(c -> c.vdivph(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPH_XMM_K1Z_XMM_XMMM128B16, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdivph_ymm_ymm_m() {
		testAssembler(c -> c.vdivph(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPH_YMM_K1Z_YMM_YMMM256B16, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdivph_zmm_zmm_m() {
		testAssembler(c -> c.vdivph(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPH_ZMM_K1Z_ZMM_ZMMM512B16_ER, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdivps_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivps(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VDIVPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivps(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VDIVPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivps_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivps(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VDIVPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivps(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VDIVPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivps_zmm_zmm_zmm() {
		testAssembler(c -> c.vdivps(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VDIVPS_ZMM_K1Z_ZMM_ZMMM512B32_ER, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vdivps_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vdivps(xmm2.k1(), xmm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VDIVPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivps(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VDIVPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivps(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivps_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vdivps(ymm2.k1(), ymm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VDIVPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivps(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VDIVPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivps(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivps_zmm_zmm_m() {
		testAssembler(c -> c.vdivps(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVPS_ZMM_K1Z_ZMM_ZMMM512B32_ER, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdivsd_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivsd(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VDIVSD_XMM_XMM_XMMM64, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivsd(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VDIVSD_XMM_K1Z_XMM_XMMM64_ER, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivsd_xmm_xmm_m() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivsd(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VDIVSD_XMM_XMM_XMMM64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivsd(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVSD_XMM_K1Z_XMM_XMMM64_ER, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivsh_xmm_xmm_xmm() {
		testAssembler(c -> c.vdivsh(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VDIVSH_XMM_K1Z_XMM_XMMM16_ER, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1));
	}

	@Test
	void vdivsh_xmm_xmm_m() {
		testAssembler(c -> c.vdivsh(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVSH_XMM_K1Z_XMM_XMMM16_ER, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdivss_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivss(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VDIVSS_XMM_XMM_XMMM32, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivss(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VDIVSS_XMM_K1Z_XMM_XMMM32_ER, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdivss_xmm_xmm_m() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vdivss(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VDIVSS_XMM_XMM_XMMM32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vdivss(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDIVSS_XMM_K1Z_XMM_XMMM32_ER, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vdpbf16ps_xmm_xmm_xmm() {
		testAssembler(c -> c.vdpbf16ps(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VDPBF16PS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1));
	}

	@Test
	void vdpbf16ps_ymm_ymm_ymm() {
		testAssembler(c -> c.vdpbf16ps(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VDPBF16PS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1));
	}

	@Test
	void vdpbf16ps_zmm_zmm_zmm() {
		testAssembler(c -> c.vdpbf16ps(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VDPBF16PS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vdpbf16ps_xmm_xmm_m() {
		testAssembler(c -> c.vdpbf16ps(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDPBF16PS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdpbf16ps_ymm_ymm_m() {
		testAssembler(c -> c.vdpbf16ps(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDPBF16PS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdpbf16ps_zmm_zmm_m() {
		testAssembler(c -> c.vdpbf16ps(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VDPBF16PS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vdppd_xmm_xmm_xmm_i() {
		testAssembler(c -> c.vdppd(xmm2, xmm3, xmm4, -5), Instruction.create(Code.VEX_VDPPD_XMM_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4, -5));
	}

	@Test
	void vdppd_xmm_xmm_m_i() {
		testAssembler(c -> c.vdppd(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx), -5), Instruction.create(Code.VEX_VDPPD_XMM_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
	}

	@Test
	void vdpps_xmm_xmm_xmm_i() {
		testAssembler(c -> c.vdpps(xmm2, xmm3, xmm4, -5), Instruction.create(Code.VEX_VDPPS_XMM_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4, -5));
	}

	@Test
	void vdpps_ymm_ymm_ymm_i() {
		testAssembler(c -> c.vdpps(ymm2, ymm3, ymm4, -5), Instruction.create(Code.VEX_VDPPS_YMM_YMM_YMMM256_IMM8, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4, -5));
	}

	@Test
	void vdpps_xmm_xmm_m_i() {
		testAssembler(c -> c.vdpps(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx), -5), Instruction.create(Code.VEX_VDPPS_XMM_XMM_XMMM128_IMM8, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
	}

	@Test
	void vdpps_ymm_ymm_m_i() {
		testAssembler(c -> c.vdpps(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx), -5), Instruction.create(Code.VEX_VDPPS_YMM_YMM_YMMM256_IMM8, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
	}

/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_1() {
	testAssemblerDeclareByte(c -> c.db((byte)1), new byte[] {(byte)1});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_2() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2), new byte[] {(byte)1, (byte)2});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_3() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3), new byte[] {(byte)1, (byte)2, (byte)3});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_4() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_5() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_6() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_7() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_8() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_9() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_10() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_11() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_12() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_13() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_14() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13, (byte)14), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13, (byte)14});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_15() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13, (byte)14, (byte)15), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13, (byte)14, (byte)15});
}
/**
 * Creates a db asm directive with the type byte.<!-- -->
 */
@Test
void testAssemblerDeclareByte_db_byte_16() {
	testAssemblerDeclareByte(c -> c.db((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13, (byte)14, (byte)15, (byte)16), new byte[] {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6, (byte)7, (byte)8, (byte)9, (byte)10, (byte)11, (byte)12, (byte)13, (byte)14, (byte)15, (byte)16});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_1() {
	testAssemblerDeclareWord(c -> c.dw((short)1), new short[] {(short)1});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_2() {
	testAssemblerDeclareWord(c -> c.dw((short)1, (short)2), new short[] {(short)1, (short)2});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_3() {
	testAssemblerDeclareWord(c -> c.dw((short)1, (short)2, (short)3), new short[] {(short)1, (short)2, (short)3});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_4() {
	testAssemblerDeclareWord(c -> c.dw((short)1, (short)2, (short)3, (short)4), new short[] {(short)1, (short)2, (short)3, (short)4});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_5() {
	testAssemblerDeclareWord(c -> c.dw((short)1, (short)2, (short)3, (short)4, (short)5), new short[] {(short)1, (short)2, (short)3, (short)4, (short)5});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_6() {
	testAssemblerDeclareWord(c -> c.dw((short)1, (short)2, (short)3, (short)4, (short)5, (short)6), new short[] {(short)1, (short)2, (short)3, (short)4, (short)5, (short)6});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_7() {
	testAssemblerDeclareWord(c -> c.dw((short)1, (short)2, (short)3, (short)4, (short)5, (short)6, (short)7), new short[] {(short)1, (short)2, (short)3, (short)4, (short)5, (short)6, (short)7});
}
/**
 * Creates a dw asm directive with the type short.<!-- -->
 */
@Test
void testAssemblerDeclareWord_dw_short_8() {
	testAssemblerDeclareWord(c -> c.dw((short)1, (short)2, (short)3, (short)4, (short)5, (short)6, (short)7, (short)8), new short[] {(short)1, (short)2, (short)3, (short)4, (short)5, (short)6, (short)7, (short)8});
}
/**
 * Creates a dd asm directive with the type int.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_int_1() {
	testAssemblerDeclareDword(c -> c.dd((int)1), new int[] {(int)1});
}
/**
 * Creates a dd asm directive with the type int.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_int_2() {
	testAssemblerDeclareDword(c -> c.dd((int)1, (int)2), new int[] {(int)1, (int)2});
}
/**
 * Creates a dd asm directive with the type int.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_int_3() {
	testAssemblerDeclareDword(c -> c.dd((int)1, (int)2, (int)3), new int[] {(int)1, (int)2, (int)3});
}
/**
 * Creates a dd asm directive with the type int.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_int_4() {
	testAssemblerDeclareDword(c -> c.dd((int)1, (int)2, (int)3, (int)4), new int[] {(int)1, (int)2, (int)3, (int)4});
}
/**
 * Creates a dd asm directive with the type float.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_float_1() {
	testAssemblerDeclareDword(c -> c.dd((float)1), new float[] {(float)1});
}
/**
 * Creates a dd asm directive with the type float.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_float_2() {
	testAssemblerDeclareDword(c -> c.dd((float)1, (float)2), new float[] {(float)1, (float)2});
}
/**
 * Creates a dd asm directive with the type float.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_float_3() {
	testAssemblerDeclareDword(c -> c.dd((float)1, (float)2, (float)3), new float[] {(float)1, (float)2, (float)3});
}
/**
 * Creates a dd asm directive with the type float.<!-- -->
 */
@Test
void testAssemblerDeclareDword_dd_float_4() {
	testAssemblerDeclareDword(c -> c.dd((float)1, (float)2, (float)3, (float)4), new float[] {(float)1, (float)2, (float)3, (float)4});
}
/**
 * Creates a dq asm directive with the type long.<!-- -->
 */
@Test
void testAssemblerDeclareQword_dq_long_1() {
	testAssemblerDeclareQword(c -> c.dq((long)1), new long[] {(long)1});
}
/**
 * Creates a dq asm directive with the type long.<!-- -->
 */
@Test
void testAssemblerDeclareQword_dq_long_2() {
	testAssemblerDeclareQword(c -> c.dq((long)1, (long)2), new long[] {(long)1, (long)2});
}
/**
 * Creates a dq asm directive with the type double.<!-- -->
 */
@Test
void testAssemblerDeclareQword_dq_double_1() {
	testAssemblerDeclareQword(c -> c.dq((double)1), new double[] {(double)1});
}
/**
 * Creates a dq asm directive with the type double.<!-- -->
 */
@Test
void testAssemblerDeclareQword_dq_double_2() {
	testAssemblerDeclareQword(c -> c.dq((double)1, (double)2), new double[] {(double)1, (double)2});
}
}
