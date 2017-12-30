package com.example.wxy.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.wxy.mvp.application.BaseApplication;
import com.example.wxy.mvp.di.component.ActivityComponent;
import com.example.wxy.mvp.di.component.DaggerActivityComponent;
import com.example.wxy.mvp.di.module.ActivityModule;

import javax.inject.Inject;

import static com.example.wxy.mvp.application.BaseApplication.application;

/**
 * Created by wxy on 2017/12/30.
 */

public abstract class BaseMvpActivity<T extends BasePresenter> extends BaseActivity {
    @Inject
    public T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        initView();
    }
    public abstract void inject();

    public abstract void initView();
    public ActivityComponent getActivityComponent(){
        return DaggerActivityComponent.builder()
                .applicationComponent(application.getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
