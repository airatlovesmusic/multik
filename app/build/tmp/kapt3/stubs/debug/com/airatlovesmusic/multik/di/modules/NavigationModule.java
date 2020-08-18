package com.airatlovesmusic.multik.di.modules;

import java.lang.System;

/**
 * Created by Airat Khalilov on 17/08/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004H\u0007J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/airatlovesmusic/multik/di/modules/NavigationModule;", "", "()V", "getCicerone", "Lru/terrakok/cicerone/Cicerone;", "Lru/terrakok/cicerone/Router;", "kotlin.jvm.PlatformType", "getNavigationHolder", "Lru/terrakok/cicerone/NavigatorHolder;", "cicerone", "getRouter", "app_debug"})
@dagger.Module()
public final class NavigationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> getCicerone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.terrakok.cicerone.Router getRouter(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> cicerone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.terrakok.cicerone.NavigatorHolder getNavigationHolder(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> cicerone) {
        return null;
    }
    
    public NavigationModule() {
        super();
    }
}