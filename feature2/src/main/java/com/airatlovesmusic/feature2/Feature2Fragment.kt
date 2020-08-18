package com.airatlovesmusic.feature2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.airatlovesmusic.base.BaseApplication
import javax.inject.Inject

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class Feature2Fragment: Fragment() {

    @Inject
    lateinit var feature2Dependent: Feature2Dependent

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerFeature2Component.builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(feature2Dependent.name)
    }


}