package com.airatlovesmusic.multik.di

import android.content.Context
import com.airatlovesmusic.global.data.system.ResourceManager
import com.airatlovesmusic.global.di.*
import com.airatlovesmusic.mainscreen.di.MainFragmentDependencies
import com.airatlovesmusic.multik.App
import com.airatlovesmusic.multik.ui.AppActivity
import com.airatlovesmusic.repo.di.RepositoryComponent
import dagger.*
import dagger.multibindings.IntoMap
import javax.inject.Singleton

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

@ApplicationScope
@Component(
    modules = [
        AppModule::class,
        NavigationModule::class,
        ComponentDependenciesModule::class
    ],
    dependencies = [
        RepositoryDependencies::class
    ]
)
interface AppComponent: ApplicationDependencies, MainFragmentDependencies {
    class Starter {
        companion object {
            fun start(application: App): AppComponent {
                val repositoryDependencies = RepositoryComponent.Starter.start()
                return DaggerAppComponent.builder()
                    .application(application)
                    .repositoryDependencies(repositoryDependencies)
                    .build()
            }
        }
    }

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder
        fun repositoryDependencies(repositoryDependencies: RepositoryDependencies): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
    fun inject(appActivity: AppActivity)
}

@Module
class AppModule {
    @Provides
    @Singleton
    fun getContext(application: App): Context = application

    @Provides
    @Singleton
    fun provideResourceManager(context: Context) = ResourceManager(context)

}

@Module
interface ComponentDependenciesModule {
    @Binds
    @IntoMap
    @ComponentDependenciesKey(MainFragmentDependencies::class)
    fun provideMainFlowDependencies(appComponent: AppComponent): ComponentDependencies
}