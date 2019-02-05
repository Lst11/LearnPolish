package com.lst11.domain.usecases

import com.lst11.domain.entity.Word
import com.lst11.domain.executor.PostExecutorThread
import com.lst11.domain.repositories.WordsRepository
import com.lst11.domain.usecases.BaseUseCase
import io.reactivex.Completable
import javax.inject.Inject

class RemoveWordUseCase @Inject constructor(private val wordRepository: WordsRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun remove(word: Word): Completable? {
        return wordRepository.remove(word)
                ?.observeOn(postExecutorThread)
                ?.subscribeOn(workExecutorThread)
    }
}
