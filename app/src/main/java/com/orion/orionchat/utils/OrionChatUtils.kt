package com.orion.orionchat.utils

import android.content.Context
import android.net.ConnectivityManager

public  class OrionChatUtils{

    private val TAG: String = OrionChatUtils::class.java.getSimpleName()
    var TYPE_WIFI = 1
    var TYPE_MOBILE = 2
    var TYPE_NOT_CONNECTED = 0


    fun getConnectivityStatus(context: Context): Int {
        val cm =
            context.getSystemService("connectivity") as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        if (null != activeNetwork && activeNetwork.isConnectedOrConnecting) {
            if (activeNetwork.type == 1 && activeNetwork.isConnected) {
                return TYPE_WIFI
            }
            if (activeNetwork.type == 0 && activeNetwork.isConnected) {
                return TYPE_MOBILE
            }
        }
        return TYPE_NOT_CONNECTED
    }

    fun getResourceId(): String? {
        return "android_" + System.currentTimeMillis()
    }

//    fun getMUCService(): String? {
//        val settings: Settings = SettingsRepo.getSettings()
//        return settings.getGroupService().toString() + "." + settings.getChatHost()
//    }

    companion object {
        fun containsSpace(UID: String): Boolean {
            return UID.contains(" ")
        }
    }
}