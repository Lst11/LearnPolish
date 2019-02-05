package com.lst11.domain.repositories

import com.lst11.domain.entity.Word
import com.lst11.domain.repositories.BaseRepository
import io.reactivex.Completable
import io.reactivex.Observable

interface WordsRepository : BaseRepository {

    fun getTranslate(wordPL: String): Observable<Word>?

    fun getAll(): Observable<List<Word>>?

    fun add(word: Word): Completable?

    fun remove(word: Word): Completable?


//    fun get(wordPL: String): Observable<Word>


}