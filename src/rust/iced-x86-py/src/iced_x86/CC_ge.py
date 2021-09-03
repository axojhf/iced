# SPDX-License-Identifier: MIT
# Copyright (C) 2018-present iced project and contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Mnemonic condition code selector (eg. ``JGE`` / ``JNL``)
"""

import typing
if typing.TYPE_CHECKING:
	from ._iced_x86_py import CC_ge
else:
	CC_ge = int

GE: CC_ge = 0 # type: ignore
"""
``JGE``, ``CMOVGE``, ``SETGE``
"""
NL: CC_ge = 1 # type: ignore
"""
``JNL``, ``CMOVNL``, ``SETNL``
"""
