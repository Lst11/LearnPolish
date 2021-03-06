// Generated by Dagger (https://google.github.io/dagger).
package com.gmail.superarch.inject;

import com.lst11.data.db.AppDataBase;
import com.lst11.data.db.dao.WordDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DomainModule_ProvideStudentDaoFactory implements Factory<WordDao> {
  private final DomainModule module;

  private final Provider<AppDataBase> appDataBaseProvider;

  public DomainModule_ProvideStudentDaoFactory(
      DomainModule module, Provider<AppDataBase> appDataBaseProvider) {
    this.module = module;
    this.appDataBaseProvider = appDataBaseProvider;
  }

  @Override
  public WordDao get() {
    return provideInstance(module, appDataBaseProvider);
  }

  public static WordDao provideInstance(
      DomainModule module, Provider<AppDataBase> appDataBaseProvider) {
    return proxyProvideStudentDao(module, appDataBaseProvider.get());
  }

  public static DomainModule_ProvideStudentDaoFactory create(
      DomainModule module, Provider<AppDataBase> appDataBaseProvider) {
    return new DomainModule_ProvideStudentDaoFactory(module, appDataBaseProvider);
  }

  public static WordDao proxyProvideStudentDao(DomainModule instance, AppDataBase appDataBase) {
    return Preconditions.checkNotNull(
        instance.provideStudentDao(appDataBase),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
