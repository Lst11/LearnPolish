package com.lst11.learnpolish.presentation.base.recycler

import android.support.v7.widget.RecyclerView
import android.util.Log
import io.reactivex.subjects.PublishSubject

abstract class BaseRecyclerAdapter<
        Entity,
        VM : BaseItemViewModel<Entity>>
(val itemList: MutableList<Entity> = mutableListOf())
    : RecyclerView.Adapter<BaseViewHolder<Entity, VM, *>>() {

    val clickItemSubject = PublishSubject.create<ItemClick<Entity>>()

    override fun onBindViewHolder(holder: BaseViewHolder<Entity, VM, *>, position: Int) {
        Log.e("aaa", "BaseRecyclerAdapter onBindViewHolder")
        holder.bind(itemList[position], position, true)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onViewAttachedToWindow(holder: BaseViewHolder<Entity, VM, *>) {
        super.onViewAttachedToWindow(holder)
        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            clickItemSubject.onNext(ItemClick(itemList[position], position))
            holder.viewModel.onItemClick()
        }
    }

    override fun onViewDetachedFromWindow(holder: BaseViewHolder<Entity, VM, *>) {
        super.onViewDetachedFromWindow(holder)
        holder.itemView.setOnClickListener(null)
    }

    fun addItems(items: List<Entity>) {
        val startPos = itemList.size
        Log.e("aaa", "BaseRecyclerAdapter addItems $items")
        itemList.addAll(items)
        notifyItemRangeChanged(startPos, items.size)
    }

    fun cleanItems() {
        itemList.clear()
        notifyDataSetChanged()
    }

}