package com.digitalcrafts.podsample.shared


class Greeting {

    private val platform: Platform by lazy { Platform() }

    fun greeting(): String = "Hello, ${Platform().platform}!"

    fun isNetAvailable(): String = platform.isNetworkAvailable().toString()
}
