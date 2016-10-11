package com.leonwang.app.retrofitdesdemo.config;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

/**
 * 当前类注释：
 * Author :LeonWang
 * Created  2016/10/11.11:07
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class App extends Application {

    private static Context appContext;
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appContext = getApplicationContext();
        init();
    }

    private void init() {
        //初始化Stetho调试工具
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }

    public static App getInstance() {
        return instance;
    }

    public Context getAppContext() {
        return appContext;
    }

}
