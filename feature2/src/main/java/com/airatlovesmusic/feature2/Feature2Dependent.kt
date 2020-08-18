package com.airatlovesmusic.feature2

import com.airatlovesmusic.base.BaseNetwork
import com.airatlovesmusic.base.BaseRepository

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class Feature2Dependent(val name: String, private val baseRepository: BaseRepository, private val baseNetwork: BaseNetwork) {
    override fun toString(): String {
        return "FeatureOneDependent $name ${super.toString()}  with\n$baseRepository and\n$baseNetwork"
    }
}