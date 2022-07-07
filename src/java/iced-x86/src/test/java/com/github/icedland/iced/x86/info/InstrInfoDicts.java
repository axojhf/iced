// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.info;

import java.util.HashMap;

final class InstrInfoDicts {
	static final HashMap<String, Integer> toOpAccess = createOpAccess();
	private static HashMap<String, Integer> createOpAccess() {
		HashMap<String, Integer> map = new HashMap<String, Integer>(8);
		map.put("n", OpAccess.NONE);
		map.put("r", OpAccess.READ);
		map.put("cr", OpAccess.COND_READ);
		map.put("w", OpAccess.WRITE);
		map.put("cw", OpAccess.COND_WRITE);
		map.put("rw", OpAccess.READ_WRITE);
		map.put("rcw", OpAccess.READ_COND_WRITE);
		map.put("nma", OpAccess.NO_MEM_ACCESS);
		return map;
	}

	static final HashMap<String, Integer> toMemorySizeFlags = createMemorySizeFlags();
	private static HashMap<String, Integer> createMemorySizeFlags() {
		HashMap<String, Integer> map = new HashMap<String, Integer>(3);
		map.put("signed", MemorySizeFlags.SIGNED);
		map.put("bcst", MemorySizeFlags.BROADCAST);
		map.put("packed", MemorySizeFlags.PACKED);
		return map;
	}

	static final HashMap<String, Integer> toRegisterFlags = createRegisterFlags();
	private static HashMap<String, Integer> createRegisterFlags() {
		HashMap<String, Integer> map = new HashMap<String, Integer>(19);
		map.put("seg", RegisterFlags.SEGMENT_REGISTER);
		map.put("gpr", RegisterFlags.GPR);
		map.put("gpr8", RegisterFlags.GPR8);
		map.put("gpr16", RegisterFlags.GPR16);
		map.put("gpr32", RegisterFlags.GPR32);
		map.put("gpr64", RegisterFlags.GPR64);
		map.put("xmm", RegisterFlags.XMM);
		map.put("ymm", RegisterFlags.YMM);
		map.put("zmm", RegisterFlags.ZMM);
		map.put("vec", RegisterFlags.VECTOR_REGISTER);
		map.put("ip", RegisterFlags.IP);
		map.put("k", RegisterFlags.K);
		map.put("bnd", RegisterFlags.BND);
		map.put("cr", RegisterFlags.CR);
		map.put("dr", RegisterFlags.DR);
		map.put("tr", RegisterFlags.TR);
		map.put("st", RegisterFlags.ST);
		map.put("mm", RegisterFlags.MM);
		map.put("tmm", RegisterFlags.TMM);
		return map;
	}
}
