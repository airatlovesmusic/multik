package com.airatlovesmusic.multik

import android.app.Application
import com.airatlovesmusic.global.di.dependencies.ComponentDependenciesProvider
import com.airatlovesmusic.global.di.dependencies.HasChildDependencies
import com.airatlovesmusic.multik.di.app.AppComponent
import com.airatlovesmusic.multik.di.app.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class App: Application(), HasChildDependencies {

    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider

    lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()
        appComponent =
            DaggerAppComponent
                .builder()
                .application(this)
                .build()
        appComponent.inject(this)
    }

}