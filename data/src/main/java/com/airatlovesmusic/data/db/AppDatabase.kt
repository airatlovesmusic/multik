package com.airatlovesmusic.data.db

import com.airatlovesmusic.data.db.dao.ArticlesDao
import com.airatlovesmusic.data.db.dao.ArticlesDaoImpl

class AppDatabase {

    fun articlesDao(): ArticlesDao = ArticlesDaoImpl()

    companion object {
        fun create() = AppDatabase()
    }

}