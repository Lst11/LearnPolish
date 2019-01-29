package com.lst11.learnpolish.presentation.base

import android.arch.lifecycle.ViewModel

abstract class BaseViewModel<R : BaseRouter<*>> : ViewModel() {

    protected var router: R? = null

//    protected val compositeDisposable: CompositeDisposable by lazy {
//        CompositeDisposable()
//    }

    fun addRouter(router: R?) {
        this.router = router
    }

    fun removeRouter() {
        this.router = null
    }

//    protected fun addToDisposable(disposable: Disposable?) {
//        if (disposable != null) {
//            compositeDisposable.add(disposable)
//        }
//    }

    override fun onCleared() {
        super.onCleared()
//        compositeDisposable.clear()
    }
}