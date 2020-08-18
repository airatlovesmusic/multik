package com.airatlovesmusic.multik;

import java.lang.System;

/**
 * Created by Airat Khalilov on 17/08/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR;\u0010\n\u001a\u001f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\u000bj\u0002`\u000f8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/airatlovesmusic/multik/App;", "Landroid/app/Application;", "Lcom/airatlovesmusic/global/di/dependencies/HasChildDependencies;", "()V", "appComponent", "Lcom/airatlovesmusic/multik/di/app/AppComponent;", "getAppComponent", "()Lcom/airatlovesmusic/multik/di/app/AppComponent;", "setAppComponent", "(Lcom/airatlovesmusic/multik/di/app/AppComponent;)V", "dependencies", "", "Ljava/lang/Class;", "Lcom/airatlovesmusic/global/di/dependencies/ComponentDependencies;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/airatlovesmusic/global/di/dependencies/ComponentDependenciesProvider;", "getDependencies", "()Ljava/util/Map;", "setDependencies", "(Ljava/util/Map;)V", "onCreate", "", "app_debug"})
public final class App extends android.app.Application implements com.airatlovesmusic.global.di.dependencies.HasChildDependencies {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public java.util.Map<java.lang.Class<? extends com.airatlovesmusic.global.di.dependencies.ComponentDependencies>, com.airatlovesmusic.global.di.dependencies.ComponentDependencies> dependencies;
    @org.jetbrains.annotations.NotNull()
    public com.airatlovesmusic.multik.di.app.AppComponent appComponent;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.Class<? extends com.airatlovesmusic.global.di.dependencies.ComponentDependencies>, com.airatlovesmusic.global.di.dependencies.ComponentDependencies> getDependencies() {
        return null;
    }
    
    public void setDependencies(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends com.airatlovesmusic.global.di.dependencies.ComponentDependencies>, com.airatlovesmusic.global.di.dependencies.ComponentDependencies> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airatlovesmusic.multik.di.app.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.airatlovesmusic.multik.di.app.AppComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
}