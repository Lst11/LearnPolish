//package com.example.domain.usecases
//
//import com.lst11.domain.entity.Word
//import com.lst11.domain.executor.PostExecutorThread
//import com.lst11.domain.repositories.WordsRepository
//import io.reactivex.Observable
//
//class GetWordUseCase(private val wordRepository: WordsRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {
//
//    fun get(wordPL: String): Observable<Word>? {
//        return wordRepository.get(wordPL)
//                ?.observeOn(postExecutorThread)
//                ?.subscribeOn(workExecutorThread)
//    }
//}
