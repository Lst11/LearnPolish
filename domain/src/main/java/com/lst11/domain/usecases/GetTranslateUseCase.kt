package com.lst11.domain.usecases

import com.lst11.domain.entity.Word
import com.lst11.domain.executor.PostExecutorThread
import com.lst11.domain.repositories.WordsRepository
import com.lst11.domain.usecases.BaseUseCase
import io.reactivex.Observable
import javax.inject.Inject

class GetTranslateUseCase @Inject constructor (private val wordRepository: WordsRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun getTranslate(wordPL: String): Observable<Word>? {
        return wordRepository.getTranslate(wordPL)
                ?.observeOn(postExecutorThread)
                ?.subscribeOn(workExecutorThread)
    }
}
