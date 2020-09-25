package com.airatlovesmusic.global.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airatlovesmusic.global.di.ComponentManager
import com.airatlovesmusic.global.di.DaggerComponent
import com.airatlovesmusic.global.di.HasChildDependencies
import ru.startted.utils.objectScopeName

abstract class BaseFragment : Fragment() {

    abstract val layoutRes: Int

    protected lateinit var componentBuilder: () -> DaggerComponent

    private var instanceStateSaved: Boolean = false
    lateinit var fragmentScopeName: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(layoutRes, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        fragmentScopeName = savedInstanceState?.getString(STATE_SCOPE_NAME) ?: objectScopeName()
        initComponent()
        super.onCreate(savedInstanceState)
    }

    abstract fun initComponent()

    override fun onResume() {
        super.onResume()
        instanceStateSaved = false
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        instanceStateSaved = true
        outState.putString(STATE_SCOPE_NAME, fragmentScopeName)
    }

    override fun onDestroy() {
        super.onDestroy()
        ComponentManager.clear(fragmentScopeName)
    }

    protected inline fun <reified T : DaggerComponent> getComponent(): T =
        ComponentManager.getOrPut(fragmentScopeName, componentBuilder) as T

    private fun isRealRemoving(): Boolean =
        (isRemoving && !instanceStateSaved) ||
                ((parentFragment as? BaseFragment)?.isRealRemoving() ?: false)

    private fun needCloseDependencies(): Boolean =
        when {
            activity?.isChangingConfigurations == true -> false
            activity?.isFinishing == true -> true
            else -> isRealRemoving()
        }

    open fun onBackPressed() {}

    companion object {
        private const val STATE_SCOPE_NAME = "state_scope_name"
    }

}