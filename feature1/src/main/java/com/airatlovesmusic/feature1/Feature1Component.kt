package com.airatlovesmusic.feature1

import com.airatlovesmusic.base.ActivityScope
import com.airatlovesmusic.base.BaseComponent
import dagger.Component

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@ActivityScope
@Component(dependencies = [BaseComponent::class], modules = [Feature1DependentModule::class])
interface Feature1Component {
    fun inject(featureOneActivity: Feature1Fragment)
}