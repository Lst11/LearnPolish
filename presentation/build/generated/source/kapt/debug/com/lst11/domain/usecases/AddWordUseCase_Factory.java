// Generated by Dagger (https://google.github.io/dagger).
package com.lst11.domain.usecases;

import com.lst11.domain.executor.PostExecutorThread;
import com.lst11.domain.repositories.WordsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddWordUseCase_Factory implements Factory<AddWordUseCase> {
  private final Provider<WordsRepository> arg0Provider;

  private final Provider<PostExecutorThread> arg1Provider;

  public AddWordUseCase_Factory(
      Provider<WordsRepository> arg0Provider, Provider<PostExecutorThread> arg1Provider) {
    this.arg0Provider = arg0Provider;
    this.arg1Provider = arg1Provider;
  }

  @Override
  public AddWordUseCase get() {
    return provideInstance(arg0Provider, arg1Provider);
  }

  public static AddWordUseCase provideInstance(
      Provider<WordsRepository> arg0Provider, Provider<PostExecutorThread> arg1Provider) {
    return new AddWordUseCase(arg0Provider.get(), arg1Provider.get());
  }

  public static AddWordUseCase_Factory create(
      Provider<WordsRepository> arg0Provider, Provider<PostExecutorThread> arg1Provider) {
    return new AddWordUseCase_Factory(arg0Provider, arg1Provider);
  }

  public static AddWordUseCase newAddWordUseCase(WordsRepository arg0, PostExecutorThread arg1) {
    return new AddWordUseCase(arg0, arg1);
  }
}