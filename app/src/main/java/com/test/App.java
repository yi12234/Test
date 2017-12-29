package com.test;

import android.app.Application;
import android.os.Handler;

/**
 * Created by lenovo on 2017/12/14.
 */

public class App extends Application{

    private static Handler mainHandler;

    public static Handler getHandler() {
        return mainHandler;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mainHandler = new Handler();

    }
}
