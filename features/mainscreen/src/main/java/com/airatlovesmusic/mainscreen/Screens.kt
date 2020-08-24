package com.airatlovesmusic.mainscreen

import com.airatlovesmusic.feature1.ui.ArticlesFragment
import com.airatlovesmusic.feature_article.ui.DetailArticleFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

interface Screens {
    object Articles: SupportAppScreen() {
        override fun getFragment() = ArticlesFragment()
    }
    data class DetailArticle(val url: String): SupportAppScreen() {
        override fun getFragment() = DetailArticleFragment.create(url)
    }
}