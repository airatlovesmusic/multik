package com.airatlovesmusic.template.di

import com.airatlovesmusic.global.data.system.FlowRouter
import com.airatlovesmusic.global.di.*
import com.airatlovesmusic.template.Screens
import com.airatlovesmusic.template.ui.TemplateFragment
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ru.terrakok.cicerone.Router

interface TemplateDependencies: ComponentDependencies {}

@PerFlow
@Component(
    modules = [FlowFragmentModule::class, TemplateModule::class, ChildDependenciesModule::class],
    dependencies = [TemplateDependencies::class])
interface TemplateComponent : DaggerComponent {
    fun inject(fragment: TemplateFragment)
}

@Module
object TemplateModule {}

@Module
interface ChildDependenciesModule {}