// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

/**
 * Tuple type (EVEX/MVEX) which can be used to get the disp8 scale factor {@code N}
 */
public final class TupleType {
	private TupleType() {
	}

	/**
	 * {@code N = 1}
	 */
	public static final int N1 = 0;
	/**
	 * {@code N = 2}
	 */
	public static final int N2 = 1;
	/**
	 * {@code N = 4}
	 */
	public static final int N4 = 2;
	/**
	 * {@code N = 8}
	 */
	public static final int N8 = 3;
	/**
	 * {@code N = 16}
	 */
	public static final int N16 = 4;
	/**
	 * {@code N = 32}
	 */
	public static final int N32 = 5;
	/**
	 * {@code N = 64}
	 */
	public static final int N64 = 6;
	/**
	 * {@code N = b ? 4 : 8}
	 */
	public static final int N8B4 = 7;
	/**
	 * {@code N = b ? 4 : 16}
	 */
	public static final int N16B4 = 8;
	/**
	 * {@code N = b ? 4 : 32}
	 */
	public static final int N32B4 = 9;
	/**
	 * {@code N = b ? 4 : 64}
	 */
	public static final int N64B4 = 10;
	/**
	 * {@code N = b ? 8 : 16}
	 */
	public static final int N16B8 = 11;
	/**
	 * {@code N = b ? 8 : 32}
	 */
	public static final int N32B8 = 12;
	/**
	 * {@code N = b ? 8 : 64}
	 */
	public static final int N64B8 = 13;
	/**
	 * {@code N = b ? 2 : 4}
	 */
	public static final int N4B2 = 14;
	/**
	 * {@code N = b ? 2 : 8}
	 */
	public static final int N8B2 = 15;
	/**
	 * {@code N = b ? 2 : 16}
	 */
	public static final int N16B2 = 16;
	/**
	 * {@code N = b ? 2 : 32}
	 */
	public static final int N32B2 = 17;
	/**
	 * {@code N = b ? 2 : 64}
	 */
	public static final int N64B2 = 18;
}
