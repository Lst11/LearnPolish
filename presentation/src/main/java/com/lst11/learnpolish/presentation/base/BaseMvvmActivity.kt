package com.lst11.learnpolish.presentation.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextThemeWrapper
import com.lst11.learnpolish.BR

abstract class BaseMvvmActivity<VM : BaseViewModel<R>,
        R : BaseRouter<*>,
        B : ViewDataBinding> : BaseActivity() {

    protected lateinit var viewModel: VM
    protected lateinit var binding: B
    public lateinit var router: R

    abstract fun prodiveViewModel(): VM

    abstract fun provideRouter(): R

    abstract fun provideLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = prodiveViewModel()
        binding = DataBindingUtil.setContentView(this, provideLayoutId())
        binding.setVariable(BR.viewModel, viewModel)
        router = provideRouter()


//        binding.setLifecycleOwner(this)
    }

    override fun onResume() {
        super.onResume()
        viewModel.addRouter(router)
    }

    override fun onPause() {
        super.onPause()
        viewModel.removeRouter()
    }
}