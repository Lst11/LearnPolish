package com.lst11.learnpolish.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u0013\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/lst11/learnpolish/presentation/base/BaseRouter;", "A", "Lcom/lst11/learnpolish/presentation/base/BaseActivity;", "", "activity", "(Lcom/lst11/learnpolish/presentation/base/BaseActivity;)V", "getActivity", "()Lcom/lst11/learnpolish/presentation/base/BaseActivity;", "Lcom/lst11/learnpolish/presentation/base/BaseActivity;", "goBack", "", "showError", "e", "", "presentation_debug"})
public abstract class BaseRouter<A extends com.lst11.learnpolish.presentation.base.BaseActivity> {
    @org.jetbrains.annotations.NotNull()
    private final A activity = null;
    
    public final void goBack() {
    }
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final A getActivity() {
        return null;
    }
    
    public BaseRouter(@org.jetbrains.annotations.NotNull()
    A activity) {
        super();
    }
}