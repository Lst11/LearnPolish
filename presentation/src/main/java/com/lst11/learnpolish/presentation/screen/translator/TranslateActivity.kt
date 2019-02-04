package com.lst11.learnpolish.presentation.screen

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.lst11.learnpolish.R
import com.lst11.learnpolish.databinding.ActivityHomeBinding
import com.lst11.learnpolish.presentation.base.BaseMvvmActivity
import com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel

class TranslateActivity : BaseMvvmActivity<TranslateViewModel, Router, ActivityHomeBinding>() {

    override fun prodiveViewModel(): TranslateViewModel {
        return ViewModelProviders.of(this).get(TranslateViewModel::class.java)
    }

    override fun provideRouter(): Router = Router(this)

    override fun provideLayoutId(): Int = R.layout.activity_translate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
