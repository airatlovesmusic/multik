package com.airatlovesmusic.multik.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.airatlovesmusic.global.base.BaseFragment
import com.airatlovesmusic.multik.App
import com.airatlovesmusic.multik.R
import com.airatlovesmusic.multik.Screens
import com.airatlovesmusic.multik.di.AppComponent
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.BackTo
import ru.terrakok.cicerone.commands.Command
import ru.terrakok.cicerone.commands.Replace
import javax.inject.Inject

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class AppActivity: AppCompatActivity() {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router

    private val currentFragment: BaseFragment?
        get() = supportFragmentManager.findFragmentById(R.id.container) as? BaseFragment

    private val navigator: Navigator = object : SupportAppNavigator(this, supportFragmentManager, R.id.container) {
        override fun setupFragmentTransaction(
            command: Command,
            currentFragment: Fragment?,
            nextFragment: Fragment?,
            fragmentTransaction: FragmentTransaction
        ) {
            fragmentTransaction.setReorderingAllowed(true)
        }

        override fun errorOnApplyCommand(command: Command, error: RuntimeException) {
            super.errorOnApplyCommand(command, error)
            Handler(Looper.getMainLooper()).postDelayed(
                { applyCommand(command) },
                100
            )
        }
    }

    private val appComponent by lazy { App.appComponent }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_container)
        if (savedInstanceState == null) {
            navigator.applyCommands(
                arrayOf(
                    BackTo(null),
                    Replace(Screens.Main)
                )
            )
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

    override fun onBackPressed() {
        currentFragment?.onBackPressed() ?: super.onBackPressed()
    }

}