package com.lst11.domain.usecases

import com.lst11.domain.entity.Word
import com.lst11.domain.executor.PostExecutorThread
import com.lst11.domain.repositories.WordsRepository
import io.reactivex.Completable
import javax.inject.Inject

class AddWordUseCase @Inject constructor(private val wordRepository: WordsRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun add(word: Word): Completable? {
        return wordRepository.add(word)
                ?.observeOn(postExecutorThread)
                ?.subscribeOn(workExecutorThread)
    }
}
