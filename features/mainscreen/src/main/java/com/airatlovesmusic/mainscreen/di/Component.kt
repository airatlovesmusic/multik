package com.airatlovesmusic.mainscreen.di

import com.airatlovesmusic.articles.di.ArticlesDependencies
import com.airatlovesmusic.articles.ui.ArticlesRouter
import com.airatlovesmusic.feature_article.di.ArticleDependencies
import com.airatlovesmusic.feature_article.ui.ArticleRouter
import com.airatlovesmusic.global.data.system.FlowRouter
import com.airatlovesmusic.global.di.*
import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.mainscreen.Screens
import com.airatlovesmusic.mainscreen.ui.MainFragment
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ru.terrakok.cicerone.Router

interface MainFragmentDependencies: ComponentDependencies {
    fun provideRouter(): Router
    fun provideArticlesRepository(): ArticlesRepository
}

@PerFlow
@Component(
    modules = [FlowFragmentModule::class, MainModule::class, ChildDependenciesModule::class],
    dependencies = [MainFragmentDependencies::class])
interface MainFlowComponent : DaggerComponent, ArticlesDependencies, ArticleDependencies {
    fun inject(mainFragment: MainFragment)
}

@Module
object MainModule {
    @PerFlow
    @Provides
    fun provideArticlesRouter(flowRouter: FlowRouter): ArticlesRouter = object : ArticlesRouter {
        override fun openDetailArticle(url: String) = flowRouter.navigateTo(Screens.DetailArticle(url))
    }
    @PerFlow
    @Provides
    fun provideArticleRouter(flowRouter: FlowRouter): ArticleRouter = object : ArticleRouter {
        override fun goBack() = flowRouter.exit()
    }
}

@Module
interface ChildDependenciesModule {

    @Binds
    @IntoMap
    @ComponentDependenciesKey(ArticlesDependencies::class)
    fun provideArticlesDependencies(mainFlowComponent: MainFlowComponent): ComponentDependencies

    @Binds
    @IntoMap
    @ComponentDependenciesKey(ArticleDependencies::class)
    fun provideArticleDependencies(mainFlowComponent: MainFlowComponent): ComponentDependencies
}