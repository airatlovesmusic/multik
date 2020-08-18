package com.airatlovesmusic.multik.di.app

import com.airatlovesmusic.data.module.NetworkModule
import com.airatlovesmusic.data.module.RepositoryModule
import com.airatlovesmusic.feature1.di.ArticlesDependencies
import com.airatlovesmusic.feature_article.di.ArticleDependencies
import com.airatlovesmusic.global.di.ApplicationScope
import com.airatlovesmusic.multik.App
import com.airatlovesmusic.multik.di.main.MainDependencies
import com.airatlovesmusic.multik.di.main.NavigationModule
import com.airatlovesmusic.multik.ui.AppActivity
import dagger.BindsInstance
import dagger.Component

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@ApplicationScope
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        NavigationModule::class,
        DependenciesModule::class
    ]
)
interface AppComponent: MainDependencies, ArticlesDependencies, ArticleDependencies {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
    fun inject(appActivity: AppActivity)
}