package com.digitalcrafts.podsample.shared


import cocoapods.AFNetworking.AFNetworkReachabilityManager
import platform.UIKit.UIDevice


actual class Platform actual constructor() {

    actual val platform: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    actual fun isNetworkAvailable(): Boolean = AFNetworkReachabilityManager().reachable
}