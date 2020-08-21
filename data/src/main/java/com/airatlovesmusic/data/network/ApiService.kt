package com.airatlovesmusic.data.network

import com.airatlovesmusic.model.Article

interface ApiService {

    fun getArticles(): List<Article>
    fun getArticle(url: String): Article?
}