package com.airatlovesmusic.multik.di.main

import com.airatlovesmusic.global.di.dependencies.ComponentDependencies
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

interface MainDependencies : ComponentDependencies {
    fun navigatorHolder(): NavigatorHolder
    fun router(): Router
}