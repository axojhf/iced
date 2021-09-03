# SPDX-License-Identifier: MIT
# Copyright (C) 2018-present iced project and contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Mandatory prefix
"""

import typing
if typing.TYPE_CHECKING:
	from ._iced_x86_py import MandatoryPrefix
else:
	MandatoryPrefix = int

NONE: MandatoryPrefix = 0 # type: ignore
"""
No mandatory prefix (legacy and 3DNow! tables only)
"""
PNP: MandatoryPrefix = 1 # type: ignore
"""
Empty mandatory prefix (no ``66``, ``F3`` or ``F2`` prefix)
"""
P66: MandatoryPrefix = 2 # type: ignore
"""
``66`` prefix
"""
PF3: MandatoryPrefix = 3 # type: ignore
"""
``F3`` prefix
"""
PF2: MandatoryPrefix = 4 # type: ignore
"""
``F2`` prefix
"""
