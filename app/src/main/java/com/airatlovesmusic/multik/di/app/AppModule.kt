package com.airatlovesmusic.multik.di.app

import com.airatlovesmusic.multik.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun getContext(application: App) =
        application

}