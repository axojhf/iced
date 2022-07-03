// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

final class CodeAssembler64GenXTests extends CodeAssemblerTestsBase {
	CodeAssembler64GenXTests() {
		super(64);
	}

	@Test
	void vxorpd_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VXORPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VXORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VXORPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VXORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_zmm_zmm_zmm() {
		testAssembler(c -> c.vxorpd(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VXORPD_ZMM_K1Z_ZMM_ZMMM512B64, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vxorpd_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorpd(xmm2.k1(), xmm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VXORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VXORPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VXORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorpd(ymm2.k1(), ymm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VXORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VXORPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VXORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_zmm_zmm_m() {
		testAssembler(c -> c.vxorpd(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VXORPD_ZMM_K1Z_ZMM_ZMMM512B64, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vxorps_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VXORPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VXORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VXORPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VXORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_zmm_zmm_zmm() {
		testAssembler(c -> c.vxorps(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VXORPS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vxorps_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorps(xmm2.k1(), xmm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VXORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(xmm2, xmm3, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VXORPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VXORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorps(ymm2.k1(), ymm3, dword_bcst(0x0L).base(rdx)), applyK(Instruction.create(Code.EVEX_VXORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(ymm2, ymm3, ymmword_ptr(0x0L).base(rcx)), Instruction.create(Code.VEX_VXORPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VXORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_zmm_zmm_m() {
		testAssembler(c -> c.vxorps(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(rcx)), applyK(Instruction.create(Code.EVEX_VXORPS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void xabort_i() {
		testAssembler(c -> c.xabort(-5), Instruction.create(Code.XABORT_IMM8, -5));
	}

	@Test
	void xadd_r8_r8() {
		testAssembler(c -> c.xadd(dl, bl), Instruction.create(Code.XADD_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void xadd_m_r8() {
		testAssembler(c -> c.xadd(byte_ptr(0x0L).base(rcx), bl), Instruction.create(Code.XADD_RM8_R8, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void xadd_r16_r16() {
		testAssembler(c -> c.xadd(dx, bx), Instruction.create(Code.XADD_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void xadd_m_r16() {
		testAssembler(c -> c.xadd(word_ptr(0x0L).base(rcx), bx), Instruction.create(Code.XADD_RM16_R16, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void xadd_r32_r32() {
		testAssembler(c -> c.xadd(edx, ebx), Instruction.create(Code.XADD_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void xadd_m_r32() {
		testAssembler(c -> c.xadd(dword_ptr(0x0L).base(rcx), ebx), Instruction.create(Code.XADD_RM32_R32, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void xadd_r64_r64() {
		testAssembler(c -> c.xadd(rdx, rbx), Instruction.create(Code.XADD_RM64_R64, ICRegisters.rdx, ICRegisters.rbx));
	}

	@Test
	void xadd_m_r64() {
		testAssembler(c -> c.xadd(qword_ptr(0x0L).base(rcx), rbx), Instruction.create(Code.XADD_RM64_R64, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.rbx));
	}

	@Test
	void xchg_r8_r8() {
		testAssembler(c -> c.xchg(dl, bl), Instruction.create(Code.XCHG_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void xchg_m_r8() {
		testAssembler(c -> c.xchg(byte_ptr(0x0L).base(rcx), bl), Instruction.create(Code.XCHG_RM8_R8, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void xchg_r16_r16() {
		{ /* if (src.getRegister() == Register.AX) */
			testAssembler(c -> c.xchg(dx, ax), Instruction.create(Code.XCHG_R16_AX, ICRegisters.dx, ICRegisters.ax));
		} /* else */ testAssembler(c -> c.xchg(dx, bx), Instruction.create(Code.XCHG_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void xchg_m_r16() {
		testAssembler(c -> c.xchg(word_ptr(0x0L).base(rcx), bx), Instruction.create(Code.XCHG_RM16_R16, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void xchg_r32_r32() {
		{ /* if (src.getRegister() == Register.EAX) */
			testAssembler(c -> c.xchg(edx, eax), Instruction.create(Code.XCHG_R32_EAX, ICRegisters.edx, ICRegisters.eax));
		} /* else */ testAssembler(c -> c.xchg(edx, ebx), Instruction.create(Code.XCHG_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void xchg_m_r32() {
		testAssembler(c -> c.xchg(dword_ptr(0x0L).base(rcx), ebx), Instruction.create(Code.XCHG_RM32_R32, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void xchg_r64_r64() {
		{ /* if (src.getRegister() == Register.RAX) */
			testAssembler(c -> c.xchg(rdx, rax), Instruction.create(Code.XCHG_R64_RAX, ICRegisters.rdx, ICRegisters.rax));
		} /* else */ testAssembler(c -> c.xchg(rdx, rbx), Instruction.create(Code.XCHG_RM64_R64, ICRegisters.rdx, ICRegisters.rbx));
	}

	@Test
	void xchg_m_r64() {
		testAssembler(c -> c.xchg(qword_ptr(0x0L).base(rcx), rbx), Instruction.create(Code.XCHG_RM64_R64, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.rbx));
	}

	@Test
	void xcryptcbc() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xcryptcbc(), Instruction.create(Code.XCRYPTCBC_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xcryptcfb() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xcryptcfb(), Instruction.create(Code.XCRYPTCFB_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xcryptctr() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xcryptctr(), Instruction.create(Code.XCRYPTCTR_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xcryptecb() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xcryptecb(), Instruction.create(Code.XCRYPTECB_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xcryptofb() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xcryptofb(), Instruction.create(Code.XCRYPTOFB_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xend() {
		testAssembler(c -> c.xend(), Instruction.create(Code.XEND));
	}

	@Test
	void xgetbv() {
		testAssembler(c -> c.xgetbv(), Instruction.create(Code.XGETBV));
	}

	@Test
	void xor_r8_r8() {
		testAssembler(c -> c.xor(dl, bl), Instruction.create(Code.XOR_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void xor_m_r8() {
		testAssembler(c -> c.xor(byte_ptr(0x0L).base(rcx), bl), Instruction.create(Code.XOR_RM8_R8, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void xor_r16_r16() {
		testAssembler(c -> c.xor(dx, bx), Instruction.create(Code.XOR_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void xor_m_r16() {
		testAssembler(c -> c.xor(word_ptr(0x0L).base(rcx), bx), Instruction.create(Code.XOR_RM16_R16, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void xor_r32_r32() {
		testAssembler(c -> c.xor(edx, ebx), Instruction.create(Code.XOR_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void xor_m_r32() {
		testAssembler(c -> c.xor(dword_ptr(0x0L).base(rcx), ebx), Instruction.create(Code.XOR_RM32_R32, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void xor_r64_r64() {
		testAssembler(c -> c.xor(rdx, rbx), Instruction.create(Code.XOR_RM64_R64, ICRegisters.rdx, ICRegisters.rbx));
	}

	@Test
	void xor_m_r64() {
		testAssembler(c -> c.xor(qword_ptr(0x0L).base(rcx), rbx), Instruction.create(Code.XOR_RM64_R64, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.rbx));
	}

	@Test
	void xor_r8_m() {
		testAssembler(c -> c.xor(dl, byte_ptr(0x0L).base(rcx)), Instruction.create(Code.XOR_R8_RM8, ICRegisters.dl, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xor_r16_m() {
		testAssembler(c -> c.xor(dx, word_ptr(0x0L).base(rcx)), Instruction.create(Code.XOR_R16_RM16, ICRegisters.dx, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xor_r32_m() {
		testAssembler(c -> c.xor(edx, dword_ptr(0x0L).base(rcx)), Instruction.create(Code.XOR_R32_RM32, ICRegisters.edx, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xor_r64_m() {
		testAssembler(c -> c.xor(rdx, qword_ptr(0x0L).base(rcx)), Instruction.create(Code.XOR_R64_RM64, ICRegisters.rdx, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xor_r8_i() {
		{ /* if (dst.getRegister() == Register.AL) */
			testAssembler(c -> c.xor(al, -5), Instruction.create(Code.XOR_AL_IMM8, ICRegisters.al, -5));
		} /* else */ testAssembler(c -> c.xor(dl, -5), Instruction.create(Code.XOR_RM8_IMM8, ICRegisters.dl, -5));
	}

	@Test
	void xor_r16_i() {
		{ /* if (dst.getRegister() == Register.AX) */
			testAssembler(c -> c.xor(ax, 0x40B7), Instruction.create(Code.XOR_AX_IMM16, ICRegisters.ax, 0x40B7));
		} /* else */ { /* if (imm >= -0x80 && imm <= 0x7F) */
			testAssembler(c -> c.xor(dx, -0x80), Instruction.create(Code.XOR_RM16_IMM8, ICRegisters.dx, -0x80));
			testAssembler(c -> c.xor(dx, 0x7F), Instruction.create(Code.XOR_RM16_IMM8, ICRegisters.dx, 0x7F));
		} /* else */ testAssembler(c -> c.xor(dx, 0x40B7), Instruction.create(Code.XOR_RM16_IMM16, ICRegisters.dx, 0x40B7));
	}

	@Test
	void xor_r32_i() {
		{ /* if (dst.getRegister() == Register.EAX) */
			testAssembler(c -> c.xor(eax, 0x7FFFFFFF), Instruction.create(Code.XOR_EAX_IMM32, ICRegisters.eax, 0x7FFFFFFF));
		} /* else */ { /* if (imm >= -0x80 && imm <= 0x7F) */
			testAssembler(c -> c.xor(edx, -0x80), Instruction.create(Code.XOR_RM32_IMM8, ICRegisters.edx, -0x80));
			testAssembler(c -> c.xor(edx, 0x7F), Instruction.create(Code.XOR_RM32_IMM8, ICRegisters.edx, 0x7F));
		} /* else */ testAssembler(c -> c.xor(edx, 0x7FFFFFFF), Instruction.create(Code.XOR_RM32_IMM32, ICRegisters.edx, 0x7FFFFFFF));
	}

	@Test
	void xor_r64_i() {
		{ /* if (dst.getRegister() == Register.RAX) */
			testAssembler(c -> c.xor(rax, -0x80000000), Instruction.create(Code.XOR_RAX_IMM32, ICRegisters.rax, -0x80000000));
		} /* else */ { /* if (imm >= -0x80 && imm <= 0x7F) */
			testAssembler(c -> c.xor(rdx, -0x80), Instruction.create(Code.XOR_RM64_IMM8, ICRegisters.rdx, -0x80));
			testAssembler(c -> c.xor(rdx, 0x7F), Instruction.create(Code.XOR_RM64_IMM8, ICRegisters.rdx, 0x7F));
		} /* else */ testAssembler(c -> c.xor(rdx, -0x80000000), Instruction.create(Code.XOR_RM64_IMM32, ICRegisters.rdx, -0x80000000));
	}

	@Test
	void xor_m_i() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				testAssembler(c -> c.xor(qword_ptr(0x0L).base(rdx), -0x80), Instruction.create(Code.XOR_RM64_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80));
				testAssembler(c -> c.xor(qword_ptr(0x0L).base(rdx), 0x7F), Instruction.create(Code.XOR_RM64_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7F));
			} /* else */ testAssembler(c -> c.xor(qword_ptr(0x0L).base(rdx), -0x80000000), Instruction.create(Code.XOR_RM64_IMM32, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80000000));
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				testAssembler(c -> c.xor(dword_ptr(0x0L).base(rdx), -0x80), Instruction.create(Code.XOR_RM32_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80));
				testAssembler(c -> c.xor(dword_ptr(0x0L).base(rdx), 0x7F), Instruction.create(Code.XOR_RM32_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7F));
			} /* else */ testAssembler(c -> c.xor(dword_ptr(0x0L).base(rdx), 0x7FFFFFFF), Instruction.create(Code.XOR_RM32_IMM32, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7FFFFFFF));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				testAssembler(c -> c.xor(word_ptr(0x0L).base(rdx), -0x80), Instruction.create(Code.XOR_RM16_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80));
				testAssembler(c -> c.xor(word_ptr(0x0L).base(rdx), 0x7F), Instruction.create(Code.XOR_RM16_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7F));
			} /* else */ testAssembler(c -> c.xor(word_ptr(0x0L).base(rdx), 0x40B7), Instruction.create(Code.XOR_RM16_IMM16, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x40B7));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.xor(byte_ptr(0x0L).base(rdx), -5), Instruction.create(Code.XOR_RM8_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.xor(zmmword_ptr(0x0L).base(rdx), -5), Instruction.create(Code.XOR_RM8_IMM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
			});
		}
	}

	@Test
	void xorpd_xmm_xmm() {
		testAssembler(c -> c.xorpd(xmm2, xmm3), Instruction.create(Code.XORPD_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void xorpd_xmm_m() {
		testAssembler(c -> c.xorpd(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.XORPD_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xorps_xmm_xmm() {
		testAssembler(c -> c.xorps(xmm2, xmm3), Instruction.create(Code.XORPS_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void xorps_xmm_m() {
		testAssembler(c -> c.xorps(xmm2, xmmword_ptr(0x0L).base(rcx)), Instruction.create(Code.XORPS_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xresldtrk() {
		testAssembler(c -> c.xresldtrk(), Instruction.create(Code.XRESLDTRK));
	}

	@Test
	void xrstor_m() {
		testAssembler(c -> c.xrstor(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XRSTOR_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xrstor64_m() {
		testAssembler(c -> c.xrstor64(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XRSTOR64_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xrstors_m() {
		testAssembler(c -> c.xrstors(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XRSTORS_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xrstors64_m() {
		testAssembler(c -> c.xrstors64(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XRSTORS64_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsave_m() {
		testAssembler(c -> c.xsave(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVE_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsave64_m() {
		testAssembler(c -> c.xsave64(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVE64_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsavec_m() {
		testAssembler(c -> c.xsavec(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVEC_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsavec64_m() {
		testAssembler(c -> c.xsavec64(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVEC64_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsaveopt_m() {
		testAssembler(c -> c.xsaveopt(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVEOPT_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsaveopt64_m() {
		testAssembler(c -> c.xsaveopt64(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVEOPT64_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsaves_m() {
		testAssembler(c -> c.xsaves(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVES_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsaves64_m() {
		testAssembler(c -> c.xsaves64(mem_ptr(0x0L).base(rcx)), Instruction.create(Code.XSAVES64_MEM, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsetbv() {
		testAssembler(c -> c.xsetbv(), Instruction.create(Code.XSETBV));
	}

	@Test
	void xsha1() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xsha1(), Instruction.create(Code.XSHA1_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xsha256() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xsha256(), Instruction.create(Code.XSHA256_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xsha512() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xsha512(), Instruction.create(Code.XSHA512_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xsha512_alt() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xsha512_alt(), Instruction.create(Code.XSHA512_ALT_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xstore() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xstore(), Instruction.create(Code.XSTORE_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xstore_alt() {
		{ /* if (getBitness() == 64) */
			testAssembler(c -> c.xstore_alt(), Instruction.create(Code.XSTORE_ALT_64), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
		} /* else skip !(getBitness() == 64) not supported by this CodeAssembler bitness */
	}

	@Test
	void xsusldtrk() {
		testAssembler(c -> c.xsusldtrk(), Instruction.create(Code.XSUSLDTRK));
	}

	@Test
	void xtest() {
		testAssembler(c -> c.xtest(), Instruction.create(Code.XTEST));
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
