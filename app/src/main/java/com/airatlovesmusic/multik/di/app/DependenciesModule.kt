package com.airatlovesmusic.multik.di.app

import com.airatlovesmusic.feature1.di.ArticlesDependencies
import com.airatlovesmusic.feature_article.di.ArticleDependencies
import com.airatlovesmusic.global.di.dependencies.ComponentDependencies
import com.airatlovesmusic.multik.di.main.MainDependencies
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class DependenciesModule private constructor() {

    @Binds
    @IntoMap
    @ComponentDependenciesKey(MainDependencies::class)
    abstract fun provideMainDependencies(component: AppComponent): ComponentDependencies

    @Binds
    @IntoMap
    @ComponentDependenciesKey(ArticlesDependencies::class)
    abstract fun provideArticlesDependencies(component: AppComponent): ComponentDependencies

    @Binds
    @IntoMap
    @ComponentDependenciesKey(ArticleDependencies::class)
    abstract fun provideArticleDependencies(component: AppComponent): ComponentDependencies


}