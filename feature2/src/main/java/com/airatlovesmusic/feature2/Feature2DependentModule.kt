package com.airatlovesmusic.feature2

import com.airatlovesmusic.base.BaseNetwork
import com.airatlovesmusic.base.BaseRepository
import dagger.Module
import dagger.Provides

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@Module
class Feature2DependentModule {
    @Provides
    fun appModel(baseRepository: BaseRepository, baseNetwork: BaseNetwork) =
        Feature2Dependent("from FeatureOneDependentModule", baseRepository, baseNetwork)
}