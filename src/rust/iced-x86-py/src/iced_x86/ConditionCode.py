# SPDX-License-Identifier: MIT
# Copyright (C) 2018-present iced project and contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Instruction condition code (used by ``Jcc``, ``SETcc``, ``CMOVcc``, ``LOOPcc``)
"""

import typing
if typing.TYPE_CHECKING:
	from ._iced_x86_py import ConditionCode
else:
	ConditionCode = int

NONE: ConditionCode = 0 # type: ignore
"""
The instruction doesn't have a condition code
"""
O: ConditionCode = 1 # type: ignore
"""
Overflow (``OF=1``)
"""
NO: ConditionCode = 2 # type: ignore
"""
Not overflow (``OF=0``)
"""
B: ConditionCode = 3 # type: ignore
"""
Below (unsigned) (``CF=1``)
"""
AE: ConditionCode = 4 # type: ignore
"""
Above or equal (unsigned) (``CF=0``)
"""
E: ConditionCode = 5 # type: ignore
"""
Equal / zero (``ZF=1``)
"""
NE: ConditionCode = 6 # type: ignore
"""
Not equal / zero (``ZF=0``)
"""
BE: ConditionCode = 7 # type: ignore
"""
Below or equal (unsigned) (``CF=1 or ZF=1``)
"""
A: ConditionCode = 8 # type: ignore
"""
Above (unsigned) (``CF=0 and ZF=0``)
"""
S: ConditionCode = 9 # type: ignore
"""
Signed (``SF=1``)
"""
NS: ConditionCode = 10 # type: ignore
"""
Not signed (``SF=0``)
"""
P: ConditionCode = 11 # type: ignore
"""
Parity (``PF=1``)
"""
NP: ConditionCode = 12 # type: ignore
"""
Not parity (``PF=0``)
"""
L: ConditionCode = 13 # type: ignore
"""
Less (signed) (``SF!=OF``)
"""
GE: ConditionCode = 14 # type: ignore
"""
Greater than or equal (signed) (``SF=OF``)
"""
LE: ConditionCode = 15 # type: ignore
"""
Less than or equal (signed) (``ZF=1 or SF!=OF``)
"""
G: ConditionCode = 16 # type: ignore
"""
Greater (signed) (``ZF=0 and SF=OF``)
"""
