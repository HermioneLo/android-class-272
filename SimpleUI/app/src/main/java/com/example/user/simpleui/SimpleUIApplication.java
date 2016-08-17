package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import java.util.ArrayList;

/**
 * Created by user on 2016/8/16.
 */
public class SimpleUIApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Drink.class);
        
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3HhmfC5AyW17hTlFPPQRyaAbP8OVd9xTfFe7VVDg")
                .server("https://parseapi.back4app.com/")
                .clientKey("EdZCyuwNIKyzmNcyhYuucwo5bpEsn1MwCXABlbom")
                .build()
        );
    }
}
