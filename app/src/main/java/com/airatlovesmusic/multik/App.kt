package com.airatlovesmusic.multik

import android.app.Application
import com.airatlovesmusic.global.di.ComponentDependenciesProvider
import com.airatlovesmusic.global.di.HasChildDependencies
import com.airatlovesmusic.multik.di.AppComponent
import javax.inject.Inject

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class App: Application(), HasChildDependencies {

    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider

    override fun onCreate() {
        super.onCreate()
        appComponent = AppComponent.Starter.start(this)
        appComponent.inject(this)
    }

    companion object {
        lateinit var appComponent: AppComponent
    }

}