package com.airatlovesmusic.network.di

import com.airatlovesmusic.network.ApiClient
import dagger.Component

interface NetworkDependencies {
    fun provideApiClient(): ApiClient
}

@Component(modules = [NetworkModule::class])
interface NetworkComponent: NetworkDependencies