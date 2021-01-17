package com.digitalcrafts.podsample.shared

expect class Platform() {
    val platform: String
    fun isNetworkAvailable(): Boolean
}