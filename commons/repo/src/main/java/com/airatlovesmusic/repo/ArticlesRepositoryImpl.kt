package com.airatlovesmusic.repo

import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.network.ApiClient
import javax.inject.Inject

class ArticlesRepositoryImpl @Inject constructor(
    private val apiClient: ApiClient
): ArticlesRepository {
    override suspend fun getArticles() =
        apiClient.getArticles()

    override suspend fun getArticle(url: String) =
        apiClient.getArticles().firstOrNull { it.url == url }
}