package com.airatlovesmusic.feature1.di

import androidx.fragment.app.Fragment
import com.airatlovesmusic.feature1.ui.ArticlesFragment
import com.airatlovesmusic.feature1.ui.ArticlesRouter
import com.airatlovesmusic.global.di.ComponentDependencies
import com.airatlovesmusic.global.di.DaggerComponent
import com.airatlovesmusic.global.di.PerFeature
import com.airatlovesmusic.global.di.vm.ViewModelModule
import com.airatlovesmusic.global.interfaces.ArticlesRepository
import dagger.BindsInstance
import dagger.Component
import dagger.Module

interface ArticlesDependencies : ComponentDependencies {
    fun provideArticlesRepository(): ArticlesRepository
    fun provideArticlesRouter(): ArticlesRouter
}

@Component(
    dependencies = [
        ArticlesDependencies::class
    ],
    modules = [
        ArticlesModule::class
    ]
)
@PerFeature
interface Component: DaggerComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance fragment: Fragment,
            deps: ArticlesDependencies
        ): com.airatlovesmusic.feature1.di.Component
    }

    fun inject(fragment: ArticlesFragment)
}

@Module(
    includes = [
        ViewModelModule::class
    ]
)
class ArticlesModule