package com.airatlovesmusic.feature_article.di

import androidx.fragment.app.Fragment
import com.airatlovesmusic.feature_article.ui.ArticleRouter
import com.airatlovesmusic.feature_article.ui.DetailArticleFragment
import com.airatlovesmusic.global.di.ComponentDependencies
import com.airatlovesmusic.global.di.DaggerComponent
import com.airatlovesmusic.global.di.PerFragment
import com.airatlovesmusic.global.di.vm.ViewModelModule
import com.airatlovesmusic.global.interfaces.ArticlesRepository
import dagger.BindsInstance
import dagger.Component

interface ArticleDependencies: ComponentDependencies {
    fun provideArticlesRepository(): ArticlesRepository
    fun provideArticleRouter(): ArticleRouter
}

@PerFragment
@Component(
    modules = [ViewModelModule::class],
    dependencies = [ArticleDependencies::class]
)
interface Component: DaggerComponent {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance fragment: Fragment,
            @BindsInstance url: String,
            deps: ArticleDependencies
        ): com.airatlovesmusic.feature_article.di.Component
    }

    fun inject(fragment: DetailArticleFragment)
}

