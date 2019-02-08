package com.lst11.learnpolish.presentation.screen.translator

import android.databinding.ObservableField
import android.util.Log
import com.lst11.learnpolish.presentation.base.BaseViewModel
import com.lst11.learnpolish.presentation.screen.Router

class TranslateViewModel : BaseViewModel<Router>() {


    var wordPl = ObservableField<String>("")

    override fun onClickBack() {
        Log.e("aaa", "TranslateViewModel onClickBack")
        router?.goBack()
    }

    fun onClickTranslate() {
        Log.e("aaa", "TranslateViewModel onClickTranslate: " + wordPl.get())
    }

    fun onClickDelete() {
        Log.e("aaa", "TranslateViewModel onClickDelete")
        wordPl.set("")
    }
}