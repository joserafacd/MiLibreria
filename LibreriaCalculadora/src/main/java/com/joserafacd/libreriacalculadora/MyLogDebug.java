package com.joserafacd.libreriacalculadora;

import android.util.Log;

public class MyLogDebug {
    private static final String TAG = "MY_LIBRARY";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
