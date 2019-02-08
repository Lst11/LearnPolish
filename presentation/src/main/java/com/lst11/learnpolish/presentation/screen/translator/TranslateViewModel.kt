package com.lst11.learnpolish.presentation.screen.translator

import android.databinding.ObservableField
import android.util.Log
import com.lst11.learnpolish.presentation.base.BaseViewModel
import com.lst11.learnpolish.presentation.screen.Router
import com.lst11.learnpolish.presentation.screen.translator.items.WordItemAdapter

class TranslateViewModel : BaseViewModel<Router>() {
    var adapter = WordItemAdapter()

    var wordPl = ObservableField<String>("")
    var wordsRU: MutableList<String> = mutableListOf("aaa", "bbb", "ccc", "ddd", "eee", "ggg", "kkk", "lll")

    override fun onClickBack() {
        Log.e("aaa", "TranslateViewModel onClickBack")
        router?.goBack()
    }

    fun onClickTranslate() {
        Log.e("aaa", "TranslateViewModel onClickTranslate: " + wordPl.get())
        adapter.cleanItems()
//        if (wordPl.get()?.isNotEmpty() == true) {
//            getTranslateUseCase.getTranslate(wordPl.get() ?: "")
//                    ?.subscribeBy(
//                            onNext = {
//                                Log.e("aaa", "TranslateViewModel - translated onNext: " + it.toString())
//                                adapter.addItems(it.wordRU)
//                                adapter.notifyDataSetChanged()
//                            },
//                            onError = {
//                                Log.e("aaa", "TranslateViewModel - translated onError: " + it.toString())
//                                router?.showError(it)
//                            })
//        }
        adapter.addItems(wordsRU)
        adapter.notifyDataSetChanged()
    }

    fun onClickDelete() {
        Log.e("aaa", "TranslateViewModel onClickDelete")
        wordPl.set("")
    }
}