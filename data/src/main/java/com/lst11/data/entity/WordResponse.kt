package com.lst11.data.entity

import com.google.gson.annotations.SerializedName
import com.lst11.data.entity.DataEntity

class WordResponse(
        @SerializedName("code")
        val code: Int,

        @SerializedName("lang")
        val lang: String,

        @SerializedName("text")
        val listOfWords: List<String>
) : DataEntity