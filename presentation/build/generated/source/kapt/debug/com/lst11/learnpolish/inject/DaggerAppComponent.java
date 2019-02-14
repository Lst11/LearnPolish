// Generated by Dagger (https://google.github.io/dagger).
package com.lst11.learnpolish.inject;

import android.content.Context;
import com.gmail.superarch.inject.DomainModule;
import com.gmail.superarch.inject.DomainModule_ProvideAppDataBaseFactory;
import com.gmail.superarch.inject.DomainModule_ProvideContextFactory;
import com.gmail.superarch.inject.DomainModule_ProvidePostExecutorThreadFactory;
import com.gmail.superarch.inject.DomainModule_ProvideRestServiceFactory;
import com.gmail.superarch.inject.DomainModule_ProvideServerUrlDebugFactory;
import com.gmail.superarch.inject.DomainModule_ProvideStudentDaoFactory;
import com.gmail.superarch.inject.DomainModule_ProvideWordsRepositoryFactory;
import com.lst11.data.db.AppDataBase;
import com.lst11.data.db.dao.WordDao;
import com.lst11.data.net.RestService;
import com.lst11.domain.executor.PostExecutorThread;
import com.lst11.domain.repositories.WordsRepository;
import com.lst11.domain.usecases.AddWordUseCase;
import com.lst11.domain.usecases.GetTranslateUseCase;
import com.lst11.domain.usecases.RemoveWordUseCase;
import com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel;
import com.lst11.learnpolish.presentation.screen.translator.TranslateViewModel_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<String> provideServerUrlDebugProvider;

  private Provider<RestService> provideRestServiceProvider;

  private Provider<Context> provideContextProvider;

  private Provider<AppDataBase> provideAppDataBaseProvider;

  private Provider<WordDao> provideStudentDaoProvider;

  private Provider<WordsRepository> provideWordsRepositoryProvider;

  private Provider<PostExecutorThread> providePostExecutorThreadProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private GetTranslateUseCase getGetTranslateUseCase() {
    return new GetTranslateUseCase(
        provideWordsRepositoryProvider.get(), providePostExecutorThreadProvider.get());
  }

  private AddWordUseCase getAddWordUseCase() {
    return new AddWordUseCase(
        provideWordsRepositoryProvider.get(), providePostExecutorThreadProvider.get());
  }

  private RemoveWordUseCase getRemoveWordUseCase() {
    return new RemoveWordUseCase(
        provideWordsRepositoryProvider.get(), providePostExecutorThreadProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideServerUrlDebugProvider =
        DoubleCheck.provider(
            DomainModule_ProvideServerUrlDebugFactory.create(builder.domainModule));
    this.provideRestServiceProvider =
        DoubleCheck.provider(
            DomainModule_ProvideRestServiceFactory.create(
                builder.domainModule, provideServerUrlDebugProvider));
    this.provideContextProvider =
        DoubleCheck.provider(DomainModule_ProvideContextFactory.create(builder.domainModule));
    this.provideAppDataBaseProvider =
        DoubleCheck.provider(
            DomainModule_ProvideAppDataBaseFactory.create(
                builder.domainModule, provideContextProvider));
    this.provideStudentDaoProvider =
        DoubleCheck.provider(
            DomainModule_ProvideStudentDaoFactory.create(
                builder.domainModule, provideAppDataBaseProvider));
    this.provideWordsRepositoryProvider =
        DoubleCheck.provider(
            DomainModule_ProvideWordsRepositoryFactory.create(
                builder.domainModule, provideRestServiceProvider, provideStudentDaoProvider));
    this.providePostExecutorThreadProvider =
        DoubleCheck.provider(
            DomainModule_ProvidePostExecutorThreadFactory.create(builder.domainModule));
  }

  @Override
  public void inject(TranslateViewModel viewModel) {
    injectTranslateViewModel(viewModel);
  }

  private TranslateViewModel injectTranslateViewModel(TranslateViewModel instance) {
    TranslateViewModel_MembersInjector.injectGetTranslateUseCase(
        instance, getGetTranslateUseCase());
    TranslateViewModel_MembersInjector.injectAddWordUseCase(instance, getAddWordUseCase());
    TranslateViewModel_MembersInjector.injectRemoveWordUseCase(instance, getRemoveWordUseCase());
    return instance;
  }

  public static final class Builder {
    private DomainModule domainModule;

    private Builder() {}

    public AppComponent build() {
      if (domainModule == null) {
        throw new IllegalStateException(DomainModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder domainModule(DomainModule domainModule) {
      this.domainModule = Preconditions.checkNotNull(domainModule);
      return this;
    }
  }
}