package com.lst11.learnpolish.presentation.screen.translator.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0002H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/lst11/learnpolish/presentation/screen/translator/items/WordItemViewModel;", "Lcom/lst11/learnpolish/presentation/base/recycler/BaseItemViewModel;", "", "()V", "clickCounter", "", "getClickCounter", "()I", "setClickCounter", "(I)V", "isPressed", "Landroid/databinding/ObservableField;", "", "()Landroid/databinding/ObservableField;", "setPressed", "(Landroid/databinding/ObservableField;)V", "wordRU", "getWordRU", "bindItem", "", "item", "position", "isUnique", "onItemClick", "sendMessage", "action", "presentation_debug"})
public final class WordItemViewModel extends com.lst11.learnpolish.presentation.base.recycler.BaseItemViewModel<java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> wordRU = null;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.Boolean> isPressed;
    private int clickCounter;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getWordRU() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.Boolean> isPressed() {
        return null;
    }
    
    public final void setPressed(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    public final int getClickCounter() {
        return 0;
    }
    
    public final void setClickCounter(int p0) {
    }
    
    @java.lang.Override()
    public void bindItem(@org.jetbrains.annotations.NotNull()
    java.lang.String item, int position, boolean isUnique) {
    }
    
    @java.lang.Override()
    public void onItemClick() {
    }
    
    private final void sendMessage(java.lang.String action) {
    }
    
    public WordItemViewModel() {
        super();
    }
}