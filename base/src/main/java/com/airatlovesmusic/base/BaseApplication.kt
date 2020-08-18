package com.airatlovesmusic.base

import android.app.Application

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class BaseApplication: Application() {
    companion object {
        val baseComponent by lazy {
            DaggerBaseComponent.create()
        }
    }
}