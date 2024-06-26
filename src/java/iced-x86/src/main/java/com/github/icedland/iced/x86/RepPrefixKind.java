// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

/**
 * {@code REP}/{@code REPE}/{@code REPNE} prefix
 */
public final class RepPrefixKind {
	private RepPrefixKind() {
	}

	/**
	 * No {@code REP}/{@code REPE}/{@code REPNE} prefix
	 */
	public static final int NONE = 0;
	/**
	 * {@code REP}/{@code REPE} prefix
	 */
	public static final int REPE = 1;
	/**
	 * {@code REPNE} prefix
	 */
	public static final int REPNE = 2;
}
