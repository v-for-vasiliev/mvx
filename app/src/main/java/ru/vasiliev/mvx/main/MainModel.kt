package ru.vasiliev.mvx.main

import java.security.MessageDigest

class MainModel {

    fun md5(str: String): ByteArray =
        MessageDigest.getInstance("MD5").digest(str.toByteArray(Charsets.UTF_8))
}