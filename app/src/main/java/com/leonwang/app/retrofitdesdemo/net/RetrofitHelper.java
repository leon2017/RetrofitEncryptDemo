package com.leonwang.app.retrofitdesdemo.net;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.leonwang.app.retrofitdesdemo.config.App;
import com.leonwang.app.retrofitdesdemo.utils.ConstantUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * 当前类注释：retrofit帮助类
 * Author :LeonWang
 * Created  2016/9/21.9:59
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class RetrofitHelper {


    private static OkHttpClient mOkHttpClient;


    //获取天气测试数据
    public static DemoServices getDemoAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantUtils.BASE_URL)
                .client(mOkHttpClient)
                .addConverterFactory(CustomConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(DemoServices.class);
    }



    static{
        initOkhttpClient();
    }

    private static void initOkhttpClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (mOkHttpClient == null) {
            synchronized (RetrofitHelper.class) {
                if (mOkHttpClient == null) {
                    //设置http缓存
                    Cache cache = new Cache(new File(App.getInstance()
                            .getCacheDir(), "HttpCache"), 1024 * 1024 * 100);
                    mOkHttpClient = new OkHttpClient.Builder()
                            .cache(cache)
                            .addInterceptor(interceptor)
                            .addNetworkInterceptor(new StethoInterceptor())
                            .retryOnConnectionFailure(true)
                            .connectTimeout(30, TimeUnit.SECONDS)
                            .writeTimeout(20, TimeUnit.SECONDS)
                            .readTimeout(20, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
    }
}
