package com.airatlovesmusic.feature1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.airatlovesmusic.base.BaseApplication
import javax.inject.Inject

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class Feature1Fragment: Fragment() {

    @Inject
    lateinit var featureOneDependent: Feature1Dependent

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerFeature1Component.builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(featureOneDependent.name)
    }


}