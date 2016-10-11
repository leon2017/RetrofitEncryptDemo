package com.leonwang.app.retrofitdesdemo.net;

import android.util.Log;

import com.google.gson.TypeAdapter;
import com.leonwang.app.retrofitdesdemo.utils.DecodeUtil;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * 当前类注释：自定义ResponseBodyConverter
 * Author :LeonWang
 * Created  2016/10/11.11:33
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

final class CustomResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final TypeAdapter<T> adapter;
    private String mResult;

    CustomResponseBodyConverter(TypeAdapter<T> adapter) {
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        try {
            //解密
            String response = value.string();
            Log.d("TAG", "================" + response);
            try {
                mResult = DecodeUtil.decodeResponse(response);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Log.d("TAG", "--------------------------" + mResult);
            return adapter.fromJson(mResult);
        } finally {
            value.close();
        }
    }

}
