package com.airatlovesmusic.global.di.module

import android.content.Context
import com.airatlovesmusic.global.data.system.ResourceManager
import com.airatlovesmusic.global.di.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class CommonModule {

    @Provides
    @ApplicationScope
    fun provideResourceManager(context: Context) = ResourceManager(context)
}