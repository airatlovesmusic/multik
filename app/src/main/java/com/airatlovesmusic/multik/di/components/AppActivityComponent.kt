package com.airatlovesmusic.multik.di.components

import com.airatlovesmusic.base.ActivityScope
import com.airatlovesmusic.multik.di.modules.NavigationModule
import com.airatlovesmusic.multik.ui.AppActivity
import dagger.Component

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [NavigationModule::class])
interface AppActivityComponent {
    fun inject(appActivity: AppActivity)

    @Component.Builder
    interface Builder {
        fun build(): AppActivityComponent
        fun appNavigationModule(navigationModule: NavigationModule): Builder
        fun appComponent(appComponent: AppComponent): Builder
    }
}