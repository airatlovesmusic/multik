package com.airatlovesmusic.feature_article.di

import com.airatlovesmusic.global.di.dependencies.ComponentDependencies
import com.airatlovesmusic.global.interfaces.AppRouter
import com.airatlovesmusic.global.interfaces.ArticlesRepository

interface ArticleDependencies : ComponentDependencies {
    fun provideArticlesRepository(): ArticlesRepository
    fun provideRouter(): AppRouter
}