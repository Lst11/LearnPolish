package com.lst11.learnpolish.presentation.screen

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.lst11.learnpolish.R
import com.lst11.learnpolish.databinding.ActivityHomeBinding
import com.lst11.learnpolish.presentation.base.BaseMvvmActivity

class HomeActivity : BaseMvvmActivity<HomeViewModel, Router, ActivityHomeBinding>() {

    override fun prodiveViewModel(): HomeViewModel {
        return ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }

    override fun provideRouter(): Router = Router(this)

    override fun provideLayoutId(): Int = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
