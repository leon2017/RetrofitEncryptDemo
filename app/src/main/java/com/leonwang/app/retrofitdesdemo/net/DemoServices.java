package com.leonwang.app.retrofitdesdemo.net;

import com.leonwang.app.retrofitdesdemo.entity.HomeEntity;

import retrofit2.http.GET;
import rx.Observable;

/**
 * 当前类注释：数据请求接口
 * Author :LeonWang
 * Created  2016/10/11.11:11
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public interface DemoServices {

    //58362--上海浦东

    @GET("t/new_mobile_json/58362.json")
    Observable<HomeEntity> getData();
}
