package com.orion.orionchats.managers;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

import androidx.annotation.NonNull;


import com.orion.orionchats.exception.OrionChatException;
import com.orion.orionchats.utils.OrionChatUtils;

public class LoginManager {
    private static Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    public abstract static class CallbackListener<T> {
        public CallbackListener() {
        }

        public abstract void onSuccess(T var1);

        public abstract void onError(OrionChatException var1);
    }

    static void postOnMainThread(Runnable runnable) {
        if (mainThreadHandler != null) {
            mainThreadHandler.post(runnable);
        } else {
            runnable.run();
        }

    }
    public static void login(@NonNull final String UID, @NonNull String apiKey,
                             @NonNull final CallbackListener<String> listener) {
        if (TextUtils.isEmpty(UID)) {
            postOnMainThread(new Runnable() {
                public void run() {
                    listener.onError(new OrionChatException("ERROR_BLANK_UID", "UID cannot be blank. Please provide a valid UID"));
                }
            });
        } else if (OrionChatUtils.Companion.containsSpace(UID)) {
            postOnMainThread(new Runnable() {
                public void run() {
                    listener.onError(new OrionChatException("ERROR_UID_WITH_SPACE", "UID cannot contain spaces. Please provide a valid UID"));
                }
            });
        } else {
            LoginManager.postOnMainThread(new Runnable() {
                public void run() {

                    listener.onSuccess(UID);
                }
            });

//            ApiConnection.getInstance().login(UID.trim(), apiKey, new ConnectionListener() {
//                public void onResponse(String response, final CometChatException ce) {
//                    if (ce != null) {
//                        CometChat.postOnMainThread(new Runnable() {
//                            public void run() {
//                                listener.onError(ce);
//                            }
//                        });
//                    } else {
//                        try {
//                            JSONObject jsonObject = new JSONObject(response);
//                            if (jsonObject.has("data")) {
//                                JSONObject dataObject = jsonObject.getJSONObject("data");
//                                if (dataObject.has("uid")) {
//                                    PreferenceHelper.saveLoggedInUID(dataObject.getString("uid"));
//                                }
//
//                                if (dataObject.has("authToken")) {
//                                    String authToken = dataObject.getString("authToken");
//                                    CometChat.login(authToken, listener);
//                                }
//                            } else {
//                                CometChat.postOnMainThread(new Runnable() {
//                                    public void run() {
//                                        listener.onError(new CometChatException("ERROR_JSON_EXCEPTION", "Something went wrong"));
//                                    }
//                                });
//                            }
//                        } catch (final JSONException var6) {
//                            CometChat.postOnMainThread(new Runnable() {
//                                public void run() {
//                                    listener.onError(new CometChatException("ERROR_JSON_EXCEPTION", var6.getMessage()));
//                                }
//                            });
//                        }
//                    }
//
//                }
//            });
        }

    }

}
