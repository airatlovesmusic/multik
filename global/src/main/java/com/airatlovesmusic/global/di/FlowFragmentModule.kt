package com.airatlovesmusic.global.di

import com.airatlovesmusic.global.data.system.FlowRouter
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

@Module
object FlowFragmentModule {

    @Provides
    @PerFlow
    fun provideCicerone(router: Router) = Cicerone.create(FlowRouter(router))

    @Provides
    @PerFlow
    fun provideFlowRouter(cicerone: Cicerone<FlowRouter>) = cicerone.router

    @Provides
    @PerFlow
    fun provideFlowNavigatorHolder(cicerone: Cicerone<FlowRouter>) = cicerone.navigatorHolder

}