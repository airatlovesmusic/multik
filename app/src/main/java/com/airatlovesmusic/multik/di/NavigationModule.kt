package com.airatlovesmusic.multik.di

import com.airatlovesmusic.global.di.ApplicationScope
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@Module
class NavigationModule {

    @ApplicationScope
    @Provides
    fun getCicerone() = Cicerone.create()

    @ApplicationScope
    @Provides
    fun getRouter(cicerone: Cicerone<Router>) = cicerone.router

    @ApplicationScope
    @Provides
    fun getNavigationHolder(cicerone: Cicerone<Router>) = cicerone.navigatorHolder

}