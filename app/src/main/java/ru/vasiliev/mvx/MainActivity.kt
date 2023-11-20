package ru.vasiliev.mvx

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import ru.vasiliev.mvx.mvpbase.BaseActivity
import ru.vasiliev.mvx.mvpbase.BasePresenter

class MainActivity : BaseActivity<MainPresenter>(), Contract.MainView {

    override var presenter = MainPresenter()

    private var loadDataButton: Button? = null
    private var loadedData: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadDataButton = findViewById(R.id.loadDataButton)
        loadDataButton?.setOnClickListener { presenter.incrementCounter() }
        loadedData = findViewById(R.id.loadedData)
    }

//    override fun showData(data: String) {
//        loadedData?.text = data
//    }

    override fun updateCounter(data: String) {
        TODO("Not yet implemented")
    }

    override fun updateTime(time: String) {
        TODO("Not yet implemented")
    }
}