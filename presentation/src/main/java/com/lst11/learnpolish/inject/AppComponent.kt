package com.lst11.learnpolish.inject

import com.gmail.superarch.inject.DomainModule
import com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class])
interface AppComponent {

    fun inject(viewModel: TranslateViewModel)
//    fun inject(viewModel: FavoriteViewModel)
}