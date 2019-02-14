package com.lst11.learnpolish.presentation.screen.translator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020*H\u0016J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006."}, d2 = {"Lcom/lst11/learnpolish/presentation/screen/translator/TranslateViewModel;", "Lcom/lst11/learnpolish/presentation/base/BaseViewModel;", "Lcom/lst11/learnpolish/presentation/screen/Router;", "()V", "adapter", "Lcom/lst11/learnpolish/presentation/screen/translator/items/WordItemAdapter;", "getAdapter", "()Lcom/lst11/learnpolish/presentation/screen/translator/items/WordItemAdapter;", "setAdapter", "(Lcom/lst11/learnpolish/presentation/screen/translator/items/WordItemAdapter;)V", "addWordUseCase", "Lcom/lst11/domain/usecases/AddWordUseCase;", "getAddWordUseCase", "()Lcom/lst11/domain/usecases/AddWordUseCase;", "setAddWordUseCase", "(Lcom/lst11/domain/usecases/AddWordUseCase;)V", "getTranslateUseCase", "Lcom/lst11/domain/usecases/GetTranslateUseCase;", "getGetTranslateUseCase", "()Lcom/lst11/domain/usecases/GetTranslateUseCase;", "setGetTranslateUseCase", "(Lcom/lst11/domain/usecases/GetTranslateUseCase;)V", "removeWordUseCase", "Lcom/lst11/domain/usecases/RemoveWordUseCase;", "getRemoveWordUseCase", "()Lcom/lst11/domain/usecases/RemoveWordUseCase;", "setRemoveWordUseCase", "(Lcom/lst11/domain/usecases/RemoveWordUseCase;)V", "wordPl", "Landroid/databinding/ObservableField;", "", "getWordPl", "()Landroid/databinding/ObservableField;", "setWordPl", "(Landroid/databinding/ObservableField;)V", "wordsRU", "", "getWordsRU", "()Ljava/util/List;", "setWordsRU", "(Ljava/util/List;)V", "onCleared", "", "onClickBack", "onClickDelete", "onClickTranslate", "presentation_debug"})
public final class TranslateViewModel extends com.lst11.learnpolish.presentation.base.BaseViewModel<com.lst11.learnpolish.presentation.screen.Router> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.lst11.domain.usecases.GetTranslateUseCase getTranslateUseCase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.lst11.domain.usecases.AddWordUseCase addWordUseCase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.lst11.domain.usecases.RemoveWordUseCase removeWordUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.lst11.learnpolish.presentation.screen.translator.items.WordItemAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> wordPl;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> wordsRU;
    
    @org.jetbrains.annotations.NotNull()
    public final com.lst11.domain.usecases.GetTranslateUseCase getGetTranslateUseCase() {
        return null;
    }
    
    public final void setGetTranslateUseCase(@org.jetbrains.annotations.NotNull()
    com.lst11.domain.usecases.GetTranslateUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lst11.domain.usecases.AddWordUseCase getAddWordUseCase() {
        return null;
    }
    
    public final void setAddWordUseCase(@org.jetbrains.annotations.NotNull()
    com.lst11.domain.usecases.AddWordUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lst11.domain.usecases.RemoveWordUseCase getRemoveWordUseCase() {
        return null;
    }
    
    public final void setRemoveWordUseCase(@org.jetbrains.annotations.NotNull()
    com.lst11.domain.usecases.RemoveWordUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lst11.learnpolish.presentation.screen.translator.items.WordItemAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.lst11.learnpolish.presentation.screen.translator.items.WordItemAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getWordPl() {
        return null;
    }
    
    public final void setWordPl(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWordsRU() {
        return null;
    }
    
    public final void setWordsRU(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void onClickBack() {
    }
    
    public final void onClickTranslate() {
    }
    
    public final void onClickDelete() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TranslateViewModel() {
        super();
    }
}