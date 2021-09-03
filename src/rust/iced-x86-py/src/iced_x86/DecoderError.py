# SPDX-License-Identifier: MIT
# Copyright (C) 2018-present iced project and contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Decoder error
"""

import typing
if typing.TYPE_CHECKING:
	from ._iced_x86_py import DecoderError
else:
	DecoderError = int

NONE: DecoderError = 0 # type: ignore
"""
No error. The last decoded instruction is a valid instruction
"""
INVALID_INSTRUCTION: DecoderError = 1 # type: ignore
"""
It's an invalid instruction or an invalid encoding of an existing instruction (eg. some reserved bit is set/cleared)
"""
NO_MORE_BYTES: DecoderError = 2 # type: ignore
"""
There's not enough bytes left to decode the instruction
"""
