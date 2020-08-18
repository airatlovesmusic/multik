package com.airatlovesmusic.multik.di.components;

import java.lang.System;

/**
 * Created by Airat Khalilov on 17/08/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/airatlovesmusic/multik/di/components/AppComponent;", "", "apiService", "Lcom/airatlovesmusic/multik/data/network/ApiService;", "getApiService", "()Lcom/airatlovesmusic/multik/data/network/ApiService;", "app_debug"})
@dagger.Component(modules = {com.airatlovesmusic.multik.di.modules.ServerModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.airatlovesmusic.multik.data.network.ApiService getApiService();
}