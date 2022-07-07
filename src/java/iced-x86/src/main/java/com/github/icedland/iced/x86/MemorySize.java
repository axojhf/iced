// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

package com.github.icedland.iced.x86;

import com.github.icedland.iced.x86.internal.IcedConstants;

/**
 * Size of a memory reference
 */
public final class MemorySize {
	private MemorySize() {
	}

	/**
	 * Gets the memory size info
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static MemorySizeInfo getInfo(int memorySize) {
		MemorySizeInfo[] infos = MemorySizeInfo.infos;
		return infos[memorySize];
	}

	/**
	 * Gets the size in bytes of the memory location or 0 if it's not accessed by the instruction or unknown or variable sized
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static int getSize(int memorySize) {
		return MemorySize.getInfo(memorySize).getSize();
	}

	/**
	 * Gets the size in bytes of the packed element. If it's not a packed data type, it's equal to {@link #getSize(int)}.
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static int getElementSize(int memorySize) {
		return MemorySize.getInfo(memorySize).getElementSize();
	}

	/**
	 * Gets the element type if it's packed data or the input value if it's not packed data
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static int getElementType(int memorySize) {
		return MemorySize.getInfo(memorySize).getElementType();
	}

	/**
	 * Gets the element type info if it's packed data or the input value if it's not packed data
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static MemorySizeInfo getElementTypeInfo(int memorySize) {
		return MemorySize.getInfo(MemorySize.getInfo(memorySize).getElementType());
	}

	/**
	 * {@code true} if it's signed data (signed integer or a floating point value)
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static boolean isSigned(int memorySize) {
		return MemorySize.getInfo(memorySize).isSigned();
	}

	/**
	 * Checks if {@code memorySize} is a broadcast memory type
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static boolean isBroadcast(int memorySize) {
		return Integer.compareUnsigned(memorySize, IcedConstants.FIRST_BROADCAST_MEMORY_SIZE) >= 0;
	}

	/**
	 * {@code true} if this is a packed data type, eg.<!-- --> {@link MemorySize#PACKED128_FLOAT32}
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static boolean isPacked(int memorySize) {
		return MemorySize.getInfo(memorySize).isPacked();
	}

	/**
	 * Gets the number of elements in the packed data type or 1 if it's not packed data ({@link #isPacked(int)})
	 *
	 * @param memorySize Memory size (a {@link MemorySize} enum variant)
	 */
	public static int getElementCount(int memorySize) {
		return MemorySize.getInfo(memorySize).getElementCount();
	}

