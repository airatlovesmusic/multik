package com.airatlovesmusic.$1.di

import com.airatlovesmusic.global.data.system.FlowRouter
import com.airatlovesmusic.global.di.*
import com.airatlovesmusic.global.interfaces.ArticlesRepository
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ru.terrakok.cicerone.Router

interface TemplateDependencies: ComponentDependencies {}

@PerFlow
@Component(
    modules = [],
    dependencies = [TemplateDependencies::class])
interface TemplateComponent : DaggerComponent {
    fun inject(mainFragment: TemplateFragment)
}
