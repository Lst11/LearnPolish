package com.lst11.learnpolish.presentation.screen.translator.items

import android.view.LayoutInflater
import android.view.ViewGroup
import com.lst11.learnpolish.databinding.ItemWordTranslatedBinding
import com.lst11.learnpolish.presentation.base.recycler.BaseViewHolder

class WordItemViewHolder(binding: ItemWordTranslatedBinding,
                         viewModel: WordItemViewModel)
    : BaseViewHolder<String,
        WordItemViewModel,
        ItemWordTranslatedBinding>(binding, viewModel) {

    companion object {
        fun create(parent: ViewGroup,
                   viewModel: WordItemViewModel): WordItemViewHolder {
            val binding = ItemWordTranslatedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return WordItemViewHolder(binding, viewModel)
        }
    }



}