// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

import java.util.HashMap;

public final class ToCpuidFeature {
	public static Integer tryGet(String key) {
		return map.get(key);
	}

	public static int get(String key) {
		Integer value = tryGet(key);
		if (value == null)
			throw new UnsupportedOperationException(String.format("Couldn't find enum variant CpuidFeature.%s", key));
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
		HashMap<String, Integer> map = new HashMap<String, Integer>(162);
		initMap0(map);
		return map;
	}

	private static void initMap0(HashMap<String, Integer> map) {
		map.put("INTEL8086", CpuidFeature.INTEL8086);
		map.put("INTEL8086_ONLY", CpuidFeature.INTEL8086_ONLY);
		map.put("INTEL186", CpuidFeature.INTEL186);
		map.put("INTEL286", CpuidFeature.INTEL286);
		map.put("INTEL286_ONLY", CpuidFeature.INTEL286_ONLY);
		map.put("INTEL386", CpuidFeature.INTEL386);
		map.put("INTEL386_ONLY", CpuidFeature.INTEL386_ONLY);
		map.put("INTEL386_A0_ONLY", CpuidFeature.INTEL386_A0_ONLY);
		map.put("INTEL486", CpuidFeature.INTEL486);
		map.put("INTEL486_A_ONLY", CpuidFeature.INTEL486_A_ONLY);
		map.put("UMOV", CpuidFeature.UMOV);
		map.put("IA64", CpuidFeature.IA64);
		map.put("X64", CpuidFeature.X64);
		map.put("ADX", CpuidFeature.ADX);
		map.put("AES", CpuidFeature.AES);
		map.put("AVX", CpuidFeature.AVX);
		map.put("AVX2", CpuidFeature.AVX2);
		map.put("AVX512_4FMAPS", CpuidFeature.AVX512_4FMAPS);
		map.put("AVX512_4VNNIW", CpuidFeature.AVX512_4VNNIW);
		map.put("AVX512_BF16", CpuidFeature.AVX512_BF16);
		map.put("AVX512_BITALG", CpuidFeature.AVX512_BITALG);
		map.put("AVX512_IFMA", CpuidFeature.AVX512_IFMA);
		map.put("AVX512_VBMI", CpuidFeature.AVX512_VBMI);
		map.put("AVX512_VBMI2", CpuidFeature.AVX512_VBMI2);
		map.put("AVX512_VNNI", CpuidFeature.AVX512_VNNI);
		map.put("AVX512_VP2INTERSECT", CpuidFeature.AVX512_VP2INTERSECT);
		map.put("AVX512_VPOPCNTDQ", CpuidFeature.AVX512_VPOPCNTDQ);
		map.put("AVX512BW", CpuidFeature.AVX512BW);
		map.put("AVX512CD", CpuidFeature.AVX512CD);
		map.put("AVX512DQ", CpuidFeature.AVX512DQ);
		map.put("AVX512ER", CpuidFeature.AVX512ER);
		map.put("AVX512F", CpuidFeature.AVX512F);
		map.put("AVX512PF", CpuidFeature.AVX512PF);
		map.put("AVX512VL", CpuidFeature.AVX512VL);
		map.put("BMI1", CpuidFeature.BMI1);
		map.put("BMI2", CpuidFeature.BMI2);
		map.put("CET_IBT", CpuidFeature.CET_IBT);
		map.put("CET_SS", CpuidFeature.CET_SS);
		map.put("CL1INVMB", CpuidFeature.CL1INVMB);
		map.put("CLDEMOTE", CpuidFeature.CLDEMOTE);
		map.put("CLFLUSHOPT", CpuidFeature.CLFLUSHOPT);
		map.put("CLFSH", CpuidFeature.CLFSH);
		map.put("CLWB", CpuidFeature.CLWB);
		map.put("CLZERO", CpuidFeature.CLZERO);
		map.put("CMOV", CpuidFeature.CMOV);
		map.put("CMPXCHG16B", CpuidFeature.CMPXCHG16B);
		map.put("CPUID", CpuidFeature.CPUID);
		map.put("CX8", CpuidFeature.CX8);
		map.put("D3NOW", CpuidFeature.D3NOW);
		map.put("D3NOWEXT", CpuidFeature.D3NOWEXT);
		map.put("OSS", CpuidFeature.OSS);
		map.put("ENQCMD", CpuidFeature.ENQCMD);
		map.put("F16C", CpuidFeature.F16C);
		map.put("FMA", CpuidFeature.FMA);
		map.put("FMA4", CpuidFeature.FMA4);
		map.put("FPU", CpuidFeature.FPU);
		map.put("FPU287", CpuidFeature.FPU287);
		map.put("FPU287XL_ONLY", CpuidFeature.FPU287XL_ONLY);
		map.put("FPU387", CpuidFeature.FPU387);
		map.put("FPU387SL_ONLY", CpuidFeature.FPU387SL_ONLY);
		map.put("FSGSBASE", CpuidFeature.FSGSBASE);
		map.put("FXSR", CpuidFeature.FXSR);
		map.put("CYRIX_D3NOW", CpuidFeature.CYRIX_D3NOW);
		map.put("GFNI", CpuidFeature.GFNI);
		map.put("HLE", CpuidFeature.HLE);
		map.put("HLE_or_RTM", CpuidFeature.HLE_OR_RTM);
		map.put("INVEPT", CpuidFeature.INVEPT);
		map.put("INVPCID", CpuidFeature.INVPCID);
		map.put("INVVPID", CpuidFeature.INVVPID);
		map.put("LWP", CpuidFeature.LWP);
		map.put("LZCNT", CpuidFeature.LZCNT);
		map.put("MCOMMIT", CpuidFeature.MCOMMIT);
		map.put("MMX", CpuidFeature.MMX);
		map.put("MONITOR", CpuidFeature.MONITOR);
		map.put("MONITORX", CpuidFeature.MONITORX);
		map.put("MOVBE", CpuidFeature.MOVBE);
		map.put("MOVDIR64B", CpuidFeature.MOVDIR64B);
		map.put("MOVDIRI", CpuidFeature.MOVDIRI);
		map.put("MPX", CpuidFeature.MPX);
		map.put("MSR", CpuidFeature.MSR);
		map.put("MULTIBYTENOP", CpuidFeature.MULTIBYTENOP);
		map.put("PADLOCK_ACE", CpuidFeature.PADLOCK_ACE);
		map.put("PADLOCK_PHE", CpuidFeature.PADLOCK_PHE);
		map.put("PADLOCK_PMM", CpuidFeature.PADLOCK_PMM);
		map.put("PADLOCK_RNG", CpuidFeature.PADLOCK_RNG);
		map.put("PAUSE", CpuidFeature.PAUSE);
		map.put("PCLMULQDQ", CpuidFeature.PCLMULQDQ);
		map.put("PCOMMIT", CpuidFeature.PCOMMIT);
		map.put("PCONFIG", CpuidFeature.PCONFIG);
		map.put("PKU", CpuidFeature.PKU);
		map.put("POPCNT", CpuidFeature.POPCNT);
		map.put("PREFETCHW", CpuidFeature.PREFETCHW);
		map.put("PREFETCHWT1", CpuidFeature.PREFETCHWT1);
		map.put("PTWRITE", CpuidFeature.PTWRITE);
		map.put("RDPID", CpuidFeature.RDPID);
		map.put("RDPMC", CpuidFeature.RDPMC);
		map.put("RDPRU", CpuidFeature.RDPRU);
		map.put("RDRAND", CpuidFeature.RDRAND);
		map.put("RDSEED", CpuidFeature.RDSEED);
		map.put("RDTSCP", CpuidFeature.RDTSCP);
		map.put("RTM", CpuidFeature.RTM);
		map.put("SEP", CpuidFeature.SEP);
		map.put("SGX1", CpuidFeature.SGX1);
		map.put("SHA", CpuidFeature.SHA);
		map.put("SKINIT", CpuidFeature.SKINIT);
		map.put("SKINIT_or_SVM", CpuidFeature.SKINIT_OR_SVM);
		map.put("SMAP", CpuidFeature.SMAP);
		map.put("SMX", CpuidFeature.SMX);
		map.put("SSE", CpuidFeature.SSE);
		map.put("SSE2", CpuidFeature.SSE2);
		map.put("SSE3", CpuidFeature.SSE3);
		map.put("SSE4_1", CpuidFeature.SSE4_1);
		map.put("SSE4_2", CpuidFeature.SSE4_2);
		map.put("SSE4A", CpuidFeature.SSE4A);
		map.put("SSSE3", CpuidFeature.SSSE3);
		map.put("SVM", CpuidFeature.SVM);
		map.put("SEV_ES", CpuidFeature.SEV_ES);
		map.put("SYSCALL", CpuidFeature.SYSCALL);
		map.put("TBM", CpuidFeature.TBM);
		map.put("TSC", CpuidFeature.TSC);
		map.put("VAES", CpuidFeature.VAES);
		map.put("VMX", CpuidFeature.VMX);
		map.put("VPCLMULQDQ", CpuidFeature.VPCLMULQDQ);
		map.put("WAITPKG", CpuidFeature.WAITPKG);
		map.put("WBNOINVD", CpuidFeature.WBNOINVD);
		map.put("XOP", CpuidFeature.XOP);
		map.put("XSAVE", CpuidFeature.XSAVE);
		map.put("XSAVEC", CpuidFeature.XSAVEC);
		map.put("XSAVEOPT", CpuidFeature.XSAVEOPT);
		map.put("XSAVES", CpuidFeature.XSAVES);
		map.put("SEV_SNP", CpuidFeature.SEV_SNP);
		map.put("SERIALIZE", CpuidFeature.SERIALIZE);
		map.put("TSXLDTRK", CpuidFeature.TSXLDTRK);
		map.put("INVLPGB", CpuidFeature.INVLPGB);
		map.put("AMX_BF16", CpuidFeature.AMX_BF16);
		map.put("AMX_TILE", CpuidFeature.AMX_TILE);
		map.put("AMX_INT8", CpuidFeature.AMX_INT8);
		map.put("CYRIX_FPU", CpuidFeature.CYRIX_FPU);
		map.put("CYRIX_SMM", CpuidFeature.CYRIX_SMM);
		map.put("CYRIX_SMINT", CpuidFeature.CYRIX_SMINT);
		map.put("CYRIX_SMINT_0F7E", CpuidFeature.CYRIX_SMINT_0F7E);
		map.put("CYRIX_SHR", CpuidFeature.CYRIX_SHR);
		map.put("CYRIX_DDI", CpuidFeature.CYRIX_DDI);
		map.put("CYRIX_EMMI", CpuidFeature.CYRIX_EMMI);
		map.put("CYRIX_DMI", CpuidFeature.CYRIX_DMI);
		map.put("CENTAUR_AIS", CpuidFeature.CENTAUR_AIS);
		map.put("MOV_TR", CpuidFeature.MOV_TR);
		map.put("SMM", CpuidFeature.SMM);
		map.put("TDX", CpuidFeature.TDX);
		map.put("KL", CpuidFeature.KL);
		map.put("AESKLE", CpuidFeature.AESKLE);
		map.put("WIDE_KL", CpuidFeature.WIDE_KL);
		map.put("UINTR", CpuidFeature.UINTR);
		map.put("HRESET", CpuidFeature.HRESET);
		map.put("AVX_VNNI", CpuidFeature.AVX_VNNI);
		map.put("PADLOCK_GMI", CpuidFeature.PADLOCK_GMI);
		map.put("FRED", CpuidFeature.FRED);
		map.put("LKGS", CpuidFeature.LKGS);
		map.put("AVX512_FP16", CpuidFeature.AVX512_FP16);
		map.put("UDBG", CpuidFeature.UDBG);
		map.put("KNC", CpuidFeature.KNC);
		map.put("PADLOCK_UNDOC", CpuidFeature.PADLOCK_UNDOC);
	}
}
