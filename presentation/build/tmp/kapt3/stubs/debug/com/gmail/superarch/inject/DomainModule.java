package com.gmail.superarch.inject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/gmail/superarch/inject/DomainModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideAppDataBase", "Lcom/lst11/data/db/AppDataBase;", "provideContext", "providePostExecutorThread", "Lcom/lst11/domain/executor/PostExecutorThread;", "provideRestService", "Lcom/lst11/data/net/RestService;", "serverUrl", "", "provideServerUrlDebug", "provideStudentDao", "Lcom/lst11/data/db/dao/WordDao;", "appDataBase", "provideWordsRepository", "Lcom/lst11/domain/repositories/WordsRepository;", "restService", "wordDao", "presentation_debug"})
@dagger.Module()
public final class DomainModule {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.lst11.domain.executor.PostExecutorThread providePostExecutorThread() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.lst11.domain.repositories.WordsRepository provideWordsRepository(@org.jetbrains.annotations.NotNull()
    com.lst11.data.net.RestService restService, @org.jetbrains.annotations.NotNull()
    com.lst11.data.db.dao.WordDao wordDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "URL_TRANSLATE_INJECT_NAME")
    @dagger.Provides()
    public final java.lang.String provideServerUrlDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.lst11.data.net.RestService provideRestService(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "URL_TRANSLATE_INJECT_NAME")
    java.lang.String serverUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.lst11.data.db.AppDataBase provideAppDataBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.lst11.data.db.dao.WordDao provideStudentDao(@org.jetbrains.annotations.NotNull()
    com.lst11.data.db.AppDataBase appDataBase) {
        return null;
    }
    
    public DomainModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}