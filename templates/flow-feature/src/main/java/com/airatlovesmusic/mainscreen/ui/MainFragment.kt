package com.airatlovesmusic.template.ui

import android.os.Bundle
import com.airatlovesmusic.global.base.FlowFragment
import com.airatlovesmusic.global.di.ComponentDependenciesProvider
import com.airatlovesmusic.global.di.HasChildDependencies
import com.airatlovesmusic.global.di.findComponentDependencies
import com.airatlovesmusic.mainscreen.Screens
import com.airatlovesmusic.mainscreen.di.DaggerTemplateComponent
import com.airatlovesmusic.mainscreen.di.TemplateComponent
import ru.terrakok.cicerone.NavigatorHolder
import javax.inject.Inject

class TemplateFragment: FlowFragment(), HasChildDependencies {

    init {
        componentBuilder = {
            DaggerTemplateComponent
                .builder()
                .templateFragmentDependencies(findComponentDependencies())
                .build()
        }
    }

    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider

    @Inject
    override lateinit var navigatorHolder: NavigatorHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        getComponent<TemplateComponent>().inject(this)
        super.onCreate(savedInstanceState)
    }

}