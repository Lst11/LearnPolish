package com.lst11.data.utils

import com.lst11.data.db.entity.WordDB
import com.lst11.data.entity.WordResponse
import com.lst11.domain.entity.Word

object Transformer {
    //    fun transformIdToRequest(id: String?): String {
//        return "id=${id}"
//    }
//
//    fun transformNameToRequest(name: String?): String {
//        return "name LIKE'${name}%'"
//    }
//
    fun transformResponseToDomain(wordPL: String, wordResponse: WordResponse): Word {
        return Word(wordPL, wordResponse.listOfWords.toMutableList())
    }

    fun transformDomainToDB(word: Word): WordDB {
        return WordDB(word.wordPL, word.wordRU)
    }

    fun transformDBToDomain(wordDB: WordDB): Word {
        return Word(wordDB.wordPL, wordDB.wordRU.toMutableList())
    }
}