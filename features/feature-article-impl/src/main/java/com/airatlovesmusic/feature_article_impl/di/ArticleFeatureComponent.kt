package com.airatlovesmusic.feature_article_impl.di

import com.airatlovesmusic.feature_article_impl.ui.DetailArticleFragment
import com.airatlovesmusic.global.di.PerFeature
import dagger.Component

@PerFeature
@Component(
    modules = [ArticleFeatureModule::class]
)
interface ArticleFeatureComponent {
    fun inject(articleFragment: DetailArticleFragment)
}