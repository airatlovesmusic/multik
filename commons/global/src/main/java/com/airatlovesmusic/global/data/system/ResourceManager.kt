package com.airatlovesmusic.global.data.system

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ResourceManager @Inject constructor(
    private val context: Context
) {

    fun getString(resId: Int) = context.getString(resId)

}