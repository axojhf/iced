// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

import java.util.HashMap;

public final class ToTupleType {
	public static Integer tryGet(String key) {
		return map.get(key);
	}

	public static int get(String key) {
		Integer value = tryGet(key);
		if (value == null)
			throw new UnsupportedOperationException(String.format("Couldn't find enum variant TupleType.%s", key));
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
		HashMap<String, Integer> map = new HashMap<String, Integer>(19);
		initMap0(map);
		return map;
	}

	private static void initMap0(HashMap<String, Integer> map) {
		map.put("N1", TupleType.N1);
		map.put("N2", TupleType.N2);
		map.put("N4", TupleType.N4);
		map.put("N8", TupleType.N8);
		map.put("N16", TupleType.N16);
		map.put("N32", TupleType.N32);
		map.put("N64", TupleType.N64);
		map.put("N8b4", TupleType.N8B4);
		map.put("N16b4", TupleType.N16B4);
		map.put("N32b4", TupleType.N32B4);
		map.put("N64b4", TupleType.N64B4);
		map.put("N16b8", TupleType.N16B8);
		map.put("N32b8", TupleType.N32B8);
		map.put("N64b8", TupleType.N64B8);
		map.put("N4b2", TupleType.N4B2);
		map.put("N8b2", TupleType.N8B2);
		map.put("N16b2", TupleType.N16B2);
		map.put("N32b2", TupleType.N32B2);
		map.put("N64b2", TupleType.N64B2);
	}
}
