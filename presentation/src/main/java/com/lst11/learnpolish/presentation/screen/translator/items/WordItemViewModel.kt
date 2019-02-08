package com.lst11.learnpolish.presentation.screen.translator.items

import android.content.Intent
import android.databinding.ObservableField
import android.support.v4.content.LocalBroadcastManager
import android.util.Log
import com.lst11.learnpolish.app.App
import com.lst11.learnpolish.presentation.base.recycler.BaseItemViewModel

class WordItemViewModel : BaseItemViewModel<String>() {

    val wordRU = ObservableField<String>("")
    var isPressed = ObservableField<Boolean>(false)
    var clickCounter = 0

    override fun bindItem(item: String, position: Int, isUnique: Boolean) {
        Log.e("aaa", "WordItemViewModel: bindItem")
        wordRU.set(item)
        isPressed.set(false)
    }

    override fun onItemClick() {
        if (clickCounter++ % 2 == 0) {
            isPressed.set(true)
//            sendMessage("CLICK_SAVE")
        } else {
            isPressed.set(false)
//            sendMessage("CLICK_REMOVE")
        }
    }

    private fun sendMessage(action: String) {
        Log.e("aaa", "Broadcasting: $action")
        val intent = Intent(action)
        intent.putExtra("message", wordRU.get())
//        LocalBroadcastManager.getInstance(App.instance.baseContext).sendBroadcast(intent)
    }


}