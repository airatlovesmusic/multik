package com.airatlovesmusic.global.interfaces

import com.airatlovesmusic.model.Article

interface ArticlesRepository {
    fun getArticles(): List<Article>
    fun getArticle(url: String): Article?
}