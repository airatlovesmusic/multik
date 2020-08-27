package com.airatlovesmusic.repo.di

import com.airatlovesmusic.global.di.RepositoryDependencies
import com.airatlovesmusic.network.di.DaggerNetworkComponent
import com.airatlovesmusic.network.di.NetworkDependencies
import dagger.Component

@Component(
    modules = [RepositoryModule::class],
    dependencies = [NetworkDependencies::class]
)
interface RepositoryComponent: RepositoryDependencies {
    class Starter {
        companion object {
            fun start(): RepositoryDependencies {
                val networkDependencies = DaggerNetworkComponent.create()
                return DaggerRepositoryComponent.builder()
                    .networkDependencies(networkDependencies)
                    .build()
            }
        }
    }
}