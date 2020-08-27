package com.airatlovesmusic.repo.di

import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.repo.ArticlesRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun bindsArticlesRepo(impl: ArticlesRepositoryImpl): ArticlesRepository
}