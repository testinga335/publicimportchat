package com.orion.orionchats.model

import org.json.JSONObject

class User{
    val TABLE_USERS = "Users"
    val COLUMN_UID = "uid"
    val COLUMN_NAME = "name"
    val COLUMN_EMAIL = "email"
    val COLUMN_AVATAR = "avatar"
    val COLUMN_LINK = "link"
    val COLUMN_ROLE = "role"
    val COLUMN_METADATA = "metadata"
    val COLUMN_CREDITS = "credits"
    val COLUMN_STATUS = "status"
    val COLUMN_STATUS_MESSAGE = "statusMessage"
    val COLUMN_LAST_ACTIVE_AT = "lastActiveAt"
    protected var uid: String? = null
    protected var name: String? = null
    protected var email: String? = null
    protected var avatar: String? = null
    protected var link: String? = null
    protected var role: String? = null
    protected var metadata: JSONObject? = null
    protected var credits = 0
    protected var status: String? = null
    protected var statusMessage: String? = null
    protected var lastActiveAt: Long = 0
}