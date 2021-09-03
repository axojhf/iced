# SPDX-License-Identifier: MIT
# Copyright (C) 2018-present iced project and contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Mnemonic condition code selector (eg. ``JNP`` / ``JPO``)
"""

import typing
if typing.TYPE_CHECKING:
	from ._iced_x86_py import CC_np
else:
	CC_np = int

NP: CC_np = 0 # type: ignore
"""
``JNP``, ``CMOVNP``, ``SETNP``
"""
PO: CC_np = 1 # type: ignore
"""
``JPO``, ``CMOVPO``, ``SETPO``
"""
