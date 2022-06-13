// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

package com.github.icedland.iced.x86.fmt;

/**
 * Operand options
 */
public final class FormatterOperandOptions {
	private int flags;

	private static final class Flags {
		static final int NO_BRANCH_SIZE = 0x0000_0001;
		static final int RIP_RELATIVE_ADDRESSES = 0x0000_0002;
		static final int MEMORY_SIZE_SHIFT = 30;
		static final int MEMORY_SIZE_MASK = 3 << MEMORY_SIZE_SHIFT;
	}

	/**
	 * Show branch size (eg.<!-- --> <code>SHORT</code>, <code>NEAR PTR</code>)
	 */
	public boolean getBranchSize() {
		return (flags & Flags.NO_BRANCH_SIZE) == 0;
	}

	/**
	 * Show branch size (eg.<!-- --> <code>SHORT</code>, <code>NEAR PTR</code>)
	 */
	public void setBranchSize(boolean value) {
		if (value)
			flags &= ~Flags.NO_BRANCH_SIZE;
		else
			flags |= Flags.NO_BRANCH_SIZE;
	}

	/**
	 * If <code>true</code>, show <code>RIP</code> relative addresses as <code>[rip+12345678h]</code>, else show the linear address eg.<!-- -->
	 * <code>[1029384756AFBECDh]</code>
	 */
	public boolean getRipRelativeAddresses() {
		return (flags & Flags.RIP_RELATIVE_ADDRESSES) != 0;
	}

	/**
	 * If <code>true</code>, show <code>RIP</code> relative addresses as <code>[rip+12345678h]</code>, else show the linear address eg.<!-- -->
	 * <code>[1029384756AFBECDh]</code>
	 */
	public void setRipRelativeAddresses(boolean value) {
		if (value)
			flags |= Flags.RIP_RELATIVE_ADDRESSES;
		else
			flags &= ~Flags.RIP_RELATIVE_ADDRESSES;
	}

	/**
	 * Memory size options
	 */
	public int getMemorySizeOptions() {
		return flags >>> Flags.MEMORY_SIZE_SHIFT;
	}

	/**
	 * Memory size options
	 */
	public void setMemorySizeOptions(int value) {
		flags = (flags & ~Flags.MEMORY_SIZE_MASK) | (value << Flags.MEMORY_SIZE_SHIFT);
	}

	private FormatterOperandOptions(int flags) {
		this.flags = flags;
	}

	/**
	 * DO NOT USE: INTERNAL API
	 *
	 * @deprecated Not part of the public API
	 */
	@Deprecated
	public FormatterOperandOptions withFlags(int flags) {
		return new FormatterOperandOptions(flags);
	}

	/**
	 * DO NOT USE: INTERNAL API
	 *
	 * @deprecated Not part of the public API
	 */
	@Deprecated
	public FormatterOperandOptions withMemorySizeOptions(int options) {
		return new FormatterOperandOptions(options << Flags.MEMORY_SIZE_SHIFT);
	}
}
