// Generated by Dagger (https://google.github.io/dagger).
package com.lst11.domain.usecases;

import com.lst11.domain.executor.PostExecutorThread;
import com.lst11.domain.repositories.WordsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RemoveWordUseCase_Factory implements Factory<RemoveWordUseCase> {
  private final Provider<WordsRepository> arg0Provider;

  private final Provider<PostExecutorThread> arg1Provider;

  public RemoveWordUseCase_Factory(
      Provider<WordsRepository> arg0Provider, Provider<PostExecutorThread> arg1Provider) {
    this.arg0Provider = arg0Provider;
    this.arg1Provider = arg1Provider;
  }

  @Override
  public RemoveWordUseCase get() {
    return provideInstance(arg0Provider, arg1Provider);
  }

  public static RemoveWordUseCase provideInstance(
      Provider<WordsRepository> arg0Provider, Provider<PostExecutorThread> arg1Provider) {
    return new RemoveWordUseCase(arg0Provider.get(), arg1Provider.get());
  }

  public static RemoveWordUseCase_Factory create(
      Provider<WordsRepository> arg0Provider, Provider<PostExecutorThread> arg1Provider) {
    return new RemoveWordUseCase_Factory(arg0Provider, arg1Provider);
  }

  public static RemoveWordUseCase newRemoveWordUseCase(
      WordsRepository arg0, PostExecutorThread arg1) {
    return new RemoveWordUseCase(arg0, arg1);
  }
}
