// Generated by Dagger (https://dagger.dev).
package com.airatlovesmusic.feature2;

import com.airatlovesmusic.base.BaseNetwork;
import com.airatlovesmusic.base.BaseRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Feature2DependentModule_AppModelFactory implements Factory<Feature2Dependent> {
  private final Feature2DependentModule module;

  private final Provider<BaseRepository> baseRepositoryProvider;

  private final Provider<BaseNetwork> baseNetworkProvider;

  public Feature2DependentModule_AppModelFactory(Feature2DependentModule module,
      Provider<BaseRepository> baseRepositoryProvider, Provider<BaseNetwork> baseNetworkProvider) {
    this.module = module;
    this.baseRepositoryProvider = baseRepositoryProvider;
    this.baseNetworkProvider = baseNetworkProvider;
  }

  @Override
  public Feature2Dependent get() {
    return appModel(module, baseRepositoryProvider.get(), baseNetworkProvider.get());
  }

  public static Feature2DependentModule_AppModelFactory create(Feature2DependentModule module,
      Provider<BaseRepository> baseRepositoryProvider, Provider<BaseNetwork> baseNetworkProvider) {
    return new Feature2DependentModule_AppModelFactory(module, baseRepositoryProvider, baseNetworkProvider);
  }

  public static Feature2Dependent appModel(Feature2DependentModule instance,
      BaseRepository baseRepository, BaseNetwork baseNetwork) {
    return Preconditions.checkNotNull(instance.appModel(baseRepository, baseNetwork), "Cannot return null from a non-@Nullable @Provides method");
  }
}