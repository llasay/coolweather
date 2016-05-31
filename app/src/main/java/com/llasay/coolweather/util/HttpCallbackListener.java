package com.llasay.coolweather.util;

/**
 * Created by 19726 on 2016/5/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
