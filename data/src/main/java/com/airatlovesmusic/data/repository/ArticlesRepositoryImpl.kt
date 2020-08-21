package com.airatlovesmusic.data.repository

import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.data.network.ApiService
import javax.inject.Inject

class ArticlesRepositoryImpl @Inject constructor(
    private val api: ApiService
): ArticlesRepository {
    override suspend fun getArticles() =
        api.getArticles()
    override suspend fun getArticle(url: String) =
        api.getArticles().firstOrNull { it.url == url }
}