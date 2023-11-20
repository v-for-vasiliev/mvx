package ru.vasiliev.mvx.mvpbase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<V : MVPView, P : MVPPresenter<V>> : AppCompatActivity(), MVPView {

    protected abstract var presenter: P

    protected abstract fun getView(): V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attach(getView())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }
}
