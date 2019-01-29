package com.lst11.learnpolish.presentation.base

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
//    protected val compositeDisposable: CompositeDisposable by lazy {
//        CompositeDisposable()
//    }
//
//    protected fun addToDisposable(disposable: Disposable) {
//        compositeDisposable.add(disposable)
//    }

    override fun onDestroy() {
        super.onDestroy()
//        compositeDisposable.clear()
    }
}