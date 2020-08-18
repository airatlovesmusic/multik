package com.airatlovesmusic.feature2

import com.airatlovesmusic.base.ActivityScope
import com.airatlovesmusic.base.BaseComponent
import dagger.Component

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@ActivityScope
@Component(dependencies = [BaseComponent::class], modules = [Feature2DependentModule::class])
interface Feature2Component {
    fun inject(featureOneActivity: Feature2Fragment)
}