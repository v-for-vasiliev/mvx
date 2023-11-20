package ru.vasiliev.mvx.mvpbase

open class BasePresenter<V : MVPView> : MVPPresenter<V> {

    var view: V? = null

    override fun attach(view: V) {
        this.view = view
    }

    override fun detach() {
        view = null
    }
}
