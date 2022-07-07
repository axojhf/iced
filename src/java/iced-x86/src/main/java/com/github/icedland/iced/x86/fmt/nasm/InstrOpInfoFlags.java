// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.fmt.nasm;

final class InstrOpInfoFlags {
	private InstrOpInfoFlags() {
	}

	static final int NONE = 0x0000_0000;
	static final int MEM_SIZE_NOTHING = 0x0000_0001;
	static final int SHOW_NO_MEM_SIZE_FORCE_SIZE = 0x0000_0002;
	static final int SHOW_MIN_MEM_SIZE_FORCE_SIZE = 0x0000_0004;
	static final int SIZE_OVERRIDE_MASK = 0x0000_0003;
	static final int OP_SIZE_SHIFT = 0x0000_0003;
	static final int OP_SIZE16 = 0x0000_0008;
	static final int OP_SIZE32 = 0x0000_0010;
	static final int OP_SIZE64 = 0x0000_0018;
	static final int ADDR_SIZE_SHIFT = 0x0000_0005;
	static final int ADDR_SIZE16 = 0x0000_0020;
	static final int ADDR_SIZE32 = 0x0000_0040;
	static final int ADDR_SIZE64 = 0x0000_0060;
	static final int BRANCH_SIZE_INFO_SHIFT = 0x0000_0007;
	static final int BRANCH_SIZE_INFO_MASK = 0x0000_0007;
	static final int BRANCH_SIZE_INFO_SHORT = 0x0000_0300;
	static final int SIGN_EXTEND_INFO_SHIFT = 0x0000_000A;
	static final int SIGN_EXTEND_INFO_MASK = 0x0000_0007;
	static final int MEMORY_SIZE_INFO_SHIFT = 0x0000_000D;
	static final int MEMORY_SIZE_INFO_MASK = 0x0000_0003;
	static final int FAR_MEMORY_SIZE_INFO_SHIFT = 0x0000_000F;
	static final int FAR_MEMORY_SIZE_INFO_MASK = 0x0000_0003;
	static final int REGISTER_TO = 0x0002_0000;
	static final int BND_PREFIX = 0x0004_0000;
	static final int MNEMONIC_IS_DIRECTIVE = 0x0008_0000;
	static final int JCC_NOT_TAKEN = 0x0010_0000;
	static final int JCC_TAKEN = 0x0020_0000;
	static final int MEMORY_SIZE_BITS = 0x0000_0008;
	static final int MEMORY_SIZE_SHIFT = 0x0000_0016;
	static final int MEMORY_SIZE_MASK = 0x0000_00FF;
}
