package com.airatlovesmusic.data.module

import com.airatlovesmusic.data.network.ApiService
import com.airatlovesmusic.data.network.ApiServiceImpl
import com.airatlovesmusic.global.di.ApplicationScope
import dagger.Binds
import dagger.Module

@Module
interface NetworkModule {
    @Binds
    @ApplicationScope
    fun bindApiService(apiService: ApiServiceImpl): ApiService
}