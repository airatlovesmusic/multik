package com.airatlovesmusic.feature_article_impl

import com.airatlovesmusic.feature_article_api.ArticleFeatureStarter
import com.airatlovesmusic.feature_article_impl.ui.DetailArticleFragment
import com.airatlovesmusic.global.di.PerFeature
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppScreen

@PerFeature
class ArticleFeatureStarterImpl : ArticleFeatureStarter {
    override fun start(router: Router, url: String) {
        router.navigateTo(object : SupportAppScreen() {
            override fun getFragment() = DetailArticleFragment.create(url)
        })
    }
}