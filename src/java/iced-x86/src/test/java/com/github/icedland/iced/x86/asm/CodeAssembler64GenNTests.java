// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

final class CodeAssembler64GenNTests extends CodeAssemblerTestsBase {
	CodeAssembler64GenNTests() {
		super(64);
	}

	@Test
	void neg_r8() {
		testAssembler(c -> c.neg(dl), Instruction.create(Code.NEG_RM8, ICRegisters.dl));
	}

	@Test
	void neg_r16() {
		testAssembler(c -> c.neg(dx), Instruction.create(Code.NEG_RM16, ICRegisters.dx));
	}

	@Test
	void neg_r32() {
		testAssembler(c -> c.neg(edx), Instruction.create(Code.NEG_RM32, ICRegisters.edx));
	}

	@Test
	void neg_r64() {
		testAssembler(c -> c.neg(rdx), Instruction.create(Code.NEG_RM64, ICRegisters.rdx));
	}

	@Test
	void neg_m() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			testAssembler(c -> c.neg(qword_ptr(0x0L).base(rdx)), Instruction.create(Code.NEG_RM64, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			testAssembler(c -> c.neg(dword_ptr(0x0L).base(rdx)), Instruction.create(Code.NEG_RM32, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			testAssembler(c -> c.neg(word_ptr(0x0L).base(rdx)), Instruction.create(Code.NEG_RM16, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.neg(byte_ptr(0x0L).base(rdx)), Instruction.create(Code.NEG_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.neg(zmmword_ptr(0x0L).base(rdx)), Instruction.create(Code.NEG_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
			});
		}
	}

	@Test
	void nop() {
		{ /* if (getBitness() >= 32) */
			testAssembler(c -> c.nop(), Instruction.create(Code.NOPD));
		} /* else skip !(getBitness() >= 32) not supported by this CodeAssembler bitness */
	}

	@Test
	void nop_r16() {
		testAssembler(c -> c.nop(dx), Instruction.create(Code.NOP_RM16, ICRegisters.dx));
	}

	@Test
	void nop_r32() {
		testAssembler(c -> c.nop(edx), Instruction.create(Code.NOP_RM32, ICRegisters.edx));
	}

	@Test
	void nop_r64() {
		testAssembler(c -> c.nop(rdx), Instruction.create(Code.NOP_RM64, ICRegisters.rdx));
	}

	@Test
	void nop_m() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			testAssembler(c -> c.nop(qword_ptr(0x0L).base(rdx)), Instruction.create(Code.NOP_RM64, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			testAssembler(c -> c.nop(dword_ptr(0x0L).base(rdx)), Instruction.create(Code.NOP_RM32, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			testAssembler(c -> c.nop(word_ptr(0x0L).base(rdx)), Instruction.create(Code.NOP_RM16, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.nop(zmmword_ptr(0x0L).base(rdx)), Instruction.create(Code.NOP_RM16, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
			});
		}
	}

	@Test
	void not_r8() {
		testAssembler(c -> c.not(dl), Instruction.create(Code.NOT_RM8, ICRegisters.dl));
	}

	@Test
	void not_r16() {
		testAssembler(c -> c.not(dx), Instruction.create(Code.NOT_RM16, ICRegisters.dx));
	}

	@Test
	void not_r32() {
		testAssembler(c -> c.not(edx), Instruction.create(Code.NOT_RM32, ICRegisters.edx));
	}

	@Test
	void not_r64() {
		testAssembler(c -> c.not(rdx), Instruction.create(Code.NOT_RM64, ICRegisters.rdx));
	}

	@Test
	void not_m() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			testAssembler(c -> c.not(qword_ptr(0x0L).base(rdx)), Instruction.create(Code.NOT_RM64, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			testAssembler(c -> c.not(dword_ptr(0x0L).base(rdx)), Instruction.create(Code.NOT_RM32, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			testAssembler(c -> c.not(word_ptr(0x0L).base(rdx)), Instruction.create(Code.NOT_RM16, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.not(byte_ptr(0x0L).base(rdx)), Instruction.create(Code.NOT_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.not(zmmword_ptr(0x0L).base(rdx)), Instruction.create(Code.NOT_RM8, new MemoryOperand(ICRegisters.rdx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
			});
		}
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
