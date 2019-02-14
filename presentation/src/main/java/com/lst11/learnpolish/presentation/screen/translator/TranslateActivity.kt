package com.lst11.learnpolish.presentation.screen.translator

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.lst11.learnpolish.R
import com.lst11.learnpolish.databinding.ActivityTranslateBinding
import com.lst11.learnpolish.presentation.base.BaseMvvmActivity
import com.lst11.learnpolish.presentation.screen.Router

class TranslateActivity : BaseMvvmActivity<TranslateViewModel, Router, ActivityTranslateBinding>() {

    override fun prodiveViewModel(): TranslateViewModel {
        return ViewModelProviders.of(this).get(TranslateViewModel::class.java)
    }

    override fun provideRouter(): Router = Router(this)

    override fun provideLayoutId(): Int = R.layout.activity_translate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.recyclerView.adapter = viewModel.adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this.applicationContext)
        binding.recyclerView.setHasFixedSize(true)
    }
}
