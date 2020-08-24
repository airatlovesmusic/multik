package com.airatlovesmusic.multik

import com.airatlovesmusic.mainscreen.ui.MainFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    object Main: SupportAppScreen() {
        override fun getFragment() = MainFragment()
    }

}