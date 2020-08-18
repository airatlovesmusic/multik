package com.airatlovesmusic.base;

import java.lang.System;

/**
 * Created by Airat Khalilov on 17/08/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/airatlovesmusic/base/BaseComponent;", "", "baseNetwork", "Lcom/airatlovesmusic/base/BaseNetwork;", "getBaseNetwork", "()Lcom/airatlovesmusic/base/BaseNetwork;", "baseRepository", "Lcom/airatlovesmusic/base/BaseRepository;", "getBaseRepository", "()Lcom/airatlovesmusic/base/BaseRepository;", "base_debug"})
@dagger.Component(modules = {com.airatlovesmusic.base.BaseNetworkModule.class, com.airatlovesmusic.base.BaseRepositoryModule.class})
@javax.inject.Singleton()
public abstract interface BaseComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.airatlovesmusic.base.BaseNetwork getBaseNetwork();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.airatlovesmusic.base.BaseRepository getBaseRepository();
}