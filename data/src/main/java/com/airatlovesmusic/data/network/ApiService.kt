package com.airatlovesmusic.data.network

import com.airatlovesmusic.model.Article
import retrofit2.http.GET

interface ApiService {
    @GET("multik/master/articles.json")
    suspend fun getArticles(): List<Article>
}