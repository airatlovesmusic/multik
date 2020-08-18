package com.airatlovesmusic.feature_article.di

import androidx.fragment.app.Fragment
import com.airatlovesmusic.feature_article.ui.DetailArticleFragment
import com.airatlovesmusic.global.di.PerFeature
import dagger.BindsInstance
import dagger.Component

@Component(
    dependencies = [
        ArticleDependencies::class
    ],
    modules = [
        ArticleModule::class
    ]
)
@PerFeature
interface ArticleComponent {

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance fragment: Fragment,
            @BindsInstance url: String,
            deps: ArticleDependencies
        ): ArticleComponent
    }

    fun inject(fragment: DetailArticleFragment)
}