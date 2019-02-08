package com.lst11.learnpolish.presentation.base.recycler

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.lst11.learnpolish.BR

abstract class BaseViewHolder<Entity,
        VM : BaseItemViewModel<Entity>,
        Binding : ViewDataBinding>
(val binding: Binding, val viewModel: VM)
    : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.setVariable(BR.viewModel, viewModel)
    }

    open fun bind(item: Entity, position: Int, isUnique: Boolean) {
        viewModel.bindItem(item, position, isUnique)
        binding.executePendingBindings()
    }
}