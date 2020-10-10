/*
Copyright (C) 2018-2019 de4dot@gmail.com

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

#if NASM
using System;
using Iced.Intel.FormatterInternal;

namespace Iced.Intel.NasmFormatterInternal {
	static class MemorySizes {
		public readonly struct Info {
			public readonly FormatterString keyword;
			public readonly FormatterString bcstTo;
			public Info(FormatterString keyword, FormatterString bcstTo) {
				this.keyword = keyword;
				this.bcstTo = bcstTo;
			}
		}
		public static readonly Info[] AllMemorySizes = GetMemorySizes();

		static Info[] GetMemorySizes() {
			// GENERATOR-BEGIN: ConstData
			// ⚠️This was generated by GENERATOR!🦹‍♂️
			var @byte = new FormatterString("byte");
			var dword = new FormatterString("dword");
			var far = new FormatterString("far");
			var fpuenv14 = new FormatterString("fpuenv14");
			var fpuenv28 = new FormatterString("fpuenv28");
			var fpustate108 = new FormatterString("fpustate108");
			var fpustate94 = new FormatterString("fpustate94");
			var oword = new FormatterString("oword");
			var qword = new FormatterString("qword");
			var tword = new FormatterString("tword");
			var word = new FormatterString("word");
			var yword = new FormatterString("yword");
			var zword = new FormatterString("zword");
			var mem384 = new FormatterString("mem384");
			var b1to2 = new FormatterString("1to2");
			var b1to4 = new FormatterString("1to4");
			var b1to8 = new FormatterString("1to8");
			var b1to16 = new FormatterString("1to16");
			// GENERATOR-END: ConstData

#if HAS_SPAN
			ReadOnlySpan<byte>
#else
			byte[]
#endif
			bcstToData = new byte[IcedConstants.NumberOfMemorySizes - (int)IcedConstants.FirstBroadcastMemorySize] {
				// GENERATOR-BEGIN: BcstTo
				// ⚠️This was generated by GENERATOR!🦹‍♂️
				0x01,
				0x01,
				0x01,
				0x02,
				0x02,
				0x01,
				0x01,
				0x01,
				0x02,
				0x01,
				0x03,
				0x03,
				0x02,
				0x02,
				0x02,
				0x03,
				0x02,
				0x04,
				0x04,
				0x03,
				0x03,
				0x03,
				0x04,
				0x03,
				0x02,
				0x03,
				0x04,
				0x01,
				0x02,
				0x03,
				0x01,
				0x02,
				0x03,
				0x02,
				0x03,
				0x04,
				// GENERATOR-END: BcstTo
			};
#if HAS_SPAN
			ReadOnlySpan<byte>
#else
			byte[]
#endif
			data = new byte[IcedConstants.NumberOfMemorySizes] {
				// GENERATOR-BEGIN: MemorySizes
				// ⚠️This was generated by GENERATOR!🦹‍♂️
				0x00,
				0x01,
				0x0B,
				0x02,
				0x09,
				0x09,
				0x08,
				0x0C,
				0x0D,
				0x01,
				0x0B,
				0x02,
				0x09,
				0x08,
				0x0C,
				0x0D,
				0x03,
				0x03,
				0x03,
				0x0B,
				0x02,
				0x09,
				0x00,
				0x00,
				0x09,
				0x08,
				0x00,
				0x00,
				0x0B,
				0x02,
				0x09,
				0x0A,
				0x08,
				0x0B,
				0x04,
				0x05,
				0x07,
				0x06,
				0x00,
				0x00,
				0x00,
				0x00,
				0x0A,
				0x00,
				0x00,
				0x0A,
				0x0E,
				0x08,
				0x0B,
				0x0B,
				0x02,
				0x02,
				0x02,
				0x02,
				0x02,
				0x09,
				0x09,
				0x09,
				0x09,
				0x09,
				0x09,
				0x09,
				0x09,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x08,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0C,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x0D,
				0x02,
				0x02,
				0x02,
				0x02,
				0x02,
				0x09,
				0x09,
				0x09,
				0x02,
				0x09,
				0x02,
				0x02,
				0x09,
				0x09,
				0x09,
				0x02,
				0x09,
				0x02,
				0x02,
				0x09,
				0x09,
				0x09,
				0x02,
				0x09,
				0x02,
				0x02,
				0x02,
				0x09,
				0x09,
				0x09,
				0x09,
				0x09,
				0x09,
				0x02,
				0x02,
				0x02,
				// GENERATOR-END: MemorySizes
			};

			var infos = new Info[IcedConstants.NumberOfMemorySizes];
			for (int i = 0; i < infos.Length; i++) {
				var d = data[i];
				var keyword = d switch {
					// GENERATOR-BEGIN: MemoryKeywordsSwitch
					// ⚠️This was generated by GENERATOR!🦹‍♂️
					0x00 => default,
					0x01 => @byte,
					0x02 => dword,
					0x03 => far,
					0x04 => fpuenv14,
					0x05 => fpuenv28,
					0x06 => fpustate108,
					0x07 => fpustate94,
					0x08 => oword,
					0x09 => qword,
					0x0A => tword,
					0x0B => word,
					0x0C => yword,
					0x0D => zword,
					0x0E => mem384,
					// GENERATOR-END: MemoryKeywordsSwitch
					_ => throw new InvalidOperationException(),
				};
				FormatterString bcstTo;
				if (i < (int)IcedConstants.FirstBroadcastMemorySize)
					bcstTo = default;
				else {
					bcstTo = (bcstToData[i - (int)IcedConstants.FirstBroadcastMemorySize]) switch {
						// GENERATOR-BEGIN: BroadcastToKindSwitch
						// ⚠️This was generated by GENERATOR!🦹‍♂️
						0x00 => default,
						0x01 => b1to2,
						0x02 => b1to4,
						0x03 => b1to8,
						0x04 => b1to16,
						// GENERATOR-END: BroadcastToKindSwitch
						_ => throw new InvalidOperationException(),
					};
				}

				infos[i] = new Info(keyword, bcstTo);
			}

			return infos;
		}
	}
}
#endif
