// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

import java.util.HashMap;

public final class ToRegister {
	public static Integer tryGet(String key) {
		return map.get(key);
	}

	public static int get(String key) {
		Integer value = tryGet(key);
		if (value == null)
			throw new UnsupportedOperationException(String.format("Couldn't find enum variant Register.%s", key));
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
		HashMap<String, Integer> map = new HashMap<String, Integer>(256);
		initMap0(map);
		return map;
	}

	@SuppressWarnings("deprecation")
	private static void initMap0(HashMap<String, Integer> map) {
		map.put("none", Register.NONE);
		map.put("al", Register.AL);
		map.put("cl", Register.CL);
		map.put("dl", Register.DL);
		map.put("bl", Register.BL);
		map.put("ah", Register.AH);
		map.put("ch", Register.CH);
		map.put("dh", Register.DH);
		map.put("bh", Register.BH);
		map.put("spl", Register.SPL);
		map.put("bpl", Register.BPL);
		map.put("sil", Register.SIL);
		map.put("dil", Register.DIL);
		map.put("r8l", Register.R8L);
		map.put("r9l", Register.R9L);
		map.put("r10l", Register.R10L);
		map.put("r11l", Register.R11L);
		map.put("r12l", Register.R12L);
		map.put("r13l", Register.R13L);
		map.put("r14l", Register.R14L);
		map.put("r15l", Register.R15L);
		map.put("ax", Register.AX);
		map.put("cx", Register.CX);
		map.put("dx", Register.DX);
		map.put("bx", Register.BX);
		map.put("sp", Register.SP);
		map.put("bp", Register.BP);
		map.put("si", Register.SI);
		map.put("di", Register.DI);
		map.put("r8w", Register.R8W);
		map.put("r9w", Register.R9W);
		map.put("r10w", Register.R10W);
		map.put("r11w", Register.R11W);
		map.put("r12w", Register.R12W);
		map.put("r13w", Register.R13W);
		map.put("r14w", Register.R14W);
		map.put("r15w", Register.R15W);
		map.put("eax", Register.EAX);
		map.put("ecx", Register.ECX);
		map.put("edx", Register.EDX);
		map.put("ebx", Register.EBX);
		map.put("esp", Register.ESP);
		map.put("ebp", Register.EBP);
		map.put("esi", Register.ESI);
		map.put("edi", Register.EDI);
		map.put("r8d", Register.R8D);
		map.put("r9d", Register.R9D);
		map.put("r10d", Register.R10D);
		map.put("r11d", Register.R11D);
		map.put("r12d", Register.R12D);
		map.put("r13d", Register.R13D);
		map.put("r14d", Register.R14D);
		map.put("r15d", Register.R15D);
		map.put("rax", Register.RAX);
		map.put("rcx", Register.RCX);
		map.put("rdx", Register.RDX);
		map.put("rbx", Register.RBX);
		map.put("rsp", Register.RSP);
		map.put("rbp", Register.RBP);
		map.put("rsi", Register.RSI);
		map.put("rdi", Register.RDI);
		map.put("r8", Register.R8);
		map.put("r9", Register.R9);
		map.put("r10", Register.R10);
		map.put("r11", Register.R11);
		map.put("r12", Register.R12);
		map.put("r13", Register.R13);
		map.put("r14", Register.R14);
		map.put("r15", Register.R15);
		map.put("eip", Register.EIP);
		map.put("rip", Register.RIP);
		map.put("es", Register.ES);
		map.put("cs", Register.CS);
		map.put("ss", Register.SS);
		map.put("ds", Register.DS);
		map.put("fs", Register.FS);
		map.put("gs", Register.GS);
		map.put("xmm0", Register.XMM0);
		map.put("xmm1", Register.XMM1);
		map.put("xmm2", Register.XMM2);
		map.put("xmm3", Register.XMM3);
		map.put("xmm4", Register.XMM4);
		map.put("xmm5", Register.XMM5);
		map.put("xmm6", Register.XMM6);
		map.put("xmm7", Register.XMM7);
		map.put("xmm8", Register.XMM8);
		map.put("xmm9", Register.XMM9);
		map.put("xmm10", Register.XMM10);
		map.put("xmm11", Register.XMM11);
		map.put("xmm12", Register.XMM12);
		map.put("xmm13", Register.XMM13);
		map.put("xmm14", Register.XMM14);
		map.put("xmm15", Register.XMM15);
		map.put("xmm16", Register.XMM16);
		map.put("xmm17", Register.XMM17);
		map.put("xmm18", Register.XMM18);
		map.put("xmm19", Register.XMM19);
		map.put("xmm20", Register.XMM20);
		map.put("xmm21", Register.XMM21);
		map.put("xmm22", Register.XMM22);
		map.put("xmm23", Register.XMM23);
		map.put("xmm24", Register.XMM24);
		map.put("xmm25", Register.XMM25);
		map.put("xmm26", Register.XMM26);
		map.put("xmm27", Register.XMM27);
		map.put("xmm28", Register.XMM28);
		map.put("xmm29", Register.XMM29);
		map.put("xmm30", Register.XMM30);
		map.put("xmm31", Register.XMM31);
		map.put("ymm0", Register.YMM0);
		map.put("ymm1", Register.YMM1);
		map.put("ymm2", Register.YMM2);
		map.put("ymm3", Register.YMM3);
		map.put("ymm4", Register.YMM4);
		map.put("ymm5", Register.YMM5);
		map.put("ymm6", Register.YMM6);
		map.put("ymm7", Register.YMM7);
		map.put("ymm8", Register.YMM8);
		map.put("ymm9", Register.YMM9);
		map.put("ymm10", Register.YMM10);
		map.put("ymm11", Register.YMM11);
		map.put("ymm12", Register.YMM12);
		map.put("ymm13", Register.YMM13);
		map.put("ymm14", Register.YMM14);
		map.put("ymm15", Register.YMM15);
		map.put("ymm16", Register.YMM16);
		map.put("ymm17", Register.YMM17);
		map.put("ymm18", Register.YMM18);
		map.put("ymm19", Register.YMM19);
		map.put("ymm20", Register.YMM20);
		map.put("ymm21", Register.YMM21);
		map.put("ymm22", Register.YMM22);
		map.put("ymm23", Register.YMM23);
		map.put("ymm24", Register.YMM24);
		map.put("ymm25", Register.YMM25);
		map.put("ymm26", Register.YMM26);
		map.put("ymm27", Register.YMM27);
		map.put("ymm28", Register.YMM28);
		map.put("ymm29", Register.YMM29);
		map.put("ymm30", Register.YMM30);
		map.put("ymm31", Register.YMM31);
		map.put("zmm0", Register.ZMM0);
		map.put("zmm1", Register.ZMM1);
		map.put("zmm2", Register.ZMM2);
		map.put("zmm3", Register.ZMM3);
		map.put("zmm4", Register.ZMM4);
		map.put("zmm5", Register.ZMM5);
		map.put("zmm6", Register.ZMM6);
		map.put("zmm7", Register.ZMM7);
		map.put("zmm8", Register.ZMM8);
		map.put("zmm9", Register.ZMM9);
		map.put("zmm10", Register.ZMM10);
		map.put("zmm11", Register.ZMM11);
		map.put("zmm12", Register.ZMM12);
		map.put("zmm13", Register.ZMM13);
		map.put("zmm14", Register.ZMM14);
		map.put("zmm15", Register.ZMM15);
		map.put("zmm16", Register.ZMM16);
		map.put("zmm17", Register.ZMM17);
		map.put("zmm18", Register.ZMM18);
		map.put("zmm19", Register.ZMM19);
		map.put("zmm20", Register.ZMM20);
		map.put("zmm21", Register.ZMM21);
		map.put("zmm22", Register.ZMM22);
		map.put("zmm23", Register.ZMM23);
		map.put("zmm24", Register.ZMM24);
		map.put("zmm25", Register.ZMM25);
		map.put("zmm26", Register.ZMM26);
		map.put("zmm27", Register.ZMM27);
		map.put("zmm28", Register.ZMM28);
		map.put("zmm29", Register.ZMM29);
		map.put("zmm30", Register.ZMM30);
		map.put("zmm31", Register.ZMM31);
		map.put("k0", Register.K0);
		map.put("k1", Register.K1);
		map.put("k2", Register.K2);
		map.put("k3", Register.K3);
		map.put("k4", Register.K4);
		map.put("k5", Register.K5);
		map.put("k6", Register.K6);
		map.put("k7", Register.K7);
		map.put("bnd0", Register.BND0);
		map.put("bnd1", Register.BND1);
		map.put("bnd2", Register.BND2);
		map.put("bnd3", Register.BND3);
		map.put("cr0", Register.CR0);
		map.put("cr1", Register.CR1);
		map.put("cr2", Register.CR2);
		map.put("cr3", Register.CR3);
		map.put("cr4", Register.CR4);
		map.put("cr5", Register.CR5);
		map.put("cr6", Register.CR6);
		map.put("cr7", Register.CR7);
		map.put("cr8", Register.CR8);
		map.put("cr9", Register.CR9);
		map.put("cr10", Register.CR10);
		map.put("cr11", Register.CR11);
		map.put("cr12", Register.CR12);
		map.put("cr13", Register.CR13);
		map.put("cr14", Register.CR14);
		map.put("cr15", Register.CR15);
		map.put("dr0", Register.DR0);
		map.put("dr1", Register.DR1);
		map.put("dr2", Register.DR2);
		map.put("dr3", Register.DR3);
		map.put("dr4", Register.DR4);
		map.put("dr5", Register.DR5);
		map.put("dr6", Register.DR6);
		map.put("dr7", Register.DR7);
		map.put("dr8", Register.DR8);
		map.put("dr9", Register.DR9);
		map.put("dr10", Register.DR10);
		map.put("dr11", Register.DR11);
		map.put("dr12", Register.DR12);
		map.put("dr13", Register.DR13);
		map.put("dr14", Register.DR14);
		map.put("dr15", Register.DR15);
		map.put("st0", Register.ST0);
		map.put("st1", Register.ST1);
		map.put("st2", Register.ST2);
		map.put("st3", Register.ST3);
		map.put("st4", Register.ST4);
		map.put("st5", Register.ST5);
		map.put("st6", Register.ST6);
		map.put("st7", Register.ST7);
		map.put("mm0", Register.MM0);
		map.put("mm1", Register.MM1);
		map.put("mm2", Register.MM2);
		map.put("mm3", Register.MM3);
		map.put("mm4", Register.MM4);
		map.put("mm5", Register.MM5);
		map.put("mm6", Register.MM6);
		map.put("mm7", Register.MM7);
		map.put("tr0", Register.TR0);
		map.put("tr1", Register.TR1);
		map.put("tr2", Register.TR2);
		map.put("tr3", Register.TR3);
		map.put("tr4", Register.TR4);
		map.put("tr5", Register.TR5);
		map.put("tr6", Register.TR6);
		map.put("tr7", Register.TR7);
		map.put("tmm0", Register.TMM0);
		map.put("tmm1", Register.TMM1);
		map.put("tmm2", Register.TMM2);
		map.put("tmm3", Register.TMM3);
		map.put("tmm4", Register.TMM4);
		map.put("tmm5", Register.TMM5);
		map.put("tmm6", Register.TMM6);
		map.put("tmm7", Register.TMM7);
		map.put("dontuse0", Register.DONTUSE0);
		map.put("dontusefa", Register.DONTUSEFA);
		map.put("dontusefb", Register.DONTUSEFB);
		map.put("dontusefc", Register.DONTUSEFC);
		map.put("dontusefd", Register.DONTUSEFD);
		map.put("dontusefe", Register.DONTUSEFE);
		map.put("dontuseff", Register.DONTUSEFF);
	}
}
