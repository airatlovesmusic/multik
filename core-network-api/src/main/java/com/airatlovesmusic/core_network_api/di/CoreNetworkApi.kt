package com.airatlovesmusic.core_network_api.di

import com.airatlovesmusic.core_network_api.data.ApiService

interface CoreNetworkApi {
    fun apiService(): ApiService
}