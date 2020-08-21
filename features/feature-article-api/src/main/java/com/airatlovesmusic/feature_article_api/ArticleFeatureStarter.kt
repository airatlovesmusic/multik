package com.airatlovesmusic.feature_article_api

import ru.terrakok.cicerone.Router

interface ArticleFeatureStarter {
    fun start(router: Router, url: String)
}