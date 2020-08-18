package com.airatlovesmusic.feature1.di

import com.airatlovesmusic.global.di.dependencies.ComponentDependencies
import com.airatlovesmusic.global.interfaces.AppRouter
import com.airatlovesmusic.global.interfaces.ArticlesRepository

interface ArticlesDependencies : ComponentDependencies {
    fun provideArticlesRepository(): ArticlesRepository
    fun provideRouter(): AppRouter
}