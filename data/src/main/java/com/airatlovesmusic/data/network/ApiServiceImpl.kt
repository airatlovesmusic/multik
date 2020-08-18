package com.airatlovesmusic.data.network

import com.airatlovesmusic.model.Article
import org.jsoup.Jsoup
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(): ApiService {
    override fun getArticles() =
        Jsoup
            .connect("https://habr.com/ru/top/weekly/")
            .get()
            .getElementsByClass("post__title_link")
            .map { Article(it.text(), it.attr("href")) }

    override fun getArticle(url: String) =
        getArticles().firstOrNull { it.url == url }
}