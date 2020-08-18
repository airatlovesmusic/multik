package com.airatlovesmusic.multik

import android.app.Application
import com.airatlovesmusic.multik.di.components.DaggerAppComponent

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class App: Application() {

    companion object {
        val appComponent by lazy {
            DaggerAppComponent.create()
        }
    }

}