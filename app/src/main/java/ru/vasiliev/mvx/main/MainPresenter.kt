package ru.vasiliev.mvx.main

import ru.vasiliev.mvx.mvpbase.BasePresenter
import java.security.MessageDigest
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.Locale
import kotlin.text.Charsets.UTF_8

fun ByteArray.toHex() = joinToString(separator = "") { byte -> "%02x".format(byte) }

class MainPresenter(private val model: MainModel) : BasePresenter<MainView>() {

    fun calculateTimeHash() {
        val time = System.currentTimeMillis()
        val sdf = java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", Locale("ru"))
        val date = java.util.Date(time)
        val timeStr = sdf.format(date)

        // Business logic
        val hash = model.md5(timeStr).toHex()

        // Presenter's VIEW orchestration
        view?.updateHash("HASH: $hash")
        view?.updateTime("TIME: $timeStr")
    }
}
