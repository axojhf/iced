// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

@SuppressWarnings("cast")
final class CodeAssembler16GenZTests extends CodeAssemblerTestsBase {
	CodeAssembler16GenZTests() {
		super(16);
	}

	@Test
	void vzeroall() {
		testAssembler(c -> c.vzeroall(), Instruction.create(Code.VEX_VZEROALL));
	}

	@Test
	void vzeroupper() {
		testAssembler(c -> c.vzeroupper(), Instruction.create(Code.VEX_VZEROUPPER));
	}

	@Test
	void zero_bytes() {
		testAssembler(c -> c.zero_bytes(), Instruction.create(Code.ZERO_BYTES));
	}

}
