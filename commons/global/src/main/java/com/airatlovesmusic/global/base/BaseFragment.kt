package com.airatlovesmusic.global.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airatlovesmusic.global.di.ComponentManager
import com.airatlovesmusic.global.di.DaggerComponent
import com.airatlovesmusic.global.di.HasChildDependencies

abstract class BaseFragment : Fragment() {

    abstract val layoutRes: Int

    protected lateinit var componentBuilder: () -> DaggerComponent

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutRes, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        ComponentManager.clear(this.javaClass.simpleName)
    }

    protected inline fun <reified T : DaggerComponent> getComponent(): T =
        ComponentManager.getOrPut(this.javaClass.simpleName, componentBuilder) as T


    open fun onBackPressed() {}

}