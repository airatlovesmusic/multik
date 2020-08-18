package com.airatlovesmusic.data.db.dao

import com.airatlovesmusic.model.Article
import kotlin.time.days

class ArticlesDaoImpl: ArticlesDao {

    override fun getArticles() = (0..10)
        .map { Article(it.toString(), (it + 1).toString()) }

    override fun getArticle(url: String) =
        getArticles().firstOrNull { it.url == url }

}