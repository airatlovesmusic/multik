package com.airatlovesmusic.multik.di.modules

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@Module
class NavigationModule {

    @Provides
    fun getCicerone() = Cicerone.create()

    @Provides
    fun getRouter(cicerone: Cicerone<Router>) = cicerone.router

    @Provides
    fun getNavigationHolder(cicerone: Cicerone<Router>) = cicerone.navigatorHolder

}