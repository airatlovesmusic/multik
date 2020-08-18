package com.airatlovesmusic.multik.ui

import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airatlovesmusic.base.BaseApplication
import com.airatlovesmusic.multik.App
import com.airatlovesmusic.multik.R
import com.airatlovesmusic.multik.data.network.ApiService
import com.airatlovesmusic.multik.di.components.DaggerAppActivityComponent
import com.airatlovesmusic.multik.di.modules.NavigationModule
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import javax.inject.Inject

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class AppActivity: AppCompatActivity() {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerAppActivityComponent.builder()
            .appComponent(App.appComponent)
            .appNavigationModule(NavigationModule())
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_container)
    }

}