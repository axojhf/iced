// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

/**
 * <code>CPUID</code> feature flags
 */
public final class CpuidFeature {
	private CpuidFeature() {
	}

	/**
	 * 8086 or later
	 */
	public static final int INTEL8086 = 0;
	/**
	 * 8086 only
	 */
	public static final int INTEL8086_ONLY = 1;
	/**
	 * 80186 or later
	 */
	public static final int INTEL186 = 2;
	/**
	 * 80286 or later
	 */
	public static final int INTEL286 = 3;
	/**
	 * 80286 only
	 */
	public static final int INTEL286_ONLY = 4;
	/**
	 * 80386 or later
	 */
	public static final int INTEL386 = 5;
	/**
	 * 80386 only
	 */
	public static final int INTEL386_ONLY = 6;
	/**
	 * 80386 A0-B0 stepping only (<code>XBTS</code>, <code>IBTS</code> instructions)
	 */
	public static final int INTEL386_A0_ONLY = 7;
	/**
	 * Intel486 or later
	 */
	public static final int INTEL486 = 8;
	/**
	 * Intel486 A stepping only (<code>CMPXCHG</code>)
	 */
	public static final int INTEL486_A_ONLY = 9;
	/**
	 * UMOV (80386 and Intel486)
	 */
	public static final int UMOV = 10;
	/**
	 * IA-64
	 */
	public static final int IA64 = 11;
	/**
	 * CPUID.<!-- -->80000001H:EDX.<!-- -->LM[bit 29]
	 */
	public static final int X64 = 12;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->ADX[bit 19]
	 */
	public static final int ADX = 13;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->AES[bit 25]
	 */
	public static final int AES = 14;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->AVX[bit 28]
	 */
	public static final int AVX = 15;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX2[bit 5]
	 */
	public static final int AVX2 = 16;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->AVX512_4FMAPS[bit 3]
	 */
	public static final int AVX512_4FMAPS = 17;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->AVX512_4VNNIW[bit 2]
	 */
	public static final int AVX512_4VNNIW = 18;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=1H):EAX.<!-- -->AVX512_BF16[bit 5]
	 */
	public static final int AVX512_BF16 = 19;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->AVX512_BITALG[bit 12]
	 */
	public static final int AVX512_BITALG = 20;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512_IFMA[bit 21]
	 */
	public static final int AVX512_IFMA = 21;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->AVX512_VBMI[bit 1]
	 */
	public static final int AVX512_VBMI = 22;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->AVX512_VBMI2[bit 6]
	 */
	public static final int AVX512_VBMI2 = 23;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->AVX512_VNNI[bit 11]
	 */
	public static final int AVX512_VNNI = 24;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->AVX512_VP2INTERSECT[bit 08]
	 */
	public static final int AVX512_VP2INTERSECT = 25;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->AVX512_VPOPCNTDQ[bit 14]
	 */
	public static final int AVX512_VPOPCNTDQ = 26;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512BW[bit 30]
	 */
	public static final int AVX512BW = 27;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512CD[bit 28]
	 */
	public static final int AVX512CD = 28;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512DQ[bit 17]
	 */
	public static final int AVX512DQ = 29;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512ER[bit 27]
	 */
	public static final int AVX512ER = 30;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512F[bit 16]
	 */
	public static final int AVX512F = 31;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512PF[bit 26]
	 */
	public static final int AVX512PF = 32;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->AVX512VL[bit 31]
	 */
	public static final int AVX512VL = 33;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->BMI1[bit 3]
	 */
	public static final int BMI1 = 34;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->BMI2[bit 8]
	 */
	public static final int BMI2 = 35;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->CET_IBT[bit 20]
	 */
	public static final int CET_IBT = 36;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->CET_SS[bit 7]
	 */
	public static final int CET_SS = 37;
	/**
	 * <code>CL1INVMB</code> instruction (Intel SCC = Single-Chip Computer)
	 */
	public static final int CL1INVMB = 38;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->CLDEMOTE[bit 25]
	 */
	public static final int CLDEMOTE = 39;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->CLFLUSHOPT[bit 23]
	 */
	public static final int CLFLUSHOPT = 40;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->CLFSH[bit 19]
	 */
	public static final int CLFSH = 41;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->CLWB[bit 24]
	 */
	public static final int CLWB = 42;
	/**
	 * CPUID.<!-- -->80000008H:EBX.<!-- -->CLZERO[bit 0]
	 */
	public static final int CLZERO = 43;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->CMOV[bit 15]
	 */
	public static final int CMOV = 44;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->CMPXCHG16B[bit 13]
	 */
	public static final int CMPXCHG16B = 45;
	/**
	 * <code>RFLAGS.ID</code> can be toggled
	 */
	public static final int CPUID = 46;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->CX8[bit 8]
	 */
	public static final int CX8 = 47;
	/**
	 * CPUID.<!-- -->80000001H:EDX.<!-- -->3DNOW[bit 31]
	 */
	public static final int D3NOW = 48;
	/**
	 * CPUID.<!-- -->80000001H:EDX.<!-- -->3DNOWEXT[bit 30]
	 */
	public static final int D3NOWEXT = 49;
	/**
	 * CPUID.<!-- -->(EAX=12H, ECX=0H):EAX.<!-- -->OSS[bit 5]
	 */
	public static final int OSS = 50;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->ENQCMD[bit 29]
	 */
	public static final int ENQCMD = 51;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->F16C[bit 29]
	 */
	public static final int F16C = 52;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->FMA[bit 12]
	 */
	public static final int FMA = 53;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->FMA4[bit 16]
	 */
	public static final int FMA4 = 54;
	/**
	 * 8087 or later (CPUID.<!-- -->01H:EDX.<!-- -->FPU[bit 0])
	 */
	public static final int FPU = 55;
	/**
	 * 80287 or later
	 */
	public static final int FPU287 = 56;
	/**
	 * 80287XL only
	 */
	public static final int FPU287XL_ONLY = 57;
	/**
	 * 80387 or later
	 */
	public static final int FPU387 = 58;
	/**
	 * 80387SL only
	 */
	public static final int FPU387SL_ONLY = 59;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->FSGSBASE[bit 0]
	 */
	public static final int FSGSBASE = 60;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->FXSR[bit 24]
	 */
	public static final int FXSR = 61;
	/**
	 * Cyrix (AMD Geode GX/LX) 3DNow! instructions
	 */
	public static final int CYRIX_D3NOW = 62;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->GFNI[bit 8]
	 */
	public static final int GFNI = 63;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->HLE[bit 4]
	 */
	public static final int HLE = 64;
	/**
	 * {@link com.github.icedland.iced.x86.CpuidFeature#HLE} or {@link com.github.icedland.iced.x86.CpuidFeature#RTM}
	 */
	public static final int HLE_OR_RTM = 65;
	/**
	 * IA32_VMX_EPT_VPID_CAP[bit 20]
	 */
	public static final int INVEPT = 66;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->INVPCID[bit 10]
	 */
	public static final int INVPCID = 67;
	/**
	 * IA32_VMX_EPT_VPID_CAP[bit 32]
	 */
	public static final int INVVPID = 68;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->LWP[bit 15]
	 */
	public static final int LWP = 69;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->LZCNT[bit 5]
	 */
	public static final int LZCNT = 70;
	/**
	 * CPUID.<!-- -->80000008H:EBX.<!-- -->MCOMMIT[bit 8]
	 */
	public static final int MCOMMIT = 71;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->MMX[bit 23]
	 */
	public static final int MMX = 72;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->MONITOR[bit 3]
	 */
	public static final int MONITOR = 73;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->MONITORX[bit 29]
	 */
	public static final int MONITORX = 74;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->MOVBE[bit 22]
	 */
	public static final int MOVBE = 75;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->MOVDIR64B[bit 28]
	 */
	public static final int MOVDIR64B = 76;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->MOVDIRI[bit 27]
	 */
	public static final int MOVDIRI = 77;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->MPX[bit 14]
	 */
	public static final int MPX = 78;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->MSR[bit 5]
	 */
	public static final int MSR = 79;
	/**
	 * Multi-byte nops (<code>0F1F /0</code>): CPUID.<!-- -->01H.<!-- -->EAX[Bits 11:8] = 0110B or 1111B
	 */
	public static final int MULTIBYTENOP = 80;
	/**
	 * CPUID.<!-- -->0C0000000H:EAX &gt;= 0C0000001H AND CPUID.<!-- -->0C0000001H:EDX.<!-- -->ACE[Bits 7:6] = 11B ([6] = exists, [7] = enabled)
	 */
	public static final int PADLOCK_ACE = 81;
	/**
	 * CPUID.<!-- -->0C0000000H:EAX &gt;= 0C0000001H AND CPUID.<!-- -->0C0000001H:EDX.<!-- -->PHE[Bits 11:10] = 11B ([10] = exists, [11] = enabled)
	 */
	public static final int PADLOCK_PHE = 82;
	/**
	 * CPUID.<!-- -->0C0000000H:EAX &gt;= 0C0000001H AND CPUID.<!-- -->0C0000001H:EDX.<!-- -->PMM[Bits 13:12] = 11B ([12] = exists, [13] = enabled)
	 */
	public static final int PADLOCK_PMM = 83;
	/**
	 * CPUID.<!-- -->0C0000000H:EAX &gt;= 0C0000001H AND CPUID.<!-- -->0C0000001H:EDX.<!-- -->RNG[Bits 3:2] = 11B ([2] = exists, [3] = enabled)
	 */
	public static final int PADLOCK_RNG = 84;
	/**
	 * <code>PAUSE</code> instruction (Pentium 4 or later)
	 */
	public static final int PAUSE = 85;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->PCLMULQDQ[bit 1]
	 */
	public static final int PCLMULQDQ = 86;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->PCOMMIT[bit 22]
	 */
	public static final int PCOMMIT = 87;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->PCONFIG[bit 18]
	 */
	public static final int PCONFIG = 88;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->PKU[bit 3]
	 */
	public static final int PKU = 89;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->POPCNT[bit 23]
	 */
	public static final int POPCNT = 90;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->PREFETCHW[bit 8]
	 */
	public static final int PREFETCHW = 91;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->PREFETCHWT1[bit 0]
	 */
	public static final int PREFETCHWT1 = 92;
	/**
	 * CPUID.<!-- -->(EAX=14H, ECX=0H):EBX.<!-- -->PTWRITE[bit 4]
	 */
	public static final int PTWRITE = 93;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->RDPID[bit 22]
	 */
	public static final int RDPID = 94;
	/**
	 * <code>RDPMC</code> instruction (Pentium MMX or later, or Pentium Pro or later)
	 */
	public static final int RDPMC = 95;
	/**
	 * CPUID.<!-- -->80000008H:EBX.<!-- -->RDPRU[bit 4]
	 */
	public static final int RDPRU = 96;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->RDRAND[bit 30]
	 */
	public static final int RDRAND = 97;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->RDSEED[bit 18]
	 */
	public static final int RDSEED = 98;
	/**
	 * CPUID.<!-- -->80000001H:EDX.<!-- -->RDTSCP[bit 27]
	 */
	public static final int RDTSCP = 99;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->RTM[bit 11]
	 */
	public static final int RTM = 100;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->SEP[bit 11]
	 */
	public static final int SEP = 101;
	/**
	 * CPUID.<!-- -->(EAX=12H, ECX=0H):EAX.<!-- -->SGX1[bit 0]
	 */
	public static final int SGX1 = 102;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->SHA[bit 29]
	 */
	public static final int SHA = 103;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->SKINIT[bit 12]
	 */
	public static final int SKINIT = 104;
	/**
	 * {@link com.github.icedland.iced.x86.CpuidFeature#SKINIT} or {@link com.github.icedland.iced.x86.CpuidFeature#SVM}
	 */
	public static final int SKINIT_OR_SVM = 105;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EBX.<!-- -->SMAP[bit 20]
	 */
	public static final int SMAP = 106;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->SMX[bit 6]
	 */
	public static final int SMX = 107;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->SSE[bit 25]
	 */
	public static final int SSE = 108;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->SSE2[bit 26]
	 */
	public static final int SSE2 = 109;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->SSE3[bit 0]
	 */
	public static final int SSE3 = 110;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->SSE4_1[bit 19]
	 */
	public static final int SSE4_1 = 111;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->SSE4_2[bit 20]
	 */
	public static final int SSE4_2 = 112;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->SSE4A[bit 6]
	 */
	public static final int SSE4A = 113;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->SSSE3[bit 9]
	 */
	public static final int SSSE3 = 114;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->SVM[bit 2]
	 */
	public static final int SVM = 115;
	/**
	 * CPUID.<!-- -->8000001FH:EAX.<!-- -->SEV-ES[bit 3]
	 */
	public static final int SEV_ES = 116;
	/**
	 * CPUID.<!-- -->80000001H:EDX.<!-- -->SYSCALL[bit 11]
	 */
	public static final int SYSCALL = 117;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->TBM[bit 21]
	 */
	public static final int TBM = 118;
	/**
	 * CPUID.<!-- -->01H:EDX.<!-- -->TSC[bit 4]
	 */
	public static final int TSC = 119;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->VAES[bit 9]
	 */
	public static final int VAES = 120;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->VMX[bit 5]
	 */
	public static final int VMX = 121;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->VPCLMULQDQ[bit 10]
	 */
	public static final int VPCLMULQDQ = 122;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->WAITPKG[bit 5]
	 */
	public static final int WAITPKG = 123;
	/**
	 * CPUID.<!-- -->(EAX=80000008H, ECX=0H):EBX.<!-- -->WBNOINVD[bit 9]
	 */
	public static final int WBNOINVD = 124;
	/**
	 * CPUID.<!-- -->80000001H:ECX.<!-- -->XOP[bit 11]
	 */
	public static final int XOP = 125;
	/**
	 * CPUID.<!-- -->01H:ECX.<!-- -->XSAVE[bit 26]
	 */
	public static final int XSAVE = 126;
	/**
	 * CPUID.<!-- -->(EAX=0DH, ECX=1H):EAX.<!-- -->XSAVEC[bit 1]
	 */
	public static final int XSAVEC = 127;
	/**
	 * CPUID.<!-- -->(EAX=0DH, ECX=1H):EAX.<!-- -->XSAVEOPT[bit 0]
	 */
	public static final int XSAVEOPT = 128;
	/**
	 * CPUID.<!-- -->(EAX=0DH, ECX=1H):EAX.<!-- -->XSAVES[bit 3]
	 */
	public static final int XSAVES = 129;
	/**
	 * CPUID.<!-- -->8000001FH:EAX.<!-- -->SEV-SNP[bit 4]
	 */
	public static final int SEV_SNP = 130;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->SERIALIZE[bit 14]
	 */
	public static final int SERIALIZE = 131;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->TSXLDTRK[bit 16]
	 */
	public static final int TSXLDTRK = 132;
	/**
	 * CPUID.<!-- -->80000008H:EBX.<!-- -->INVLPGB[bit 3]
	 */
	public static final int INVLPGB = 133;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->AMX-BF16[bit 22]
	 */
	public static final int AMX_BF16 = 134;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->AMX-TILE[bit 24]
	 */
	public static final int AMX_TILE = 135;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->AMX-INT8[bit 25]
	 */
	public static final int AMX_INT8 = 136;
	/**
	 * Cyrix FPU instructions (Cyrix, AMD Geode GX/LX)
	 */
	public static final int CYRIX_FPU = 137;
	/**
	 * Cyrix SMM instructions: <code>SVDC</code>, <code>RSDC</code>, <code>SVLDT</code>, <code>RSLDT</code>, <code>SVTS</code>, <code>RSTS</code> (Cyrix, AMD Geode GX/LX)
	 */
	public static final int CYRIX_SMM = 138;
	/**
	 * Cyrix <code>SMINT 0F38</code> (6x86MX and later, AMD Geode GX/LX)
	 */
	public static final int CYRIX_SMINT = 139;
	/**
	 * Cyrix <code>SMINT 0F7E</code> (6x86 or earlier)
	 */
	public static final int CYRIX_SMINT_0F7E = 140;
	/**
	 * Cyrix SMM instructions: <code>RDSHR</code>, <code>WRSHR</code> (6x86MX, M II, Cyrix III)
	 */
	public static final int CYRIX_SHR = 141;
	/**
	 * Cyrix DDI instructions: <code>BB0_Reset</code>, <code>BB1_Reset</code>, <code>CPU_READ</code>, <code>CPU_WRITE</code> (MediaGX, GXm, GXLV, GX1)
	 */
	public static final int CYRIX_DDI = 142;
	/**
	 * Cyrix AND CPUID.<!-- -->80000001H:EDX.<!-- -->EMMI[bit 24]
	 */
	public static final int CYRIX_EMMI = 143;
	/**
	 * Cyrix DMI instructions: <code>DMINT</code>, <code>RDM</code> (AMD Geode GX/LX)
	 */
	public static final int CYRIX_DMI = 144;
	/**
	 * CPUID.<!-- -->0C0000000H:EAX &gt;= 0C0000001H AND CPUID.<!-- -->0C0000001H:EDX.<!-- -->AIS[Bits 1:0] = 11B ([0] = exists, [1] = enabled)
	 */
	public static final int CENTAUR_AIS = 145;
	/**
	 * MOV to/from TR (80386, Intel486, Cyrix, Geode)
	 */
	public static final int MOV_TR = 146;
	/**
	 * <code>RSM</code> instruction (some 386s, some 486s, Pentium and later)
	 */
	public static final int SMM = 147;
	/**
	 * CPUID.<!-- -->(EAX=??H, ECX=?H):???.<!-- -->????[bit ??]
	 */
	public static final int TDX = 148;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):ECX.<!-- -->KL[bit 23]
	 */
	public static final int KL = 149;
	/**
	 * CPUID.<!-- -->19H:EBX.<!-- -->AESKLE[bit 0]
	 */
	public static final int AESKLE = 150;
	/**
	 * CPUID.<!-- -->19H:EBX.<!-- -->WIDE_KL[bit 2]
	 */
	public static final int WIDE_KL = 151;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->UINTR[bit 5]
	 */
	public static final int UINTR = 152;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=01H):EAX.<!-- -->HRESET[bit 22]
	 */
	public static final int HRESET = 153;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=01H):EAX.<!-- -->AVX-VNNI[bit 4]
	 */
	public static final int AVX_VNNI = 154;
	/**
	 * CPUID.<!-- -->0C0000000H:EAX &gt;= 0C0000001H AND CPUID.<!-- -->0C0000001H:EDX.<!-- -->GMI[Bits 5:4] = 11B ([4] = exists, [5] = enabled)
	 */
	public static final int PADLOCK_GMI = 155;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=01H):EAX.<!-- -->FRED[bit 17]
	 */
	public static final int FRED = 156;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=01H):EAX.<!-- -->LKGS[bit 18]
	 */
	public static final int LKGS = 157;
	/**
	 * CPUID.<!-- -->(EAX=07H, ECX=0H):EDX.<!-- -->AVX512-FP16[bit 23]
	 */
	public static final int AVX512_FP16 = 158;
	/**
	 * Undocumented Intel <code>RDUDBG</code> and <code>WRUDBG</code> instructions
	 */
	public static final int UDBG = 159;
	/**
	 * Intel Knights Corner
	 */
	public static final int KNC = 160;
	/**
	 * Undocumented instruction
	 */
	public static final int PADLOCK_UNDOC = 161;
}
