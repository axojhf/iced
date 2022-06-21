// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

import java.util.HashMap;

import com.github.icedland.iced.x86.fmt.CC_l;

public final class ToCC_l {
	public static Integer tryGet(String key) {
		return map.get(key);
	}

	public static int get(String key) {
		Integer value = tryGet(key);
		if (value == null)
			throw new UnsupportedOperationException(String.format("Couldn't find enum variant CC_l.%s", key));
		return value.intValue();
	}

	public static String[] names() {
		return map.entrySet().stream().sorted((a, b) -> Integer.compareUnsigned(a.getValue(), b.getValue())).map(a -> a.getKey()).toArray(String[]::new);
	}

	public static Iterable<Integer> values() {
		return map.values();
	}

	public static int size() {
		return map.size();
	}

	public static HashMap<String, Integer> copy() {
		return new HashMap<String, Integer>(map);
	}

	private static final HashMap<String, Integer> map = getMap();

	private static HashMap<String, Integer> getMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>(2);
		initMap0(map);
		return map;
	}

	private static void initMap0(HashMap<String, Integer> map) {
		map.put("l", CC_l.L);
		map.put("nge", CC_l.NGE);
	}
}
