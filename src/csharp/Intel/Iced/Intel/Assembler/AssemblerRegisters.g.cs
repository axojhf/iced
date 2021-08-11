// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

#nullable enable

#if ENCODER && BLOCK_ENCODER && CODE_ASSEMBLER
namespace Iced.Intel {
#pragma warning disable CS1591 // Missing XML comment for publicly visible type or member
	public static partial class AssemblerRegisters {
		public static readonly AssemblerRegister8 al = new AssemblerRegister8(Register.AL);
		public static readonly AssemblerRegister8 cl = new AssemblerRegister8(Register.CL);
		public static readonly AssemblerRegister8 dl = new AssemblerRegister8(Register.DL);
		public static readonly AssemblerRegister8 bl = new AssemblerRegister8(Register.BL);
		public static readonly AssemblerRegister8 ah = new AssemblerRegister8(Register.AH);
		public static readonly AssemblerRegister8 ch = new AssemblerRegister8(Register.CH);
		public static readonly AssemblerRegister8 dh = new AssemblerRegister8(Register.DH);
		public static readonly AssemblerRegister8 bh = new AssemblerRegister8(Register.BH);
		public static readonly AssemblerRegister8 spl = new AssemblerRegister8(Register.SPL);
		public static readonly AssemblerRegister8 bpl = new AssemblerRegister8(Register.BPL);
		public static readonly AssemblerRegister8 sil = new AssemblerRegister8(Register.SIL);
		public static readonly AssemblerRegister8 dil = new AssemblerRegister8(Register.DIL);
		public static readonly AssemblerRegister8 r8b = new AssemblerRegister8(Register.R8L);
		public static readonly AssemblerRegister8 r9b = new AssemblerRegister8(Register.R9L);
		public static readonly AssemblerRegister8 r10b = new AssemblerRegister8(Register.R10L);
		public static readonly AssemblerRegister8 r11b = new AssemblerRegister8(Register.R11L);
		public static readonly AssemblerRegister8 r12b = new AssemblerRegister8(Register.R12L);
		public static readonly AssemblerRegister8 r13b = new AssemblerRegister8(Register.R13L);
		public static readonly AssemblerRegister8 r14b = new AssemblerRegister8(Register.R14L);
		public static readonly AssemblerRegister8 r15b = new AssemblerRegister8(Register.R15L);
		public static readonly AssemblerRegister16 ax = new AssemblerRegister16(Register.AX);
		public static readonly AssemblerRegister16 cx = new AssemblerRegister16(Register.CX);
		public static readonly AssemblerRegister16 dx = new AssemblerRegister16(Register.DX);
		public static readonly AssemblerRegister16 bx = new AssemblerRegister16(Register.BX);
		public static readonly AssemblerRegister16 sp = new AssemblerRegister16(Register.SP);
		public static readonly AssemblerRegister16 bp = new AssemblerRegister16(Register.BP);
		public static readonly AssemblerRegister16 si = new AssemblerRegister16(Register.SI);
		public static readonly AssemblerRegister16 di = new AssemblerRegister16(Register.DI);
		public static readonly AssemblerRegister16 r8w = new AssemblerRegister16(Register.R8W);
		public static readonly AssemblerRegister16 r9w = new AssemblerRegister16(Register.R9W);
		public static readonly AssemblerRegister16 r10w = new AssemblerRegister16(Register.R10W);
		public static readonly AssemblerRegister16 r11w = new AssemblerRegister16(Register.R11W);
		public static readonly AssemblerRegister16 r12w = new AssemblerRegister16(Register.R12W);
		public static readonly AssemblerRegister16 r13w = new AssemblerRegister16(Register.R13W);
		public static readonly AssemblerRegister16 r14w = new AssemblerRegister16(Register.R14W);
		public static readonly AssemblerRegister16 r15w = new AssemblerRegister16(Register.R15W);
		public static readonly AssemblerRegister32 eax = new AssemblerRegister32(Register.EAX);
		public static readonly AssemblerRegister32 ecx = new AssemblerRegister32(Register.ECX);
		public static readonly AssemblerRegister32 edx = new AssemblerRegister32(Register.EDX);
		public static readonly AssemblerRegister32 ebx = new AssemblerRegister32(Register.EBX);
		public static readonly AssemblerRegister32 esp = new AssemblerRegister32(Register.ESP);
		public static readonly AssemblerRegister32 ebp = new AssemblerRegister32(Register.EBP);
		public static readonly AssemblerRegister32 esi = new AssemblerRegister32(Register.ESI);
		public static readonly AssemblerRegister32 edi = new AssemblerRegister32(Register.EDI);
		public static readonly AssemblerRegister32 r8d = new AssemblerRegister32(Register.R8D);
		public static readonly AssemblerRegister32 r9d = new AssemblerRegister32(Register.R9D);
		public static readonly AssemblerRegister32 r10d = new AssemblerRegister32(Register.R10D);
		public static readonly AssemblerRegister32 r11d = new AssemblerRegister32(Register.R11D);
		public static readonly AssemblerRegister32 r12d = new AssemblerRegister32(Register.R12D);
		public static readonly AssemblerRegister32 r13d = new AssemblerRegister32(Register.R13D);
		public static readonly AssemblerRegister32 r14d = new AssemblerRegister32(Register.R14D);
		public static readonly AssemblerRegister32 r15d = new AssemblerRegister32(Register.R15D);
		public static readonly AssemblerRegister64 rax = new AssemblerRegister64(Register.RAX);
		public static readonly AssemblerRegister64 rcx = new AssemblerRegister64(Register.RCX);
		public static readonly AssemblerRegister64 rdx = new AssemblerRegister64(Register.RDX);
		public static readonly AssemblerRegister64 rbx = new AssemblerRegister64(Register.RBX);
		public static readonly AssemblerRegister64 rsp = new AssemblerRegister64(Register.RSP);
		public static readonly AssemblerRegister64 rbp = new AssemblerRegister64(Register.RBP);
		public static readonly AssemblerRegister64 rsi = new AssemblerRegister64(Register.RSI);
		public static readonly AssemblerRegister64 rdi = new AssemblerRegister64(Register.RDI);
		public static readonly AssemblerRegister64 r8 = new AssemblerRegister64(Register.R8);
		public static readonly AssemblerRegister64 r9 = new AssemblerRegister64(Register.R9);
		public static readonly AssemblerRegister64 r10 = new AssemblerRegister64(Register.R10);
		public static readonly AssemblerRegister64 r11 = new AssemblerRegister64(Register.R11);
		public static readonly AssemblerRegister64 r12 = new AssemblerRegister64(Register.R12);
		public static readonly AssemblerRegister64 r13 = new AssemblerRegister64(Register.R13);
		public static readonly AssemblerRegister64 r14 = new AssemblerRegister64(Register.R14);
		public static readonly AssemblerRegister64 r15 = new AssemblerRegister64(Register.R15);
		public static readonly AssemblerRegisterSegment es = new AssemblerRegisterSegment(Register.ES);
		public static readonly AssemblerRegisterSegment cs = new AssemblerRegisterSegment(Register.CS);
		public static readonly AssemblerRegisterSegment ss = new AssemblerRegisterSegment(Register.SS);
		public static readonly AssemblerRegisterSegment ds = new AssemblerRegisterSegment(Register.DS);
		public static readonly AssemblerRegisterSegment fs = new AssemblerRegisterSegment(Register.FS);
		public static readonly AssemblerRegisterSegment gs = new AssemblerRegisterSegment(Register.GS);
		public static readonly AssemblerRegisterST st0 = new AssemblerRegisterST(Register.ST0);
		public static readonly AssemblerRegisterST st1 = new AssemblerRegisterST(Register.ST1);
		public static readonly AssemblerRegisterST st2 = new AssemblerRegisterST(Register.ST2);
		public static readonly AssemblerRegisterST st3 = new AssemblerRegisterST(Register.ST3);
		public static readonly AssemblerRegisterST st4 = new AssemblerRegisterST(Register.ST4);
		public static readonly AssemblerRegisterST st5 = new AssemblerRegisterST(Register.ST5);
		public static readonly AssemblerRegisterST st6 = new AssemblerRegisterST(Register.ST6);
		public static readonly AssemblerRegisterST st7 = new AssemblerRegisterST(Register.ST7);
		public static readonly AssemblerRegisterCR cr0 = new AssemblerRegisterCR(Register.CR0);
		public static readonly AssemblerRegisterCR cr1 = new AssemblerRegisterCR(Register.CR1);
		public static readonly AssemblerRegisterCR cr2 = new AssemblerRegisterCR(Register.CR2);
		public static readonly AssemblerRegisterCR cr3 = new AssemblerRegisterCR(Register.CR3);
		public static readonly AssemblerRegisterCR cr4 = new AssemblerRegisterCR(Register.CR4);
		public static readonly AssemblerRegisterCR cr5 = new AssemblerRegisterCR(Register.CR5);
		public static readonly AssemblerRegisterCR cr6 = new AssemblerRegisterCR(Register.CR6);
		public static readonly AssemblerRegisterCR cr7 = new AssemblerRegisterCR(Register.CR7);
		public static readonly AssemblerRegisterCR cr8 = new AssemblerRegisterCR(Register.CR8);
		public static readonly AssemblerRegisterCR cr9 = new AssemblerRegisterCR(Register.CR9);
		public static readonly AssemblerRegisterCR cr10 = new AssemblerRegisterCR(Register.CR10);
		public static readonly AssemblerRegisterCR cr11 = new AssemblerRegisterCR(Register.CR11);
		public static readonly AssemblerRegisterCR cr12 = new AssemblerRegisterCR(Register.CR12);
		public static readonly AssemblerRegisterCR cr13 = new AssemblerRegisterCR(Register.CR13);
		public static readonly AssemblerRegisterCR cr14 = new AssemblerRegisterCR(Register.CR14);
		public static readonly AssemblerRegisterCR cr15 = new AssemblerRegisterCR(Register.CR15);
		public static readonly AssemblerRegisterDR dr0 = new AssemblerRegisterDR(Register.DR0);
		public static readonly AssemblerRegisterDR dr1 = new AssemblerRegisterDR(Register.DR1);
		public static readonly AssemblerRegisterDR dr2 = new AssemblerRegisterDR(Register.DR2);
		public static readonly AssemblerRegisterDR dr3 = new AssemblerRegisterDR(Register.DR3);
		public static readonly AssemblerRegisterDR dr4 = new AssemblerRegisterDR(Register.DR4);
		public static readonly AssemblerRegisterDR dr5 = new AssemblerRegisterDR(Register.DR5);
		public static readonly AssemblerRegisterDR dr6 = new AssemblerRegisterDR(Register.DR6);
		public static readonly AssemblerRegisterDR dr7 = new AssemblerRegisterDR(Register.DR7);
		public static readonly AssemblerRegisterDR dr8 = new AssemblerRegisterDR(Register.DR8);
		public static readonly AssemblerRegisterDR dr9 = new AssemblerRegisterDR(Register.DR9);
		public static readonly AssemblerRegisterDR dr10 = new AssemblerRegisterDR(Register.DR10);
		public static readonly AssemblerRegisterDR dr11 = new AssemblerRegisterDR(Register.DR11);
		public static readonly AssemblerRegisterDR dr12 = new AssemblerRegisterDR(Register.DR12);
		public static readonly AssemblerRegisterDR dr13 = new AssemblerRegisterDR(Register.DR13);
		public static readonly AssemblerRegisterDR dr14 = new AssemblerRegisterDR(Register.DR14);
		public static readonly AssemblerRegisterDR dr15 = new AssemblerRegisterDR(Register.DR15);
		public static readonly AssemblerRegisterTR tr0 = new AssemblerRegisterTR(Register.TR0);
		public static readonly AssemblerRegisterTR tr1 = new AssemblerRegisterTR(Register.TR1);
		public static readonly AssemblerRegisterTR tr2 = new AssemblerRegisterTR(Register.TR2);
		public static readonly AssemblerRegisterTR tr3 = new AssemblerRegisterTR(Register.TR3);
		public static readonly AssemblerRegisterTR tr4 = new AssemblerRegisterTR(Register.TR4);
		public static readonly AssemblerRegisterTR tr5 = new AssemblerRegisterTR(Register.TR5);
		public static readonly AssemblerRegisterTR tr6 = new AssemblerRegisterTR(Register.TR6);
		public static readonly AssemblerRegisterTR tr7 = new AssemblerRegisterTR(Register.TR7);
		public static readonly AssemblerRegisterBND bnd0 = new AssemblerRegisterBND(Register.BND0);
		public static readonly AssemblerRegisterBND bnd1 = new AssemblerRegisterBND(Register.BND1);
		public static readonly AssemblerRegisterBND bnd2 = new AssemblerRegisterBND(Register.BND2);
		public static readonly AssemblerRegisterBND bnd3 = new AssemblerRegisterBND(Register.BND3);
		public static readonly AssemblerRegisterK k0 = new AssemblerRegisterK(Register.K0);
		public static readonly AssemblerRegisterK k1 = new AssemblerRegisterK(Register.K1);
		public static readonly AssemblerRegisterK k2 = new AssemblerRegisterK(Register.K2);
		public static readonly AssemblerRegisterK k3 = new AssemblerRegisterK(Register.K3);
		public static readonly AssemblerRegisterK k4 = new AssemblerRegisterK(Register.K4);
		public static readonly AssemblerRegisterK k5 = new AssemblerRegisterK(Register.K5);
		public static readonly AssemblerRegisterK k6 = new AssemblerRegisterK(Register.K6);
		public static readonly AssemblerRegisterK k7 = new AssemblerRegisterK(Register.K7);
		public static readonly AssemblerRegisterMM mm0 = new AssemblerRegisterMM(Register.MM0);
		public static readonly AssemblerRegisterMM mm1 = new AssemblerRegisterMM(Register.MM1);
		public static readonly AssemblerRegisterMM mm2 = new AssemblerRegisterMM(Register.MM2);
		public static readonly AssemblerRegisterMM mm3 = new AssemblerRegisterMM(Register.MM3);
		public static readonly AssemblerRegisterMM mm4 = new AssemblerRegisterMM(Register.MM4);
		public static readonly AssemblerRegisterMM mm5 = new AssemblerRegisterMM(Register.MM5);
		public static readonly AssemblerRegisterMM mm6 = new AssemblerRegisterMM(Register.MM6);
		public static readonly AssemblerRegisterMM mm7 = new AssemblerRegisterMM(Register.MM7);
		public static readonly AssemblerRegisterXMM xmm0 = new AssemblerRegisterXMM(Register.XMM0);
		public static readonly AssemblerRegisterXMM xmm1 = new AssemblerRegisterXMM(Register.XMM1);
		public static readonly AssemblerRegisterXMM xmm2 = new AssemblerRegisterXMM(Register.XMM2);
		public static readonly AssemblerRegisterXMM xmm3 = new AssemblerRegisterXMM(Register.XMM3);
		public static readonly AssemblerRegisterXMM xmm4 = new AssemblerRegisterXMM(Register.XMM4);
		public static readonly AssemblerRegisterXMM xmm5 = new AssemblerRegisterXMM(Register.XMM5);
		public static readonly AssemblerRegisterXMM xmm6 = new AssemblerRegisterXMM(Register.XMM6);
		public static readonly AssemblerRegisterXMM xmm7 = new AssemblerRegisterXMM(Register.XMM7);
		public static readonly AssemblerRegisterXMM xmm8 = new AssemblerRegisterXMM(Register.XMM8);
		public static readonly AssemblerRegisterXMM xmm9 = new AssemblerRegisterXMM(Register.XMM9);
		public static readonly AssemblerRegisterXMM xmm10 = new AssemblerRegisterXMM(Register.XMM10);
		public static readonly AssemblerRegisterXMM xmm11 = new AssemblerRegisterXMM(Register.XMM11);
		public static readonly AssemblerRegisterXMM xmm12 = new AssemblerRegisterXMM(Register.XMM12);
		public static readonly AssemblerRegisterXMM xmm13 = new AssemblerRegisterXMM(Register.XMM13);
		public static readonly AssemblerRegisterXMM xmm14 = new AssemblerRegisterXMM(Register.XMM14);
		public static readonly AssemblerRegisterXMM xmm15 = new AssemblerRegisterXMM(Register.XMM15);
		public static readonly AssemblerRegisterXMM xmm16 = new AssemblerRegisterXMM(Register.XMM16);
		public static readonly AssemblerRegisterXMM xmm17 = new AssemblerRegisterXMM(Register.XMM17);
		public static readonly AssemblerRegisterXMM xmm18 = new AssemblerRegisterXMM(Register.XMM18);
		public static readonly AssemblerRegisterXMM xmm19 = new AssemblerRegisterXMM(Register.XMM19);
		public static readonly AssemblerRegisterXMM xmm20 = new AssemblerRegisterXMM(Register.XMM20);
		public static readonly AssemblerRegisterXMM xmm21 = new AssemblerRegisterXMM(Register.XMM21);
		public static readonly AssemblerRegisterXMM xmm22 = new AssemblerRegisterXMM(Register.XMM22);
		public static readonly AssemblerRegisterXMM xmm23 = new AssemblerRegisterXMM(Register.XMM23);
		public static readonly AssemblerRegisterXMM xmm24 = new AssemblerRegisterXMM(Register.XMM24);
		public static readonly AssemblerRegisterXMM xmm25 = new AssemblerRegisterXMM(Register.XMM25);
		public static readonly AssemblerRegisterXMM xmm26 = new AssemblerRegisterXMM(Register.XMM26);
		public static readonly AssemblerRegisterXMM xmm27 = new AssemblerRegisterXMM(Register.XMM27);
		public static readonly AssemblerRegisterXMM xmm28 = new AssemblerRegisterXMM(Register.XMM28);
		public static readonly AssemblerRegisterXMM xmm29 = new AssemblerRegisterXMM(Register.XMM29);
		public static readonly AssemblerRegisterXMM xmm30 = new AssemblerRegisterXMM(Register.XMM30);
		public static readonly AssemblerRegisterXMM xmm31 = new AssemblerRegisterXMM(Register.XMM31);
		public static readonly AssemblerRegisterYMM ymm0 = new AssemblerRegisterYMM(Register.YMM0);
		public static readonly AssemblerRegisterYMM ymm1 = new AssemblerRegisterYMM(Register.YMM1);
		public static readonly AssemblerRegisterYMM ymm2 = new AssemblerRegisterYMM(Register.YMM2);
		public static readonly AssemblerRegisterYMM ymm3 = new AssemblerRegisterYMM(Register.YMM3);
		public static readonly AssemblerRegisterYMM ymm4 = new AssemblerRegisterYMM(Register.YMM4);
		public static readonly AssemblerRegisterYMM ymm5 = new AssemblerRegisterYMM(Register.YMM5);
		public static readonly AssemblerRegisterYMM ymm6 = new AssemblerRegisterYMM(Register.YMM6);
		public static readonly AssemblerRegisterYMM ymm7 = new AssemblerRegisterYMM(Register.YMM7);
		public static readonly AssemblerRegisterYMM ymm8 = new AssemblerRegisterYMM(Register.YMM8);
		public static readonly AssemblerRegisterYMM ymm9 = new AssemblerRegisterYMM(Register.YMM9);
		public static readonly AssemblerRegisterYMM ymm10 = new AssemblerRegisterYMM(Register.YMM10);
		public static readonly AssemblerRegisterYMM ymm11 = new AssemblerRegisterYMM(Register.YMM11);
		public static readonly AssemblerRegisterYMM ymm12 = new AssemblerRegisterYMM(Register.YMM12);
		public static readonly AssemblerRegisterYMM ymm13 = new AssemblerRegisterYMM(Register.YMM13);
		public static readonly AssemblerRegisterYMM ymm14 = new AssemblerRegisterYMM(Register.YMM14);
		public static readonly AssemblerRegisterYMM ymm15 = new AssemblerRegisterYMM(Register.YMM15);
		public static readonly AssemblerRegisterYMM ymm16 = new AssemblerRegisterYMM(Register.YMM16);
		public static readonly AssemblerRegisterYMM ymm17 = new AssemblerRegisterYMM(Register.YMM17);
		public static readonly AssemblerRegisterYMM ymm18 = new AssemblerRegisterYMM(Register.YMM18);
		public static readonly AssemblerRegisterYMM ymm19 = new AssemblerRegisterYMM(Register.YMM19);
		public static readonly AssemblerRegisterYMM ymm20 = new AssemblerRegisterYMM(Register.YMM20);
		public static readonly AssemblerRegisterYMM ymm21 = new AssemblerRegisterYMM(Register.YMM21);
		public static readonly AssemblerRegisterYMM ymm22 = new AssemblerRegisterYMM(Register.YMM22);
		public static readonly AssemblerRegisterYMM ymm23 = new AssemblerRegisterYMM(Register.YMM23);
		public static readonly AssemblerRegisterYMM ymm24 = new AssemblerRegisterYMM(Register.YMM24);
		public static readonly AssemblerRegisterYMM ymm25 = new AssemblerRegisterYMM(Register.YMM25);
		public static readonly AssemblerRegisterYMM ymm26 = new AssemblerRegisterYMM(Register.YMM26);
		public static readonly AssemblerRegisterYMM ymm27 = new AssemblerRegisterYMM(Register.YMM27);
		public static readonly AssemblerRegisterYMM ymm28 = new AssemblerRegisterYMM(Register.YMM28);
		public static readonly AssemblerRegisterYMM ymm29 = new AssemblerRegisterYMM(Register.YMM29);
		public static readonly AssemblerRegisterYMM ymm30 = new AssemblerRegisterYMM(Register.YMM30);
		public static readonly AssemblerRegisterYMM ymm31 = new AssemblerRegisterYMM(Register.YMM31);
		public static readonly AssemblerRegisterZMM zmm0 = new AssemblerRegisterZMM(Register.ZMM0);
		public static readonly AssemblerRegisterZMM zmm1 = new AssemblerRegisterZMM(Register.ZMM1);
		public static readonly AssemblerRegisterZMM zmm2 = new AssemblerRegisterZMM(Register.ZMM2);
		public static readonly AssemblerRegisterZMM zmm3 = new AssemblerRegisterZMM(Register.ZMM3);
		public static readonly AssemblerRegisterZMM zmm4 = new AssemblerRegisterZMM(Register.ZMM4);
		public static readonly AssemblerRegisterZMM zmm5 = new AssemblerRegisterZMM(Register.ZMM5);
		public static readonly AssemblerRegisterZMM zmm6 = new AssemblerRegisterZMM(Register.ZMM6);
		public static readonly AssemblerRegisterZMM zmm7 = new AssemblerRegisterZMM(Register.ZMM7);
		public static readonly AssemblerRegisterZMM zmm8 = new AssemblerRegisterZMM(Register.ZMM8);
		public static readonly AssemblerRegisterZMM zmm9 = new AssemblerRegisterZMM(Register.ZMM9);
		public static readonly AssemblerRegisterZMM zmm10 = new AssemblerRegisterZMM(Register.ZMM10);
		public static readonly AssemblerRegisterZMM zmm11 = new AssemblerRegisterZMM(Register.ZMM11);
		public static readonly AssemblerRegisterZMM zmm12 = new AssemblerRegisterZMM(Register.ZMM12);
		public static readonly AssemblerRegisterZMM zmm13 = new AssemblerRegisterZMM(Register.ZMM13);
		public static readonly AssemblerRegisterZMM zmm14 = new AssemblerRegisterZMM(Register.ZMM14);
		public static readonly AssemblerRegisterZMM zmm15 = new AssemblerRegisterZMM(Register.ZMM15);
		public static readonly AssemblerRegisterZMM zmm16 = new AssemblerRegisterZMM(Register.ZMM16);
		public static readonly AssemblerRegisterZMM zmm17 = new AssemblerRegisterZMM(Register.ZMM17);
		public static readonly AssemblerRegisterZMM zmm18 = new AssemblerRegisterZMM(Register.ZMM18);
		public static readonly AssemblerRegisterZMM zmm19 = new AssemblerRegisterZMM(Register.ZMM19);
		public static readonly AssemblerRegisterZMM zmm20 = new AssemblerRegisterZMM(Register.ZMM20);
		public static readonly AssemblerRegisterZMM zmm21 = new AssemblerRegisterZMM(Register.ZMM21);
		public static readonly AssemblerRegisterZMM zmm22 = new AssemblerRegisterZMM(Register.ZMM22);
		public static readonly AssemblerRegisterZMM zmm23 = new AssemblerRegisterZMM(Register.ZMM23);
		public static readonly AssemblerRegisterZMM zmm24 = new AssemblerRegisterZMM(Register.ZMM24);
		public static readonly AssemblerRegisterZMM zmm25 = new AssemblerRegisterZMM(Register.ZMM25);
		public static readonly AssemblerRegisterZMM zmm26 = new AssemblerRegisterZMM(Register.ZMM26);
		public static readonly AssemblerRegisterZMM zmm27 = new AssemblerRegisterZMM(Register.ZMM27);
		public static readonly AssemblerRegisterZMM zmm28 = new AssemblerRegisterZMM(Register.ZMM28);
		public static readonly AssemblerRegisterZMM zmm29 = new AssemblerRegisterZMM(Register.ZMM29);
		public static readonly AssemblerRegisterZMM zmm30 = new AssemblerRegisterZMM(Register.ZMM30);
		public static readonly AssemblerRegisterZMM zmm31 = new AssemblerRegisterZMM(Register.ZMM31);
		public static readonly AssemblerRegisterTMM tmm0 = new AssemblerRegisterTMM(Register.TMM0);
		public static readonly AssemblerRegisterTMM tmm1 = new AssemblerRegisterTMM(Register.TMM1);
		public static readonly AssemblerRegisterTMM tmm2 = new AssemblerRegisterTMM(Register.TMM2);
		public static readonly AssemblerRegisterTMM tmm3 = new AssemblerRegisterTMM(Register.TMM3);
		public static readonly AssemblerRegisterTMM tmm4 = new AssemblerRegisterTMM(Register.TMM4);
		public static readonly AssemblerRegisterTMM tmm5 = new AssemblerRegisterTMM(Register.TMM5);
		public static readonly AssemblerRegisterTMM tmm6 = new AssemblerRegisterTMM(Register.TMM6);
		public static readonly AssemblerRegisterTMM tmm7 = new AssemblerRegisterTMM(Register.TMM7);
	}
}
#endif
