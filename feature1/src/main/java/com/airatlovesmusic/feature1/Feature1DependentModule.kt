package com.airatlovesmusic.feature1

import com.airatlovesmusic.base.BaseNetwork
import com.airatlovesmusic.base.BaseRepository
import dagger.Module
import dagger.Provides

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@Module
class Feature1DependentModule {
    @Provides
    fun appModel(baseRepository: BaseRepository, baseNetwork: BaseNetwork) =
        Feature1Dependent("from FeatureOneDependentModule", baseRepository, baseNetwork)
}