package com.airatlovesmusic.base

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@Module
class BaseRepositoryModule {
    @Provides
    @Singleton
    fun baseRepository() = BaseRepository("from BaseRepositoryModule")
}