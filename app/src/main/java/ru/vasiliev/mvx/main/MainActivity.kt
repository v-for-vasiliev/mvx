package ru.vasiliev.mvx.main

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import ru.vasiliev.mvx.R
import ru.vasiliev.mvx.mvpbase.BaseActivity

class MainActivity : BaseActivity<MainView, MainPresenter>(), MainView {

    override var presenter = MainPresenter(MainModel())
    override fun getView() = this

    private var calcHashButton: Button? = null
    private var hashView: TextView? = null
    private var timeView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calcHashButton = findViewById(R.id.calcTimeHash)
        calcHashButton?.setOnClickListener { presenter.calculateTimeHash() }
        hashView = findViewById(R.id.hash)
        timeView = findViewById(R.id.time)
        presenter.calculateTimeHash()
    }

    override fun updateHash(hash: String) {
        hashView?.text = hash
    }

    override fun updateTime(time: String) {
        timeView?.text = time
    }
}