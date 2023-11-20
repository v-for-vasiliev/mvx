package ru.vasiliev.mvx

import ru.vasiliev.mvx.mvpbase.MVPView

interface Contract {

    interface MainView : MVPView {
        fun updateCounter(data: String)
        fun updateTime(time: String)
    }
}
