package com.airatlovesmusic.multik.di.components;

import java.lang.System;

/**
 * Created by Airat Khalilov on 17/08/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/airatlovesmusic/multik/di/components/AppActivityComponent;", "", "inject", "", "appActivity", "Lcom/airatlovesmusic/multik/ui/AppActivity;", "Builder", "app_debug"})
@dagger.Component(dependencies = {com.airatlovesmusic.multik.di.components.AppComponent.class}, modules = {com.airatlovesmusic.multik.di.modules.NavigationModule.class})
@com.airatlovesmusic.base.ActivityScope()
public abstract interface AppActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.airatlovesmusic.multik.ui.AppActivity appActivity);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/airatlovesmusic/multik/di/components/AppActivityComponent$Builder;", "", "appComponent", "Lcom/airatlovesmusic/multik/di/components/AppComponent;", "appNavigationModule", "navigationModule", "Lcom/airatlovesmusic/multik/di/modules/NavigationModule;", "build", "Lcom/airatlovesmusic/multik/di/components/AppActivityComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.airatlovesmusic.multik.di.components.AppActivityComponent build();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.airatlovesmusic.multik.di.components.AppActivityComponent.Builder appNavigationModule(@org.jetbrains.annotations.NotNull()
        com.airatlovesmusic.multik.di.modules.NavigationModule navigationModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.airatlovesmusic.multik.di.components.AppActivityComponent.Builder appComponent(@org.jetbrains.annotations.NotNull()
        com.airatlovesmusic.multik.di.components.AppComponent appComponent);
    }
}