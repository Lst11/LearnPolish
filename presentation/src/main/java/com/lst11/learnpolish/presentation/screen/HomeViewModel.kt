package com.lst11.learnpolish.presentation.screen

import android.util.Log
import android.view.View
import com.lst11.learnpolish.presentation.base.BaseViewModel

class HomeViewModel : BaseViewModel<Router>() {

    fun onClickTranslate(v: View) {
        Log.d("myLog", "HomeViewModel onClickTranslate")
        router?.goToMenuItem(TranslateActivity())
    }
}