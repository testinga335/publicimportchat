package com.orion.orionchats.exception

class OrionChatException(s: String, s1: String) : Exception(){

    private var code: String? = s
    private var details: String? = s1
}