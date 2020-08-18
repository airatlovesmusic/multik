package com.airatlovesmusic.data.db.dao

import com.airatlovesmusic.model.Article

interface ArticlesDao {
    fun getArticles(): List<Article>
    fun getArticle(url: String): Article?
}