// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

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
