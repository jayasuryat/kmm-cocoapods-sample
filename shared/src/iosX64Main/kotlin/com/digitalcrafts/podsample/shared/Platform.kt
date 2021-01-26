package com.digitalcrafts.podsample.shared


import cocoapods.AFNetworking.AFNetworkReachabilityManager
import platform.UIKit.UIDevice


actual class Platform actual constructor() {

    init {
        initialize()
    }

    private fun initialize() {
        AFNetworkReachabilityManager.sharedManager().startMonitoring()
        println("AFNetworkReachabilityManager initialized")
    }

    actual val platform: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    actual fun isNetworkAvailable(): Boolean =
        AFNetworkReachabilityManager.sharedManager().reachable
}