	// GENERATOR-BEGIN: Variants
	// ⚠️This was generated by GENERATOR!🦹‍♂️
	/**
	 * Unknown size or the instruction doesn't reference any memory (eg.<!-- --> {@code LEA})
	 */
	public static final int UNKNOWN = 0;
	/**
	 * Memory location contains a {@code ubyte}
	 */
	public static final int UINT8 = 1;
	/**
	 * Memory location contains a {@code ushort}
	 */
	public static final int UINT16 = 2;
	/**
	 * Memory location contains a {@code uint}
	 */
	public static final int UINT32 = 3;
	/**
	 * Memory location contains a {@code uint52}
	 */
	public static final int UINT52 = 4;
	/**
	 * Memory location contains a {@code ulong}
	 */
	public static final int UINT64 = 5;
	/**
	 * Memory location contains a {@code uint128}
	 */
	public static final int UINT128 = 6;
	/**
	 * Memory location contains a {@code uint256}
	 */
	public static final int UINT256 = 7;
	/**
	 * Memory location contains a {@code uint512}
	 */
	public static final int UINT512 = 8;
	/**
	 * Memory location contains a {@code byte}
	 */
	public static final int INT8 = 9;
	/**
	 * Memory location contains a {@code short}
	 */
	public static final int INT16 = 10;
	/**
	 * Memory location contains a {@code int}
	 */
	public static final int INT32 = 11;
	/**
	 * Memory location contains a {@code long}
	 */
	public static final int INT64 = 12;
	/**
	 * Memory location contains a {@code int128}
	 */
	public static final int INT128 = 13;
	/**
	 * Memory location contains a {@code int256}
	 */
	public static final int INT256 = 14;
	/**
	 * Memory location contains a {@code int512}
	 */
	public static final int INT512 = 15;
	/**
	 * Memory location contains a seg:ptr pair, {@code ushort} (offset) + {@code ushort} (segment/selector)
	 */
	public static final int SEG_PTR16 = 16;
	/**
	 * Memory location contains a seg:ptr pair, {@code uint} (offset) + {@code ushort} (segment/selector)
	 */
	public static final int SEG_PTR32 = 17;
	/**
	 * Memory location contains a seg:ptr pair, {@code ulong} (offset) + {@code ushort} (segment/selector)
	 */
	public static final int SEG_PTR64 = 18;
	/**
	 * Memory location contains a 16-bit offset ({@code JMP/CALL WORD PTR [mem]})
	 */
	public static final int WORD_OFFSET = 19;
	/**
	 * Memory location contains a 32-bit offset ({@code JMP/CALL DWORD PTR [mem]})
	 */
	public static final int DWORD_OFFSET = 20;
	/**
	 * Memory location contains a 64-bit offset ({@code JMP/CALL QWORD PTR [mem]})
	 */
	public static final int QWORD_OFFSET = 21;
	/**
	 * Memory location contains two {@code ushort}s (16-bit {@code BOUND})
	 */
	public static final int BOUND16_WORD_WORD = 22;
	/**
	 * Memory location contains two {@code uint}s (32-bit {@code BOUND})
	 */
	public static final int BOUND32_DWORD_DWORD = 23;
	/**
	 * 32-bit {@code BNDMOV}, 2 x {@code uint}
	 */
	public static final int BND32 = 24;
	/**
	 * 64-bit {@code BNDMOV}, 2 x {@code ulong}
	 */
	public static final int BND64 = 25;
	/**
	 * Memory location contains a 16-bit limit and a 32-bit address (eg.<!-- --> {@code LGDTW}, {@code LGDTD})
	 */
	public static final int FWORD6 = 26;
	/**
	 * Memory location contains a 16-bit limit and a 64-bit address (eg.<!-- --> {@code LGDTQ})
	 */
	public static final int FWORD10 = 27;
	/**
	 * Memory location contains a {@code float16}
	 */
	public static final int FLOAT16 = 28;
	/**
	 * Memory location contains a {@code float}
	 */
	public static final int FLOAT32 = 29;
	/**
	 * Memory location contains a {@code double}
	 */
	public static final int FLOAT64 = 30;
	/**
	 * Memory location contains a {@code float80}
	 */
	public static final int FLOAT80 = 31;
	/**
	 * Memory location contains a {@code float128}
	 */
	public static final int FLOAT128 = 32;
	/**
	 * Memory location contains a {@code bfloat16}
	 */
	public static final int BFLOAT16 = 33;
	/**
	 * Memory location contains a 14-byte FPU environment (16-bit {@code FLDENV}/{@code FSTENV})
	 */
	public static final int FPU_ENV14 = 34;
	/**
	 * Memory location contains a 28-byte FPU environment (32/64-bit {@code FLDENV}/{@code FSTENV})
	 */
	public static final int FPU_ENV28 = 35;
	/**
	 * Memory location contains a 94-byte FPU environment (16-bit {@code FSAVE}/{@code FRSTOR})
	 */
	public static final int FPU_STATE94 = 36;
	/**
	 * Memory location contains a 108-byte FPU environment (32/64-bit {@code FSAVE}/{@code FRSTOR})
	 */
	public static final int FPU_STATE108 = 37;
	/**
	 * Memory location contains 512-bytes of {@code FXSAVE}/{@code FXRSTOR} data
	 */
	public static final int FXSAVE_512BYTE = 38;
	/**
	 * Memory location contains 512-bytes of {@code FXSAVE64}/{@code FXRSTOR64} data
	 */
	public static final int FXSAVE64_512BYTE = 39;
	/**
	 * 32-bit {@code XSAVE} area
	 */
	public static final int XSAVE = 40;
	/**
	 * 64-bit {@code XSAVE} area
	 */
	public static final int XSAVE64 = 41;
	/**
	 * Memory location contains a 10-byte {@code bcd} value ({@code FBLD}/{@code FBSTP})
	 */
	public static final int BCD = 42;
	/**
	 * 64-bit location: TILECFG ({@code LDTILECFG}/{@code STTILECFG})
	 */
	public static final int TILECFG = 43;
	/**
	 * Tile data
	 */
	public static final int TILE = 44;
	/**
	 * 80-bit segment descriptor and selector: 0-7 = descriptor, 8-9 = selector
	 */
	public static final int SEGMENT_DESC_SELECTOR = 45;
	/**
	 * 384-bit AES 128 handle (Key Locker)
	 */
	public static final int KLHANDLE_AES128 = 46;
	/**
	 * 512-bit AES 256 handle (Key Locker)
	 */
	public static final int KLHANDLE_AES256 = 47;
	/**
	 * 16-bit location: 2 x {@code ubyte}
	 */
	public static final int PACKED16_UINT8 = 48;
	/**
	 * 16-bit location: 2 x {@code byte}
	 */
	public static final int PACKED16_INT8 = 49;
	/**
	 * 32-bit location: 4 x {@code ubyte}
	 */
	public static final int PACKED32_UINT8 = 50;
	/**
	 * 32-bit location: 4 x {@code byte}
	 */
	public static final int PACKED32_INT8 = 51;
	/**
	 * 32-bit location: 2 x {@code ushort}
	 */
	public static final int PACKED32_UINT16 = 52;
	/**
	 * 32-bit location: 2 x {@code short}
	 */
	public static final int PACKED32_INT16 = 53;
	/**
	 * 32-bit location: 2 x {@code float16}
	 */
	public static final int PACKED32_FLOAT16 = 54;
	/**
	 * 32-bit location: 2 x {@code bfloat16}
	 */
	public static final int PACKED32_BFLOAT16 = 55;
	/**
	 * 64-bit location: 8 x {@code ubyte}
	 */
	public static final int PACKED64_UINT8 = 56;
	/**
	 * 64-bit location: 8 x {@code byte}
	 */
	public static final int PACKED64_INT8 = 57;
	/**
	 * 64-bit location: 4 x {@code ushort}
	 */
	public static final int PACKED64_UINT16 = 58;
	/**
	 * 64-bit location: 4 x {@code short}
	 */
	public static final int PACKED64_INT16 = 59;
	/**
	 * 64-bit location: 2 x {@code uint}
	 */
	public static final int PACKED64_UINT32 = 60;
	/**
	 * 64-bit location: 2 x {@code int}
	 */
	public static final int PACKED64_INT32 = 61;
	/**
	 * 64-bit location: 4 x {@code float16}
	 */
	public static final int PACKED64_FLOAT16 = 62;
	/**
	 * 64-bit location: 2 x {@code float}
	 */
	public static final int PACKED64_FLOAT32 = 63;
	/**
	 * 128-bit location: 16 x {@code ubyte}
	 */
	public static final int PACKED128_UINT8 = 64;
	/**
	 * 128-bit location: 16 x {@code byte}
	 */
	public static final int PACKED128_INT8 = 65;
	/**
	 * 128-bit location: 8 x {@code ushort}
	 */
	public static final int PACKED128_UINT16 = 66;
	/**
	 * 128-bit location: 8 x {@code short}
	 */
	public static final int PACKED128_INT16 = 67;
	/**
	 * 128-bit location: 4 x {@code uint}
	 */
	public static final int PACKED128_UINT32 = 68;
	/**
	 * 128-bit location: 4 x {@code int}
	 */
	public static final int PACKED128_INT32 = 69;
	/**
	 * 128-bit location: 2 x {@code uint52}
	 */
	public static final int PACKED128_UINT52 = 70;
	/**
	 * 128-bit location: 2 x {@code ulong}
	 */
	public static final int PACKED128_UINT64 = 71;
	/**
	 * 128-bit location: 2 x {@code long}
	 */
	public static final int PACKED128_INT64 = 72;
	/**
	 * 128-bit location: 8 x {@code float16}
	 */
	public static final int PACKED128_FLOAT16 = 73;
	/**
	 * 128-bit location: 4 x {@code float}
	 */
	public static final int PACKED128_FLOAT32 = 74;
	/**
	 * 128-bit location: 2 x {@code double}
	 */
	public static final int PACKED128_FLOAT64 = 75;
	/**
	 * 128-bit location: 4 x (2 x {@code float16})
	 */
	public static final int PACKED128_2X_FLOAT16 = 76;
	/**
	 * 128-bit location: 4 x (2 x {@code bfloat16})
	 */
	public static final int PACKED128_2X_BFLOAT16 = 77;
	/**
	 * 256-bit location: 32 x {@code ubyte}
	 */
	public static final int PACKED256_UINT8 = 78;
	/**
	 * 256-bit location: 32 x {@code byte}
	 */
	public static final int PACKED256_INT8 = 79;
	/**
	 * 256-bit location: 16 x {@code ushort}
	 */
	public static final int PACKED256_UINT16 = 80;
	/**
	 * 256-bit location: 16 x {@code short}
	 */
	public static final int PACKED256_INT16 = 81;
	/**
	 * 256-bit location: 8 x {@code uint}
	 */
	public static final int PACKED256_UINT32 = 82;
	/**
	 * 256-bit location: 8 x {@code int}
	 */
	public static final int PACKED256_INT32 = 83;
	/**
	 * 256-bit location: 4 x {@code uint52}
	 */
	public static final int PACKED256_UINT52 = 84;
	/**
	 * 256-bit location: 4 x {@code ulong}
	 */
	public static final int PACKED256_UINT64 = 85;
	/**
	 * 256-bit location: 4 x {@code long}
	 */
	public static final int PACKED256_INT64 = 86;
	/**
	 * 256-bit location: 2 x {@code uint128}
	 */
	public static final int PACKED256_UINT128 = 87;
	/**
	 * 256-bit location: 2 x {@code int128}
	 */
	public static final int PACKED256_INT128 = 88;
	/**
	 * 256-bit location: 16 x {@code float16}
	 */
	public static final int PACKED256_FLOAT16 = 89;
	/**
	 * 256-bit location: 8 x {@code float}
	 */
	public static final int PACKED256_FLOAT32 = 90;
	/**
	 * 256-bit location: 4 x {@code double}
	 */
	public static final int PACKED256_FLOAT64 = 91;
	/**
	 * 256-bit location: 2 x {@code float128}
	 */
	public static final int PACKED256_FLOAT128 = 92;
	/**
	 * 256-bit location: 8 x (2 x {@code float16})
	 */
	public static final int PACKED256_2X_FLOAT16 = 93;
	/**
	 * 256-bit location: 8 x (2 x {@code bfloat16})
	 */
	public static final int PACKED256_2X_BFLOAT16 = 94;
	/**
	 * 512-bit location: 64 x {@code ubyte}
	 */
	public static final int PACKED512_UINT8 = 95;
	/**
	 * 512-bit location: 64 x {@code byte}
	 */
	public static final int PACKED512_INT8 = 96;
	/**
	 * 512-bit location: 32 x {@code ushort}
	 */
	public static final int PACKED512_UINT16 = 97;
	/**
	 * 512-bit location: 32 x {@code short}
	 */
	public static final int PACKED512_INT16 = 98;
	/**
	 * 512-bit location: 16 x {@code uint}
	 */
	public static final int PACKED512_UINT32 = 99;
	/**
	 * 512-bit location: 16 x {@code int}
	 */
	public static final int PACKED512_INT32 = 100;
	/**
	 * 512-bit location: 8 x {@code uint52}
	 */
	public static final int PACKED512_UINT52 = 101;
	/**
	 * 512-bit location: 8 x {@code ulong}
	 */
	public static final int PACKED512_UINT64 = 102;
	/**
	 * 512-bit location: 8 x {@code long}
	 */
	public static final int PACKED512_INT64 = 103;
	/**
	 * 256-bit location: 4 x {@code uint128}
	 */
	public static final int PACKED512_UINT128 = 104;
	/**
	 * 512-bit location: 32 x {@code float16}
	 */
	public static final int PACKED512_FLOAT16 = 105;
	/**
	 * 512-bit location: 16 x {@code float}
	 */
	public static final int PACKED512_FLOAT32 = 106;
	/**
	 * 512-bit location: 8 x {@code double}
	 */
	public static final int PACKED512_FLOAT64 = 107;
	/**
	 * 512-bit location: 16 x (2 x {@code float16})
	 */
	public static final int PACKED512_2X_FLOAT16 = 108;
	/**
	 * 512-bit location: 16 x (2 x {@code bfloat16})
	 */
	public static final int PACKED512_2X_BFLOAT16 = 109;
	/**
	 * Broadcast {@code float16} to 32-bits
	 */
	public static final int BROADCAST32_FLOAT16 = 110;
	/**
	 * Broadcast {@code uint} to 64-bits
	 */
	public static final int BROADCAST64_UINT32 = 111;
	/**
	 * Broadcast {@code int} to 64-bits
	 */
	public static final int BROADCAST64_INT32 = 112;
	/**
	 * Broadcast {@code float16} to 64-bits
	 */
	public static final int BROADCAST64_FLOAT16 = 113;
	/**
	 * Broadcast {@code float} to 64-bits
	 */
	public static final int BROADCAST64_FLOAT32 = 114;
	/**
	 * Broadcast {@code short} to 128-bits
	 */
	public static final int BROADCAST128_INT16 = 115;
	/**
	 * Broadcast {@code ushort} to 128-bits
	 */
	public static final int BROADCAST128_UINT16 = 116;
	/**
	 * Broadcast {@code uint} to 128-bits
	 */
	public static final int BROADCAST128_UINT32 = 117;
	/**
	 * Broadcast {@code int} to 128-bits
	 */
	public static final int BROADCAST128_INT32 = 118;
	/**
	 * Broadcast {@code uint52} to 128-bits
	 */
	public static final int BROADCAST128_UINT52 = 119;
	/**
	 * Broadcast {@code ulong} to 128-bits
	 */
	public static final int BROADCAST128_UINT64 = 120;
	/**
	 * Broadcast {@code long} to 128-bits
	 */
	public static final int BROADCAST128_INT64 = 121;
	/**
	 * Broadcast {@code float16} to 128-bits
	 */
	public static final int BROADCAST128_FLOAT16 = 122;
	/**
	 * Broadcast {@code float} to 128-bits
	 */
	public static final int BROADCAST128_FLOAT32 = 123;
	/**
	 * Broadcast {@code double} to 128-bits
	 */
	public static final int BROADCAST128_FLOAT64 = 124;
	/**
	 * Broadcast 2 x {@code short} to 128-bits
	 */
	public static final int BROADCAST128_2X_INT16 = 125;
	/**
	 * Broadcast 2 x {@code int} to 128-bits
	 */
	public static final int BROADCAST128_2X_INT32 = 126;
	/**
	 * Broadcast 2 x {@code uint} to 128-bits
	 */
	public static final int BROADCAST128_2X_UINT32 = 127;
	/**
	 * Broadcast 2 x {@code float16} to 128-bits
	 */
	public static final int BROADCAST128_2X_FLOAT16 = 128;
	/**
	 * Broadcast 2 x {@code bfloat16} to 128-bits
	 */
	public static final int BROADCAST128_2X_BFLOAT16 = 129;
	/**
	 * Broadcast {@code short} to 256-bits
	 */
	public static final int BROADCAST256_INT16 = 130;
	/**
	 * Broadcast {@code ushort} to 256-bits
	 */
	public static final int BROADCAST256_UINT16 = 131;
	/**
	 * Broadcast {@code uint} to 256-bits
	 */
	public static final int BROADCAST256_UINT32 = 132;
	/**
	 * Broadcast {@code int} to 256-bits
	 */
	public static final int BROADCAST256_INT32 = 133;
	/**
	 * Broadcast {@code uint52} to 256-bits
	 */
	public static final int BROADCAST256_UINT52 = 134;
	/**
	 * Broadcast {@code ulong} to 256-bits
	 */
	public static final int BROADCAST256_UINT64 = 135;
	/**
	 * Broadcast {@code long} to 256-bits
	 */
	public static final int BROADCAST256_INT64 = 136;
	/**
	 * Broadcast {@code float16} to 256-bits
	 */
	public static final int BROADCAST256_FLOAT16 = 137;
	/**
	 * Broadcast {@code float} to 256-bits
	 */
	public static final int BROADCAST256_FLOAT32 = 138;
	/**
	 * Broadcast {@code double} to 256-bits
	 */
	public static final int BROADCAST256_FLOAT64 = 139;
	/**
	 * Broadcast 2 x {@code short} to 256-bits
	 */
	public static final int BROADCAST256_2X_INT16 = 140;
	/**
	 * Broadcast 2 x {@code int} to 256-bits
	 */
	public static final int BROADCAST256_2X_INT32 = 141;
	/**
	 * Broadcast 2 x {@code uint} to 256-bits
	 */
	public static final int BROADCAST256_2X_UINT32 = 142;
	/**
	 * Broadcast 2 x {@code float16} to 256-bits
	 */
	public static final int BROADCAST256_2X_FLOAT16 = 143;
	/**
	 * Broadcast 2 x {@code bfloat16} to 256-bits
	 */
	public static final int BROADCAST256_2X_BFLOAT16 = 144;
	/**
	 * Broadcast {@code short} to 512-bits
	 */
	public static final int BROADCAST512_INT16 = 145;
	/**
	 * Broadcast {@code ushort} to 512-bits
	 */
	public static final int BROADCAST512_UINT16 = 146;
	/**
	 * Broadcast {@code uint} to 512-bits
	 */
	public static final int BROADCAST512_UINT32 = 147;
	/**
	 * Broadcast {@code int} to 512-bits
	 */
	public static final int BROADCAST512_INT32 = 148;
	/**
	 * Broadcast {@code uint52} to 512-bits
	 */
	public static final int BROADCAST512_UINT52 = 149;
	/**
	 * Broadcast {@code ulong} to 512-bits
	 */
	public static final int BROADCAST512_UINT64 = 150;
	/**
	 * Broadcast {@code long} to 512-bits
	 */
	public static final int BROADCAST512_INT64 = 151;
	/**
	 * Broadcast {@code float16} to 512-bits
	 */
	public static final int BROADCAST512_FLOAT16 = 152;
	/**
	 * Broadcast {@code float} to 512-bits
	 */
	public static final int BROADCAST512_FLOAT32 = 153;
	/**
	 * Broadcast {@code double} to 512-bits
	 */
	public static final int BROADCAST512_FLOAT64 = 154;
	/**
	 * Broadcast 2 x {@code float16} to 512-bits
	 */
	public static final int BROADCAST512_2X_FLOAT16 = 155;
	/**
	 * Broadcast 2 x {@code short} to 512-bits
	 */
	public static final int BROADCAST512_2X_INT16 = 156;
	/**
	 * Broadcast 2 x {@code uint} to 512-bits
	 */
	public static final int BROADCAST512_2X_UINT32 = 157;
	/**
	 * Broadcast 2 x {@code int} to 512-bits
	 */
	public static final int BROADCAST512_2X_INT32 = 158;
	/**
	 * Broadcast 2 x {@code bfloat16} to 512-bits
	 */
	public static final int BROADCAST512_2X_BFLOAT16 = 159;
	// GENERATOR-END: Variants
}
