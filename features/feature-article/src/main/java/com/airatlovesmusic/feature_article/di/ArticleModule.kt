package com.airatlovesmusic.feature_article.di

import com.airatlovesmusic.global.di.vm.ViewModelModule
import dagger.Module

@Module(
    includes = [
        ViewModelModule::class
    ]
)
class ArticleModule {}