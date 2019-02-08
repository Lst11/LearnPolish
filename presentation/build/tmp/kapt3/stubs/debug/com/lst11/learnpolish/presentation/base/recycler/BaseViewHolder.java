package com.lst11.learnpolish.presentation.base.recycler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\b\b\u0002\u0010\u0004*\u00020\u00052\u00020\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00028\u0002\u0012\u0006\u0010\b\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\tJ%\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010\u0017R\u0013\u0010\u0007\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/lst11/learnpolish/presentation/base/recycler/BaseViewHolder;", "Entity", "VM", "Lcom/lst11/learnpolish/presentation/base/recycler/BaseItemViewModel;", "Binding", "Landroid/databinding/ViewDataBinding;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "binding", "viewModel", "(Landroid/databinding/ViewDataBinding;Lcom/lst11/learnpolish/presentation/base/recycler/BaseItemViewModel;)V", "getBinding", "()Landroid/databinding/ViewDataBinding;", "Landroid/databinding/ViewDataBinding;", "getViewModel", "()Lcom/lst11/learnpolish/presentation/base/recycler/BaseItemViewModel;", "Lcom/lst11/learnpolish/presentation/base/recycler/BaseItemViewModel;", "bind", "", "item", "position", "", "isUnique", "", "(Ljava/lang/Object;IZ)V", "presentation_debug"})
public abstract class BaseViewHolder<Entity extends java.lang.Object, VM extends com.lst11.learnpolish.presentation.base.recycler.BaseItemViewModel<Entity>, Binding extends android.databinding.ViewDataBinding> extends android.support.v7.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final Binding binding = null;
    @org.jetbrains.annotations.NotNull()
    private final VM viewModel = null;
    
    public void bind(Entity item, int position, boolean isUnique) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Binding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    Binding binding, @org.jetbrains.annotations.NotNull()
    VM viewModel) {
        super(null);
    }
}