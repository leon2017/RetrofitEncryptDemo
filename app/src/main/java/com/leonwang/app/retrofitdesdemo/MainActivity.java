package com.leonwang.app.retrofitdesdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.leonwang.app.retrofitdesdemo.entity.HomeEntity;
import com.leonwang.app.retrofitdesdemo.net.RetrofitHelper;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private TextView mTxt2;

    private String mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxt2 = (TextView) this.findViewById(R.id.txt2);
        initData();
    }

    private void initData() {
        //6.0权限请求
//        ActivityCompat.requestPermissions(MainActivity.this,mPermissionList, 100);
        /*RetrofitHelper.getDemoAPI()
                .getData()
                .flatMap(new Func1<HomeEntity, Observable<?>>() {

                    @Override
                    public Observable<?> call(HomeEntity homeEntity) {

                        mData = homeEntity.toString();

                        return Observable.just("onNext");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        mTxt2.setText(mData);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Log.e("TAG",throwable.getMessage());
                        Toast.makeText(MainActivity.this,throwable.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });*/

        RetrofitHelper.getDemoAPI()
                .getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<HomeEntity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
//                        Log.d("TAG",e.getMessage());
                    }

                    @Override
                    public void onNext(HomeEntity homeEntity) {
                        /*int status = homeEntity.getStatus();
                        switch (status) {
                            case 200:
                                mTxt2.setText(homeEntity.toString());
                                break;
                            case 300://token失效
                                break;
                        }*/
                        //TODO:这里可以处理返回的状态码
                        mTxt2.setText(homeEntity.toString());
                    }
                });
    }

  /*  //可以将一下代码加到你的MainActivity中，或者在任意一个需要调用分享功能的activity当中
    String[] mPermissionList = new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.READ_LOGS,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.SET_DEBUG_APP,
            Manifest.permission.SYSTEM_ALERT_WINDOW,
    };*/
}
