package com.airatlovesmusic.feature1.di

import androidx.fragment.app.Fragment
import com.airatlovesmusic.feature1.ui.ArticlesFragment
import com.airatlovesmusic.global.di.PerFeature
import dagger.BindsInstance
import dagger.Component

@Component(
    dependencies = [
        ArticlesDependencies::class
    ],
    modules = [
        ArticlesModule::class
    ]
)
@PerFeature
interface ArticlesComponent {

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance fragment: Fragment,
            deps: ArticlesDependencies
        ): ArticlesComponent
    }

    fun inject(fragment: ArticlesFragment)
}