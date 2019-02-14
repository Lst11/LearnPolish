// Generated by Dagger (https://google.github.io/dagger).
package com.lst11.learnpolish.presentation.screen.translator;

import com.lst11.domain.usecases.AddWordUseCase;
import com.lst11.domain.usecases.GetTranslateUseCase;
import com.lst11.domain.usecases.RemoveWordUseCase;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TranslateViewModel_MembersInjector
    implements MembersInjector<TranslateViewModel> {
  private final Provider<GetTranslateUseCase> getTranslateUseCaseProvider;

  private final Provider<AddWordUseCase> addWordUseCaseProvider;

  private final Provider<RemoveWordUseCase> removeWordUseCaseProvider;

  public TranslateViewModel_MembersInjector(
      Provider<GetTranslateUseCase> getTranslateUseCaseProvider,
      Provider<AddWordUseCase> addWordUseCaseProvider,
      Provider<RemoveWordUseCase> removeWordUseCaseProvider) {
    this.getTranslateUseCaseProvider = getTranslateUseCaseProvider;
    this.addWordUseCaseProvider = addWordUseCaseProvider;
    this.removeWordUseCaseProvider = removeWordUseCaseProvider;
  }

  public static MembersInjector<TranslateViewModel> create(
      Provider<GetTranslateUseCase> getTranslateUseCaseProvider,
      Provider<AddWordUseCase> addWordUseCaseProvider,
      Provider<RemoveWordUseCase> removeWordUseCaseProvider) {
    return new TranslateViewModel_MembersInjector(
        getTranslateUseCaseProvider, addWordUseCaseProvider, removeWordUseCaseProvider);
  }

  @Override
  public void injectMembers(TranslateViewModel instance) {
    injectGetTranslateUseCase(instance, getTranslateUseCaseProvider.get());
    injectAddWordUseCase(instance, addWordUseCaseProvider.get());
    injectRemoveWordUseCase(instance, removeWordUseCaseProvider.get());
  }

  public static void injectGetTranslateUseCase(
      TranslateViewModel instance, GetTranslateUseCase getTranslateUseCase) {
    instance.getTranslateUseCase = getTranslateUseCase;
  }

  public static void injectAddWordUseCase(
      TranslateViewModel instance, AddWordUseCase addWordUseCase) {
    instance.addWordUseCase = addWordUseCase;
  }

  public static void injectRemoveWordUseCase(
      TranslateViewModel instance, RemoveWordUseCase removeWordUseCase) {
    instance.removeWordUseCase = removeWordUseCase;
  }
}
