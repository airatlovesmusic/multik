package com.airatlovesmusic.base

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@Singleton
@Component(modules = [BaseNetworkModule::class, BaseRepositoryModule::class])
interface BaseComponent {
    val baseNetwork: BaseNetwork
    val baseRepository: BaseRepository
}