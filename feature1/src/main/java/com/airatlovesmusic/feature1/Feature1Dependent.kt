package com.airatlovesmusic.feature1

import com.airatlovesmusic.base.BaseNetwork
import com.airatlovesmusic.base.BaseRepository

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class Feature1Dependent(val name: String, private val baseRepository: BaseRepository, private val baseNetwork: BaseNetwork) {
    override fun toString(): String {
        return "FeatureOneDependent $name ${super.toString()}  with\n$baseRepository and\n$baseNetwork"
    }
}