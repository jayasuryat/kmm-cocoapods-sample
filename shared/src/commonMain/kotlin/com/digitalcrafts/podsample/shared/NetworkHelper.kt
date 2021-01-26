package com.digitalcrafts.podsample.shared

class NetworkHelper {

    private val platform: Platform by lazy { Platform() }

    fun isNetAvailable(): String = platform.isNetworkAvailable().toString()
}