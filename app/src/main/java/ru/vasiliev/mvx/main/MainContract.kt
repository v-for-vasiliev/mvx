package ru.vasiliev.mvx.main

import ru.vasiliev.mvx.mvpbase.MVPView

interface MainView : MVPView {
    fun updateHash(hash: String)
    fun updateTime(time: String)
}
