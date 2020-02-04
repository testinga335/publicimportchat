package com.orion.orionchats.helpers;

import android.util.Log;

public class Logger {
    private static final String LOGGER_TAG = "CometChatPro";

    public Logger() {
    }

    public static boolean isDev() {
        return false;
    }

    public static void error(String message) {
        if (isDev()) {
            Log.e("CometChatPro", message);
        }

    }

    public static void debug(String message) {
        Log.d("CometChatPro", message);
    }

    public static void info(String message) {
        Log.i("CometChatPro", message);
    }

    public static void error(String TAG, String message) {
        if (isDev()) {
            Log.e(TAG, message);
        }

    }

    public static void debug(String TAG, String message) {
        Log.d(TAG, message);
    }

    public static void info(String TAG, String message) {
        Log.i(TAG, message);
    }

    public static void errorLong(String TAG, String message) {
        int maxLogSize = 1000;

        for(int i = 0; i <= message.length() / maxLogSize; ++i) {
            int start = i * maxLogSize;
            int end = (i + 1) * maxLogSize;
            end = end > message.length() ? message.length() : end;
            error(TAG, message.substring(start, end));
        }

    }
}