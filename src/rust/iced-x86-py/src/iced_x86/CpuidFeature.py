# SPDX-License-Identifier: MIT
# Copyright wtfsckgh@gmail.com
# Copyright iced contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
``CPUID`` feature flags
"""

from typing import List

INTEL8086: int = 0
"""
8086 or later
"""
INTEL8086_ONLY: int = 1
"""
8086 only
"""
INTEL186: int = 2
"""
80186 or later
"""
INTEL286: int = 3
"""
80286 or later
"""
INTEL286_ONLY: int = 4
"""
80286 only
"""
INTEL386: int = 5
"""
80386 or later
"""
INTEL386_ONLY: int = 6
"""
80386 only
"""
INTEL386_A0_ONLY: int = 7
"""
80386 A0-B0 stepping only (``XBTS``, ``IBTS`` instructions)
"""
INTEL486: int = 8
"""
Intel486 or later
"""
INTEL486_A_ONLY: int = 9
"""
Intel486 A stepping only (``CMPXCHG``)
"""
UMOV: int = 10
"""
UMOV (80386 and Intel486)
"""
IA64: int = 11
"""
IA-64
"""
X64: int = 12
"""
: CPUID.80000001H:EDX.LM[bit 29]
"""
ADX: int = 13
"""
: CPUID.(EAX=07H, ECX=0H):EBX.ADX[bit 19]
"""
AES: int = 14
"""
: CPUID.01H:ECX.AES[bit 25]
"""
AVX: int = 15
"""
: CPUID.01H:ECX.AVX[bit 28]
"""
AVX2: int = 16
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX2[bit 5]
"""
AVX512_4FMAPS: int = 17
"""
: CPUID.(EAX=07H, ECX=0H):EDX.AVX512_4FMAPS[bit 3]
"""
AVX512_4VNNIW: int = 18
"""
: CPUID.(EAX=07H, ECX=0H):EDX.AVX512_4VNNIW[bit 2]
"""
AVX512_BF16: int = 19
"""
: CPUID.(EAX=07H, ECX=1H):EAX.AVX512_BF16[bit 5]
"""
AVX512_BITALG: int = 20
"""
: CPUID.(EAX=07H, ECX=0H):ECX.AVX512_BITALG[bit 12]
"""
AVX512_IFMA: int = 21
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512_IFMA[bit 21]
"""
AVX512_VBMI: int = 22
"""
: CPUID.(EAX=07H, ECX=0H):ECX.AVX512_VBMI[bit 1]
"""
AVX512_VBMI2: int = 23
"""
: CPUID.(EAX=07H, ECX=0H):ECX.AVX512_VBMI2[bit 6]
"""
AVX512_VNNI: int = 24
"""
: CPUID.(EAX=07H, ECX=0H):ECX.AVX512_VNNI[bit 11]
"""
AVX512_VP2INTERSECT: int = 25
"""
: CPUID.(EAX=07H, ECX=0H):EDX.AVX512_VP2INTERSECT[bit 08]
"""
AVX512_VPOPCNTDQ: int = 26
"""
: CPUID.(EAX=07H, ECX=0H):ECX.AVX512_VPOPCNTDQ[bit 14]
"""
AVX512BW: int = 27
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512BW[bit 30]
"""
AVX512CD: int = 28
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512CD[bit 28]
"""
AVX512DQ: int = 29
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512DQ[bit 17]
"""
AVX512ER: int = 30
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512ER[bit 27]
"""
AVX512F: int = 31
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512F[bit 16]
"""
AVX512PF: int = 32
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512PF[bit 26]
"""
AVX512VL: int = 33
"""
: CPUID.(EAX=07H, ECX=0H):EBX.AVX512VL[bit 31]
"""
BMI1: int = 34
"""
: CPUID.(EAX=07H, ECX=0H):EBX.BMI1[bit 3]
"""
BMI2: int = 35
"""
: CPUID.(EAX=07H, ECX=0H):EBX.BMI2[bit 8]
"""
CET_IBT: int = 36
"""
: CPUID.(EAX=07H, ECX=0H):EDX.CET_IBT[bit 20]
"""
CET_SS: int = 37
"""
: CPUID.(EAX=07H, ECX=0H):ECX.CET_SS[bit 7]
"""
CL1INVMB: int = 38
"""
``CL1INVMB`` instruction (Intel SCC = Single-Chip Computer)
"""
CLDEMOTE: int = 39
"""
: CPUID.(EAX=07H, ECX=0H):ECX.CLDEMOTE[bit 25]
"""
CLFLUSHOPT: int = 40
"""
: CPUID.(EAX=07H, ECX=0H):EBX.CLFLUSHOPT[bit 23]
"""
CLFSH: int = 41
"""
: CPUID.01H:EDX.CLFSH[bit 19]
"""
CLWB: int = 42
"""
: CPUID.(EAX=07H, ECX=0H):EBX.CLWB[bit 24]
"""
CLZERO: int = 43
"""
: CPUID.80000008H:EBX.CLZERO[bit 0]
"""
CMOV: int = 44
"""
: CPUID.01H:EDX.CMOV[bit 15]
"""
CMPXCHG16B: int = 45
"""
: CPUID.01H:ECX.CMPXCHG16B[bit 13]
"""
CPUID: int = 46
"""
``RFLAGS.ID`` can be toggled
"""
CX8: int = 47
"""
: CPUID.01H:EDX.CX8[bit 8]
"""
D3NOW: int = 48
"""
: CPUID.80000001H:EDX.3DNOW[bit 31]
"""
D3NOWEXT: int = 49
"""
: CPUID.80000001H:EDX.3DNOWEXT[bit 30]
"""
OSS: int = 50
"""
: CPUID.(EAX=12H, ECX=0H):EAX.OSS[bit 5]
"""
ENQCMD: int = 51
"""
: CPUID.(EAX=07H, ECX=0H):ECX.ENQCMD[bit 29]
"""
F16C: int = 52
"""
: CPUID.01H:ECX.F16C[bit 29]
"""
FMA: int = 53
"""
: CPUID.01H:ECX.FMA[bit 12]
"""
FMA4: int = 54
"""
: CPUID.80000001H:ECX.FMA4[bit 16]
"""
FPU: int = 55
"""
: 8087 or later (CPUID.01H:EDX.FPU[bit 0])
"""
FPU287: int = 56
"""
80287 or later
"""
FPU287XL_ONLY: int = 57
"""
80287XL only
"""
FPU387: int = 58
"""
80387 or later
"""
FPU387SL_ONLY: int = 59
"""
80387SL only
"""
FSGSBASE: int = 60
"""
: CPUID.(EAX=07H, ECX=0H):EBX.FSGSBASE[bit 0]
"""
FXSR: int = 61
"""
: CPUID.01H:EDX.FXSR[bit 24]
"""
CYRIX_D3NOW: int = 62
"""
Cyrix (AMD Geode GX/LX) 3DNow! instructions
"""
GFNI: int = 63
"""
: CPUID.(EAX=07H, ECX=0H):ECX.GFNI[bit 8]
"""
HLE: int = 64
"""
: CPUID.(EAX=07H, ECX=0H):EBX.HLE[bit 4]
"""
HLE_OR_RTM: int = 65
"""
:class:`HLE` or :class:`RTM`
"""
INVEPT: int = 66
"""
IA32_VMX_EPT_VPID_CAP[bit 20]
"""
INVPCID: int = 67
"""
: CPUID.(EAX=07H, ECX=0H):EBX.INVPCID[bit 10]
"""
INVVPID: int = 68
"""
IA32_VMX_EPT_VPID_CAP[bit 32]
"""
LWP: int = 69
"""
: CPUID.80000001H:ECX.LWP[bit 15]
"""
LZCNT: int = 70
"""
: CPUID.80000001H:ECX.LZCNT[bit 5]
"""
MCOMMIT: int = 71
"""
: CPUID.80000008H:EBX.MCOMMIT[bit 8]
"""
MMX: int = 72
"""
: CPUID.01H:EDX.MMX[bit 23]
"""
MONITOR: int = 73
"""
: CPUID.01H:ECX.MONITOR[bit 3]
"""
MONITORX: int = 74
"""
: CPUID.80000001H:ECX.MONITORX[bit 29]
"""
MOVBE: int = 75
"""
: CPUID.01H:ECX.MOVBE[bit 22]
"""
MOVDIR64B: int = 76
"""
: CPUID.(EAX=07H, ECX=0H):ECX.MOVDIR64B[bit 28]
"""
MOVDIRI: int = 77
"""
: CPUID.(EAX=07H, ECX=0H):ECX.MOVDIRI[bit 27]
"""
MPX: int = 78
"""
: CPUID.(EAX=07H, ECX=0H):EBX.MPX[bit 14]
"""
MSR: int = 79
"""
: CPUID.01H:EDX.MSR[bit 5]
"""
MULTIBYTENOP: int = 80
"""
: Multi-byte nops (``0F1F /0``): CPUID.01H.EAX[Bits 11:8] = 0110B or 1111B
"""
PADLOCK_ACE: int = 81
"""
: CPUID.0C0000000H:EAX >= 0C0000001H AND CPUID.0C0000001H:EDX.ACE[Bits 7:6] = 11B ([6] = exists, [7] = enabled)
"""
PADLOCK_PHE: int = 82
"""
: CPUID.0C0000000H:EAX >= 0C0000001H AND CPUID.0C0000001H:EDX.PHE[Bits 11:10] = 11B ([10] = exists, [11] = enabled)
"""
PADLOCK_PMM: int = 83
"""
: CPUID.0C0000000H:EAX >= 0C0000001H AND CPUID.0C0000001H:EDX.PMM[Bits 13:12] = 11B ([12] = exists, [13] = enabled)
"""
PADLOCK_RNG: int = 84
"""
: CPUID.0C0000000H:EAX >= 0C0000001H AND CPUID.0C0000001H:EDX.RNG[Bits 3:2] = 11B ([2] = exists, [3] = enabled)
"""
PAUSE: int = 85
"""
``PAUSE`` instruction (Pentium 4 or later)
"""
PCLMULQDQ: int = 86
"""
: CPUID.01H:ECX.PCLMULQDQ[bit 1]
"""
PCOMMIT: int = 87
"""
: CPUID.(EAX=07H, ECX=0H):EBX.PCOMMIT[bit 22]
"""
PCONFIG: int = 88
"""
: CPUID.(EAX=07H, ECX=0H):EDX.PCONFIG[bit 18]
"""
PKU: int = 89
"""
: CPUID.(EAX=07H, ECX=0H):ECX.PKU[bit 3]
"""
POPCNT: int = 90
"""
: CPUID.01H:ECX.POPCNT[bit 23]
"""
PREFETCHW: int = 91
"""
: CPUID.80000001H:ECX.PREFETCHW[bit 8]
"""
PREFETCHWT1: int = 92
"""
: CPUID.(EAX=07H, ECX=0H):ECX.PREFETCHWT1[bit 0]
"""
PTWRITE: int = 93
"""
: CPUID.(EAX=14H, ECX=0H):EBX.PTWRITE[bit 4]
"""
RDPID: int = 94
"""
: CPUID.(EAX=07H, ECX=0H):ECX.RDPID[bit 22]
"""
RDPMC: int = 95
"""
``RDPMC`` instruction (Pentium MMX or later, or Pentium Pro or later)
"""
RDPRU: int = 96
"""
: CPUID.80000008H:EBX.RDPRU[bit 4]
"""
RDRAND: int = 97
"""
: CPUID.01H:ECX.RDRAND[bit 30]
"""
RDSEED: int = 98
"""
: CPUID.(EAX=07H, ECX=0H):EBX.RDSEED[bit 18]
"""
RDTSCP: int = 99
"""
: CPUID.80000001H:EDX.RDTSCP[bit 27]
"""
RTM: int = 100
"""
: CPUID.(EAX=07H, ECX=0H):EBX.RTM[bit 11]
"""
SEP: int = 101
"""
: CPUID.01H:EDX.SEP[bit 11]
"""
SGX1: int = 102
"""
: CPUID.(EAX=12H, ECX=0H):EAX.SGX1[bit 0]
"""
SHA: int = 103
"""
: CPUID.(EAX=07H, ECX=0H):EBX.SHA[bit 29]
"""
SKINIT: int = 104
"""
: CPUID.80000001H:ECX.SKINIT[bit 12]
"""
SKINIT_OR_SVM: int = 105
"""
:class:`SKINIT` or :class:`SVM`
"""
SMAP: int = 106
"""
: CPUID.(EAX=07H, ECX=0H):EBX.SMAP[bit 20]
"""
SMX: int = 107
"""
: CPUID.01H:ECX.SMX[bit 6]
"""
SSE: int = 108
"""
: CPUID.01H:EDX.SSE[bit 25]
"""
SSE2: int = 109
"""
: CPUID.01H:EDX.SSE2[bit 26]
"""
SSE3: int = 110
"""
: CPUID.01H:ECX.SSE3[bit 0]
"""
SSE4_1: int = 111
"""
: CPUID.01H:ECX.SSE4_1[bit 19]
"""
SSE4_2: int = 112
"""
: CPUID.01H:ECX.SSE4_2[bit 20]
"""
SSE4A: int = 113
"""
: CPUID.80000001H:ECX.SSE4A[bit 6]
"""
SSSE3: int = 114
"""
: CPUID.01H:ECX.SSSE3[bit 9]
"""
SVM: int = 115
"""
: CPUID.80000001H:ECX.SVM[bit 2]
"""
SEV_ES: int = 116
"""
: CPUID.8000001FH:EAX.SEV-ES[bit 3]
"""
SYSCALL: int = 117
"""
: CPUID.80000001H:EDX.SYSCALL[bit 11]
"""
TBM: int = 118
"""
: CPUID.80000001H:ECX.TBM[bit 21]
"""
TSC: int = 119
"""
: CPUID.01H:EDX.TSC[bit 4]
"""
VAES: int = 120
"""
: CPUID.(EAX=07H, ECX=0H):ECX.VAES[bit 9]
"""
VMX: int = 121
"""
: CPUID.01H:ECX.VMX[bit 5]
"""
VPCLMULQDQ: int = 122
"""
: CPUID.(EAX=07H, ECX=0H):ECX.VPCLMULQDQ[bit 10]
"""
WAITPKG: int = 123
"""
: CPUID.(EAX=07H, ECX=0H):ECX.WAITPKG[bit 5]
"""
WBNOINVD: int = 124
"""
: CPUID.(EAX=80000008H, ECX=0H):EBX.WBNOINVD[bit 9]
"""
XOP: int = 125
"""
: CPUID.80000001H:ECX.XOP[bit 11]
"""
XSAVE: int = 126
"""
: CPUID.01H:ECX.XSAVE[bit 26]
"""
XSAVEC: int = 127
"""
: CPUID.(EAX=0DH, ECX=1H):EAX.XSAVEC[bit 1]
"""
XSAVEOPT: int = 128
"""
: CPUID.(EAX=0DH, ECX=1H):EAX.XSAVEOPT[bit 0]
"""
XSAVES: int = 129
"""
: CPUID.(EAX=0DH, ECX=1H):EAX.XSAVES[bit 3]
"""
SEV_SNP: int = 130
"""
: CPUID.8000001FH:EAX.SEV-SNP[bit 4]
"""
SERIALIZE: int = 131
"""
: CPUID.(EAX=07H, ECX=0H):EDX.SERIALIZE[bit 14]
"""
TSXLDTRK: int = 132
"""
: CPUID.(EAX=07H, ECX=0H):EDX.TSXLDTRK[bit 16]
"""
INVLPGB: int = 133
"""
: CPUID.80000008H:EBX.INVLPGB[bit 3]
"""
AMX_BF16: int = 134
"""
: CPUID.(EAX=07H, ECX=0H):EDX.AMX-BF16[bit 22]
"""
AMX_TILE: int = 135
"""
: CPUID.(EAX=07H, ECX=0H):EDX.AMX-TILE[bit 24]
"""
AMX_INT8: int = 136
"""
: CPUID.(EAX=07H, ECX=0H):EDX.AMX-INT8[bit 25]
"""
CYRIX_FPU: int = 137
"""
Cyrix FPU instructions (Cyrix, AMD Geode GX/LX)
"""
CYRIX_SMM: int = 138
"""
: Cyrix SMM instructions: ``SVDC``, ``RSDC``, ``SVLDT``, ``RSLDT``, ``SVTS``, ``RSTS`` (Cyrix, AMD Geode GX/LX)
"""
CYRIX_SMINT: int = 139
"""
Cyrix ``SMINT 0F38`` (6x86MX and later, AMD Geode GX/LX)
"""
CYRIX_SMINT_0F7E: int = 140
"""
Cyrix ``SMINT 0F7E`` (6x86 or earlier)
"""
CYRIX_SHR: int = 141
"""
: Cyrix SMM instructions: ``RDSHR``, ``WRSHR`` (6x86MX, M II, Cyrix III)
"""
CYRIX_DDI: int = 142
"""
: Cyrix DDI instructions: ``BB0_Reset``, ``BB1_Reset``, ``CPU_READ``, ``CPU_WRITE`` (MediaGX, GXm, GXLV, GX1)
"""
CYRIX_EMMI: int = 143
"""
: Cyrix AND CPUID.80000001H:EDX.EMMI[bit 24]
"""
CYRIX_DMI: int = 144
"""
: Cyrix DMI instructions: ``DMINT``, ``RDM`` (AMD Geode GX/LX)
"""
CENTAUR_AIS: int = 145
"""
: CPUID.0C0000000H:EAX >= 0C0000001H AND CPUID.0C0000001H:EDX.AIS[Bits 1:0] = 11B ([0] = exists, [1] = enabled)
"""
MOV_TR: int = 146
"""
MOV to/from TR (80386, Intel486, Cyrix, Geode)
"""
SMM: int = 147
"""
``RSM`` instruction (some 386s, some 486s, Pentium and later)
"""
TDX: int = 148
"""
: CPUID.(EAX=??H, ECX=?H):???.????[bit ??]
"""
KL: int = 149
"""
: CPUID.(EAX=07H, ECX=0H):ECX.KL[bit 23]
"""
AESKLE: int = 150
"""
: CPUID.19H:EBX.AESKLE[bit 0]
"""
WIDE_KL: int = 151
"""
: CPUID.19H:EBX.WIDE_KL[bit 2]
"""
UINTR: int = 152
"""
: CPUID.(EAX=07H, ECX=0H):EDX.UINTR[bit 5]
"""
HRESET: int = 153
"""
: CPUID.(EAX=07H, ECX=01H):EAX.HRESET[bit 22]
"""
AVX_VNNI: int = 154
"""
: CPUID.(EAX=07H, ECX=01H):EAX.AVX-VNNI[bit 4]
"""
PADLOCK_GMI: int = 155
"""
: CPUID.0C0000000H:EAX >= 0C0000001H AND CPUID.0C0000001H:EDX.GMI[Bits 5:4] = 11B ([4] = exists, [5] = enabled)
"""

__all__: List[str] = []
