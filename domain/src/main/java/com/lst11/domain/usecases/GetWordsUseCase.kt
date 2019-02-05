package com.lst11.domain.usecases

import com.lst11.domain.entity.Word
import com.lst11.domain.executor.PostExecutorThread
import com.lst11.domain.repositories.WordsRepository
import com.lst11.domain.usecases.BaseUseCase
import io.reactivex.Observable
import javax.inject.Inject

class GetWordsUseCase @Inject constructor(
        private val wordRepository: WordsRepository,
        postExecutorThread: PostExecutorThread)
    : BaseUseCase(postExecutorThread) {

    fun getAll(): Observable<List<Word>>? {
        return wordRepository.getAll()
                ?.observeOn(postExecutorThread)
                ?.subscribeOn(workExecutorThread)
    }
}
