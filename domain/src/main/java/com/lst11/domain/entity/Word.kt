package com.lst11.domain.entity

import com.lst11.domain.entity.DomainEntity

data class Word(val wordPL: String,
                val wordRU: MutableList<String>) : DomainEntity