package com.xiaanweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Description:
 * Copyright  : Copyright (c) 2016
 * Author     : yangfang
 * Date       : 2017/2/27 23:34
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        //传入请求地址，并且注册一个回调来处理服务器响应就可以
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
