package com.yanhao.secret;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by yons on 2015/4/22.
 */
public class Config {
    public static final String APP_ID="com.yanhao.secret";
    public static final String KEY_TOKEN="token";
    public static final String KEY_ACTION="action";
    public static final String CHARSET ="utf-8" ;
    public static final String SERVER_URL = "http://demo.eoeschool.com/api/v1/nimings/io";
    public static final String ACTION_GET_CODE = "send_pass";


    public static String getCacheToken(Context context){
        return context.getSharedPreferences(APP_ID,Context.MODE_PRIVATE).getString(KEY_TOKEN,null);
    }

    public static void cacheToken(Context context,String token){
        SharedPreferences.Editor editor=context.getSharedPreferences(APP_ID,Context.MODE_PRIVATE).edit();
        editor.putString(KEY_TOKEN,token);
        editor.commit();
    }
}
