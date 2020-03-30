package com.someray.myfirstapp;

import android.app.Application;
import android.content.Context;

import com.someray.myfirstapp.mqtt.Mqtt;

public class MApplication  extends Application {
    private static Application app = null;

    public static Application getInstance() {
        return MApplication.app;
    }

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        app = this;
//        Mqtt.getInstance(this).connect();
    }

    @Override
    public void onCreate(){
        super.onCreate();
    }
}
