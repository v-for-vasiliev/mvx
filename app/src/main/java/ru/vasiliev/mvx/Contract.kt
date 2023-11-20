package ru.vasiliev.mvx

import ru.vasiliev.mvx.mvpbase.BaseContract

interface Contract {

    interface MainView : BaseContract.MVPView {
        fun updateCounter(data: String)
        fun updateTime(time: String)
    }
}
