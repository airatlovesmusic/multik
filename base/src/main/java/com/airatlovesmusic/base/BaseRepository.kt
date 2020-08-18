package com.airatlovesmusic.base

/**
 * Created by Airat Khalilov on 17/08/2020.
 */

class BaseRepository(val name: String) {
    override fun toString(): String {
        return "BaseRepository $name ${super.toString()} "
    }
}