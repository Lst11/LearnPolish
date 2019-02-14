package com.lst11.data.repositories

import android.util.Log
import com.lst11.data.db.dao.WordDao
import com.lst11.data.utils.Transformer
import com.lst11.domain.entity.Word
import com.lst11.domain.repositories.WordsRepository
import com.lst11.data.net.RestService
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Observable
import transformToDomain
import javax.inject.Inject

class WordsRepositoryImpl @Inject constructor(val restService: RestService,
                                              val wordDao: WordDao) : WordsRepository {

    override fun getTranslate(wordPL: String): Observable<Word>? {
        Log.e("aaa", "WordsRepositoryImpl : getTranslate + $wordPL")
//        val newWord = Word("aaa", mutableListOf("bbb", "ccc", "ddd", "eee", "jjj", "ggg", "hhh", "lll", "kkk"))
//        return Observable.just(newWord)
        return restService.getTranslate(wordPL)
    }

    fun saveAll() {
        val list = WordsListSingleton.list
        list.forEach {
            val wordDB = Transformer.transformDomainToDB(it)
            wordDao.insert(wordDB)
        }
    }

//    override fun get(wordPL: String): Observable<Word> {
//        //FIXME работа с БД
//        return get(wordPL)
//    }

    override fun getAll(): Observable<List<Word>>? {
        return wordDao.getAll()
                .flatMap { list ->
                    Flowable.just(list).map {
                        it.map {
                            it.transformToDomain()
                        }
                    }
                }
                .toObservable()
    }

    override fun add(word: Word): Completable? {
        Log.e("aaa", "WordsRepositoryImpl : added ${word.wordPL} - ${word.wordRU} ")
        wordDao.insert(Transformer.transformDomainToDB(word))
        return Completable.complete()
    }


    override fun remove(word: Word): Completable? {
        Log.e("aaa", "WordsRepositoryImpl : removed ${word.wordPL} - ${word.wordRU} ")
        wordDao.deleteByWordPL(word.wordPL)
        return Completable.complete()
    }

}

//    return wordDao.getAll()
//                .flatMap { list ->
//        Observable.just(list)
//                .map {
//                    it.map {
//                        it.transformToDomain()
//                    }
//                }
//    }

