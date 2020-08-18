// Generated by Dagger (https://dagger.dev).
package com.airatlovesmusic.base;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseRepositoryModule_BaseRepositoryFactory implements Factory<BaseRepository> {
  private final BaseRepositoryModule module;

  public BaseRepositoryModule_BaseRepositoryFactory(BaseRepositoryModule module) {
    this.module = module;
  }

  @Override
  public BaseRepository get() {
    return baseRepository(module);
  }

  public static BaseRepositoryModule_BaseRepositoryFactory create(BaseRepositoryModule module) {
    return new BaseRepositoryModule_BaseRepositoryFactory(module);
  }

  public static BaseRepository baseRepository(BaseRepositoryModule instance) {
    return Preconditions.checkNotNull(instance.baseRepository(), "Cannot return null from a non-@Nullable @Provides method");
  }
}