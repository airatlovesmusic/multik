package com.airatlovesmusic.global.interfaces

import com.airatlovesmusic.model.Article

interface ArticlesRepository {
    suspend fun getArticles(): List<Article>
    suspend fun getArticle(url: String): Article?
}