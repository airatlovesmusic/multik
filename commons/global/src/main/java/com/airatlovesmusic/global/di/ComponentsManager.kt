package com.airatlovesmusic.global.di

interface DaggerComponent

object ComponentManager {
    private val components = mutableMapOf<String, DaggerComponent>()

    fun getOrPut(componentName: String, componentBuilder: () -> DaggerComponent) =
        components.getOrPut(componentName, componentBuilder)

    fun clear(componentName: String) {
        components.remove(componentName)
    }
}