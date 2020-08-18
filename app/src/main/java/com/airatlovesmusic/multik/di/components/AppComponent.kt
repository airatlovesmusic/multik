package com.airatlovesmusic.multik.di.components

import com.airatlovesmusic.multik.data.network.ApiService
import com.airatlovesmusic.multik.di.modules.ServerModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@Singleton
@Component(modules = [ServerModule::class])
interface AppComponent {
    val apiService: ApiService
}