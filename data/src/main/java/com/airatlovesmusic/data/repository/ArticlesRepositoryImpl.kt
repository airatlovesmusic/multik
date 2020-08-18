package com.airatlovesmusic.data.repository

import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.data.network.ApiService
import javax.inject.Inject

class ArticlesRepositoryImpl @Inject constructor(
    private val api: ApiService
): ArticlesRepository {
    override fun getArticles() = api.getArticles()
    override fun getArticle(url: String) = api.getArticle(url)
}