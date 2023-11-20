package ru.vasiliev.mvx

import ru.vasiliev.mvx.mvpbase.BasePresenter

class MainPresenter : BasePresenter<Contract.MainView>() {

    fun incrementCounter() {
        view?.updateCounter("data")
    }
}
