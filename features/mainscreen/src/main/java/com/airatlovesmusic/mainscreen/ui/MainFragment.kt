package com.airatlovesmusic.mainscreen.ui

import com.airatlovesmusic.global.base.FlowFragment
import com.airatlovesmusic.global.di.ComponentDependenciesProvider
import com.airatlovesmusic.global.di.HasChildDependencies
import com.airatlovesmusic.global.di.findComponentDependencies
import com.airatlovesmusic.mainscreen.Screens
import com.airatlovesmusic.mainscreen.di.DaggerMainFlowComponent
import com.airatlovesmusic.mainscreen.di.MainFlowComponent
import ru.terrakok.cicerone.NavigatorHolder
import javax.inject.Inject

class MainFragment: FlowFragment(), HasChildDependencies {

    init {
        componentBuilder = {
            DaggerMainFlowComponent
                .builder()
                .mainFragmentDependencies(findComponentDependencies())
                .build()
        }
    }



    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider

    @Inject
    override lateinit var navigatorHolder: NavigatorHolder

    override fun getLaunchScreen() = Screens.Articles

    override fun initComponent() {
        getComponent<MainFlowComponent>().inject(this)
    }


}