package com.airatlovesmusic.feature1;

import java.lang.System;

/**
 * Created by Airat Khalilov on 17/08/2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/airatlovesmusic/feature1/Feature1Component;", "", "inject", "", "featureOneActivity", "Lcom/airatlovesmusic/feature1/Feature1Fragment;", "feature1_debug"})
@dagger.Component(dependencies = {com.airatlovesmusic.base.BaseComponent.class}, modules = {com.airatlovesmusic.feature1.Feature1DependentModule.class})
@com.airatlovesmusic.base.ActivityScope()
public abstract interface Feature1Component {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.airatlovesmusic.feature1.Feature1Fragment featureOneActivity);
}