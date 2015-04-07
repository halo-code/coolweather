package com.coolweather.app.util;

/**
 * Created by liumiao on 2015/4/7.
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}
