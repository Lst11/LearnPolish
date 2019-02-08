package com.lst11.learnpolish.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0006\u0010\u000f\u001a\u00020\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/lst11/learnpolish/presentation/base/BaseViewModel;", "R", "Lcom/lst11/learnpolish/presentation/base/BaseRouter;", "Landroid/arch/lifecycle/ViewModel;", "()V", "router", "getRouter", "()Lcom/lst11/learnpolish/presentation/base/BaseRouter;", "setRouter", "(Lcom/lst11/learnpolish/presentation/base/BaseRouter;)V", "Lcom/lst11/learnpolish/presentation/base/BaseRouter;", "addRouter", "", "onCleared", "onClickBack", "removeRouter", "presentation_debug"})
public abstract class BaseViewModel<R extends com.lst11.learnpolish.presentation.base.BaseRouter<?>> extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private R router;
    
    @org.jetbrains.annotations.Nullable()
    protected final R getRouter() {
        return null;
    }
    
    protected final void setRouter(@org.jetbrains.annotations.Nullable()
    R p0) {
    }
    
    public final void addRouter(@org.jetbrains.annotations.Nullable()
    R router) {
    }
    
    public final void removeRouter() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public void onClickBack() {
    }
    
    public BaseViewModel() {
        super();
    }
}