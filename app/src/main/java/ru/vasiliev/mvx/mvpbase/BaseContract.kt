package ru.vasiliev.mvx.mvpbase

interface MVPView

interface MVPPresenter<V : MVPView> {
    fun attach(view: V)
    fun detach()
}
