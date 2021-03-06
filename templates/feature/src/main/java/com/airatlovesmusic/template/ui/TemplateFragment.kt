package com.airatlovesmusic.template.ui

import android.os.Bundle
import com.airatlovesmusic.global.base.BaseFragment
import com.airatlovesmusic.global.di.findComponentDependencies
import com.airatlovesmusic.template.di.MainFlowComponent
import ru.terrakok.cicerone.NavigatorHolder
import javax.inject.Inject

class TemplateFragment: BaseFragment() {

    init {
        componentBuilder = {
            TemplateComponent
                .builder()
                .dependencies(findComponentDependencies())
                .build()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        getComponent<TemplateComponent>().inject(this)
        super.onCreate(savedInstanceState)
    }

}
