package com.airatlovesmusic.data.module

import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.data.repository.ArticlesRepositoryImpl
import com.airatlovesmusic.global.di.ApplicationScope
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    @ApplicationScope
    fun bindArticlesRepository(articlesRepository: ArticlesRepositoryImpl): ArticlesRepository

}