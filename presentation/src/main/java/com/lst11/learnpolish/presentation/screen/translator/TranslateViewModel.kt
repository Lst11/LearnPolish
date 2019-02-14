package com.lst11.learnpolish.presentation.screen.translator

import android.databinding.ObservableField
import android.util.Log
import com.lst11.domain.usecases.AddWordUseCase
import com.lst11.domain.usecases.GetTranslateUseCase
import com.lst11.domain.usecases.RemoveWordUseCase
import com.lst11.learnpolish.app.App
import com.lst11.learnpolish.presentation.base.BaseViewModel
import com.lst11.learnpolish.presentation.screen.Router
import com.lst11.learnpolish.presentation.screen.translator.items.WordItemAdapter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class TranslateViewModel : BaseViewModel<Router>() {

    @Inject
    lateinit var getTranslateUseCase: GetTranslateUseCase

    @Inject
    lateinit var addWordUseCase: AddWordUseCase

    @Inject
    lateinit var removeWordUseCase: RemoveWordUseCase

    var adapter = WordItemAdapter()

    var wordPl = ObservableField<String>("")
    var wordsRU: MutableList<String> = mutableListOf()

    init {
        App.appComponent.inject(this)
//        val intentFilter = IntentFilter()
//        Log.d("aaa", "TranslateViewModel - added filters")
//        intentFilter.addAction("CLICK_SAVE")
//        intentFilter.addAction("CLICK_REMOVE")
//        LocalBroadcastManager.getInstance(App.instance.baseContext).registerReceiver(broadcastReceicer, intentFilter)
    }

    override fun onClickBack() {
        Log.e("aaa", "TranslateViewModel onClickBack")
        router?.goBack()
    }

    fun onClickTranslate() {
        Log.e("aaa", "TranslateViewModel onClickTranslate: " + wordPl.get())
        adapter.cleanItems()
        if (wordPl.get()?.isNotEmpty() == true) {
            getTranslateUseCase.getTranslate(wordPl.get() ?: "")
                    ?.subscribeBy(
                            onNext = {
                                Log.e("aaa", "TranslateViewModel - translated onNext: " + it.toString())
                                adapter.addItems(it.wordRU)
                                adapter.notifyDataSetChanged()
                            },
                            onError = {
                                Log.e("aaa", "TranslateViewModel - translated onError: " + it.toString())
                                router?.showError(it)
                            })
        }
        adapter.addItems(wordsRU)
        adapter.notifyDataSetChanged()
    }

    fun onClickDelete() {
        Log.e("aaa", "TranslateViewModel onClickDelete")
        wordPl.set("")
        adapter.cleanItems()
    }

    override fun onCleared() {
//        LocalBroadcastManager.getInstance(App.instance.baseContext).unregisterReceiver(broadcastReceicer)
//        compositeDisposable.clear()
        super.onCleared()
    }
}