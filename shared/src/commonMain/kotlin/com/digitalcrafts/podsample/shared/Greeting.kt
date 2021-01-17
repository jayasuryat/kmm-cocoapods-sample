package com.digitalcrafts.podsample.shared


class Greeting {

    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun isNetAvailable(): String = Platform().isNetworkAvailable().toString()
}
