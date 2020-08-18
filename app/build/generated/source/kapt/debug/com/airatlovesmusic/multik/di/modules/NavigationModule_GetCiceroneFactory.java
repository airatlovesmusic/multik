// Generated by Dagger (https://dagger.dev).
package com.airatlovesmusic.multik.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ru.terrakok.cicerone.Cicerone;
import ru.terrakok.cicerone.Router;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NavigationModule_GetCiceroneFactory implements Factory<Cicerone<Router>> {
  private final NavigationModule module;

  public NavigationModule_GetCiceroneFactory(NavigationModule module) {
    this.module = module;
  }

  @Override
  public Cicerone<Router> get() {
    return getCicerone(module);
  }

  public static NavigationModule_GetCiceroneFactory create(NavigationModule module) {
    return new NavigationModule_GetCiceroneFactory(module);
  }

  public static Cicerone<Router> getCicerone(NavigationModule instance) {
    return Preconditions.checkNotNull(instance.getCicerone(), "Cannot return null from a non-@Nullable @Provides method");
  }
}