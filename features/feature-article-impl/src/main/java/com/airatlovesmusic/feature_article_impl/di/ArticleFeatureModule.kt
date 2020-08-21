package com.airatlovesmusic.feature_article_impl.di

import com.airatlovesmusic.feature_article_api.ArticleFeatureStarter
import com.airatlovesmusic.feature_article_impl.ArticleFeatureStarterImpl
import com.airatlovesmusic.global.di.PerFeature
import com.airatlovesmusic.global.di.vm.ViewModelModule
import dagger.Binds
import dagger.Module

@Module(
    includes = [ViewModelModule::class]
)
abstract class ArticleFeatureModule {
    @PerFeature
    @Binds
    abstract fun articleFeatureStarter(articleFeatureStarterImpl: ArticleFeatureStarterImpl): ArticleFeatureStarter
}