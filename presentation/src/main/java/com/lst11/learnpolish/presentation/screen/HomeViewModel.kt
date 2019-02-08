package com.lst11.learnpolish.presentation.screen

import android.util.Log
import com.lst11.learnpolish.presentation.base.BaseViewModel
import com.lst11.learnpolish.presentation.screen.translator.TranslateActivity

class HomeViewModel : BaseViewModel<Router>() {

    fun onClickTranslate() {
        Log.e("aaa", "HomeViewModel onClickTranslate")
        router?.goToMenuItem(TranslateActivity())
    }

    fun onClickDictionary() {
        Log.e("aaa", "HomeViewModel onClickDictionary")
//        router?.goToMenuItem(TranslateActivity())
    }

    fun onClickCardsTraining() {
        Log.e("aaa", "HomeViewModel onClickCardsTraining")
//        router?.goToMenuItem(TranslateActivity())
    }

    fun onClickTimeTraining() {
        Log.e("aaa", "HomeViewModel onClickTimeTraining")
//        router?.goToMenuItem(TranslateActivity())
    }

    fun onClickTranslationTraining() {
        Log.e("aaa", "HomeViewModel onClickTranslationTraining")
//        router?.goToMenuItem(TranslateActivity())
    }

    override fun onClickBack(){
        Log.e("aaa", "HomeViewModel onClickBack")
    }

}