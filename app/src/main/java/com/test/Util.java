package com.test;

/**
 * Created by lenovo on 2017/12/14.
 */

public class Util {
    public static void runOnUiThread(Runnable r) {
        App.getHandler().post(r);
    }
}
