package com.airatlovesmusic.core_network_impl.di

import com.airatlovesmusic.core_network_api.di.CoreNetworkApi
import com.airatlovesmusic.global.di.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(
    modules = [NetworkModule::class]
)
interface NetworkComponent: CoreNetworkApi {
    companion object {
        val instance: NetworkComponent by lazy { DaggerNetworkComponent.create() }
    }
}