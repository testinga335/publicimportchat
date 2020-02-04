package com.orion.orionchat.managers

import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import com.orion.orionchats.exception.OrionChatException
import com.orion.orionchats.model.User

class LoginManagers {
    private val mainThreadHandler = Handler(Looper.getMainLooper())

    companion object {
        fun login( UID: String,
                   apiKey: String,
                   listener: CallbackListener<User?>): Void? = null
    }

    abstract class CallbackListener<T> {
        abstract fun onSuccess(var1: T)
        abstract fun onError(var1: Exception?)
    }

    fun postOnMainThread(runnable: Runnable) {
        if (mainThreadHandler != null) {
            mainThreadHandler.post(runnable)
        } else {
            runnable.run()
        }
    }


    fun login(
        UID: String,
        apiKey: String,
        listener: CallbackListener<User?>
    ) {
        if (TextUtils.isEmpty(UID)) {
            postOnMainThread(Runnable {
                listener.onError(
                    OrionChatException(
                        "ERROR_BLANK_UID",
                        "UID cannot be blank. Please provide a valid UID"
                    )
                )
            })
        }
//        else if (OrionChatUtils.containsSpace(UID)) {
//            postOnMainThread(Runnable {
//                listener.onError(
//                   OrionChatException(
//                        "ERROR_UID_WITH_SPACE",
//                        "UID cannot contain spaces. Please provide a valid UID"
//                    )
//                )
//            })
//        } else {
//            ApiConnection.getInstance()
//                .login(UID.trim { it <= ' ' }, apiKey, object : ConnectionListener() {
//                    fun onResponse(
//                        response: String?,
//                        ce: OrionChatException?
//                    ) {
//                        if (ce != null) {
//                            postOnMainThread(Runnable {
//                                listener.onError(
//                                    ce
//                                )
//                            })
//                        } else {
//                            try {
//                                val jsonObject = JSONObject(response)
//                                if (jsonObject.has("data")) {
//                                    val dataObject = jsonObject.getJSONObject("data")
//                                    if (dataObject.has("uid")) {
//                                        PreferenceHelper.saveLoggedInUID(dataObject.getString("uid"))
//                                    }
//                                    if (dataObject.has("authToken")) {
//                                        val authToken =
//                                            dataObject.getString("authToken")
//                                       login(authToken, listener)
//                                    }
//                                } else {
//                                   postOnMainThread(Runnable {
//                                        listener.onError(
//                                            OrionChatException(
//                                                "ERROR_JSON_EXCEPTION",
//                                                "Something went wrong"
//                                            )
//                                        )
//                                    })
//                                }
//                            } catch (var6: JSONException) {
//                               postOnMainThread(Runnable {
//                                    listener.onError(
//                                        var6.message?.let {
//                                            OrionChatException(
//                                                "ERROR_JSON_EXCEPTION",
//                                                it
//                                            )
//                                        }
//                                    )
//                                })
//                            }
//                        }
//                    }
//                })
//        }
    }

}