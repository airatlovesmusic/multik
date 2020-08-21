package com.airatlovesmusic.core_network_api.data

import com.airatlovesmusic.model.Article

interface ApiService {
    fun getArticles(): List<Article>
}