package com.airatlovesmusic.feature2;

import java.lang.System;

/**
 * Created by Airat Khalilov on 17/08/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/airatlovesmusic/feature2/Feature2DependentModule;", "", "()V", "appModel", "Lcom/airatlovesmusic/feature2/Feature2Dependent;", "baseRepository", "Lcom/airatlovesmusic/base/BaseRepository;", "baseNetwork", "Lcom/airatlovesmusic/base/BaseNetwork;", "feature2_debug"})
@dagger.Module()
public final class Feature2DependentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.airatlovesmusic.feature2.Feature2Dependent appModel(@org.jetbrains.annotations.NotNull()
    com.airatlovesmusic.base.BaseRepository baseRepository, @org.jetbrains.annotations.NotNull()
    com.airatlovesmusic.base.BaseNetwork baseNetwork) {
        return null;
    }
    
    public Feature2DependentModule() {
        super();
    }
}