package ru.vasiliev.mvx.mvpbase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<V : MVPView, P : MVPPresenter<V>> : MVPView, AppCompatActivity() {

    protected abstract var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attach(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }
}
