package com.lst11.learnpolish.presentation.screen.translator.items

import android.util.Log
import android.view.ViewGroup
import com.lst11.learnpolish.presentation.base.recycler.BaseRecyclerAdapter

class WordItemAdapter : BaseRecyclerAdapter<String, WordItemViewModel>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): WordItemViewHolder {
        Log.e("aaa","WordItemAdapter onCreateViewHolder")
        return WordItemViewHolder.create(viewGroup, WordItemViewModel())
    }
}