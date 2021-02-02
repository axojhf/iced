# SPDX-License-Identifier: MIT
# Copyright wtfsckgh@gmail.com
# Copyright iced contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Operand, register and memory access
"""

from typing import List

NONE: int = 0
"""
Nothing is read and nothing is written
"""
READ: int = 1
"""
The value is read
"""
COND_READ: int = 2
"""
The value is sometimes read and sometimes not
"""
WRITE: int = 3
"""
The value is completely overwritten
"""
COND_WRITE: int = 4
"""
Conditional write, sometimes it's written and sometimes it's not modified
"""
READ_WRITE: int = 5
"""
The value is read and written
"""
READ_COND_WRITE: int = 6
"""
The value is read and sometimes written
"""
NO_MEM_ACCESS: int = 7
"""
The memory operand doesn't refer to memory (eg. ``LEA`` instruction) or it's an instruction that doesn't read the data to a register or doesn't write to the memory location, it just prefetches/invalidates it, eg. ``INVLPG``, ``PREFETCHNTA``, ``VGATHERPF0DPS``, etc. Some of those instructions still check if the code can access the memory location.
"""

__all__: List[str] = []
