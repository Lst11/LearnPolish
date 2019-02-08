package com.lst11.learnpolish.presentation.base.recycler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u00050\u0004B\u0015\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00122\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u00052\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J \u0010\u001b\u001a\u00020\u00122\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u0005H\u0016J \u0010\u001c\u001a\u00020\u00122\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u0005H\u0016R+\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \f*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/lst11/learnpolish/presentation/base/recycler/BaseRecyclerAdapter;", "Entity", "VM", "Lcom/lst11/learnpolish/presentation/base/recycler/BaseItemViewModel;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/lst11/learnpolish/presentation/base/recycler/BaseViewHolder;", "itemList", "", "(Ljava/util/List;)V", "clickItemSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/lst11/learnpolish/presentation/base/recycler/ItemClick;", "kotlin.jvm.PlatformType", "getClickItemSubject", "()Lio/reactivex/subjects/PublishSubject;", "getItemList", "()Ljava/util/List;", "addItems", "", "items", "", "cleanItems", "getItemCount", "", "onBindViewHolder", "holder", "position", "onViewAttachedToWindow", "onViewDetachedFromWindow", "presentation_debug"})
public abstract class BaseRecyclerAdapter<Entity extends java.lang.Object, VM extends com.lst11.learnpolish.presentation.base.recycler.BaseItemViewModel<Entity>> extends android.support.v7.widget.RecyclerView.Adapter<com.lst11.learnpolish.presentation.base.recycler.BaseViewHolder<Entity, VM, ?>> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<com.lst11.learnpolish.presentation.base.recycler.ItemClick<Entity>> clickItemSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<Entity> itemList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.lst11.learnpolish.presentation.base.recycler.ItemClick<Entity>> getClickItemSubject() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lst11.learnpolish.presentation.base.recycler.BaseViewHolder<Entity, VM, ?> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
    com.lst11.learnpolish.presentation.base.recycler.BaseViewHolder<Entity, VM, ?> holder) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    com.lst11.learnpolish.presentation.base.recycler.BaseViewHolder<Entity, VM, ?> holder) {
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Entity> items) {
    }
    
    public final void cleanItems() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Entity> getItemList() {
        return null;
    }
    
    public BaseRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<Entity> itemList) {
        super();
    }
    
    public BaseRecyclerAdapter() {
        super();
    }
}