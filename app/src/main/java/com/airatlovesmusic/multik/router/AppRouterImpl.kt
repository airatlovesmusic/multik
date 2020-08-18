package com.airatlovesmusic.multik.router

import com.airatlovesmusic.global.interfaces.AppRouter
import com.airatlovesmusic.multik.Screens
import ru.terrakok.cicerone.Router

class AppRouterImpl (
    private val router: Router
): AppRouter {

    override fun goToArticle(url: String) =
        router.navigateTo(Screens.DetailArticle(url))

    override fun goToArticles() =
        router.navigateTo(Screens.Articles)

    override fun goBack() =
        router.exit()

}