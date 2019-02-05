package com.lst11.domain.usecases

import com.lst11.domain.executor.PostExecutorThread
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

abstract class BaseUseCase(val postExecutorThread: Scheduler,
                           val workExecutorThread: Scheduler = Schedulers.io()) {

    constructor(postExecutorThread: PostExecutorThread)
            : this(postExecutorThread.getScheduler())
}