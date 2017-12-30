package com.example.wxy.mvp.application;

import android.app.Application;

import com.example.wxy.mvp.di.component.ApplicationComponent;
import com.example.wxy.mvp.di.component.DaggerApplicationComponent;
import com.example.wxy.mvp.di.module.ApplicationModule;

import org.eclipse.jdt.core.IField;

import javax.inject.Inject;

/**
 * Created by wxy on 2017/12/30.
 */

public class BaseApplication extends Application {

    public ApplicationComponent applicationComponent;


    public static BaseApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
        initDagger();
    }

    private void initDagger() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        if (applicationComponent == null) {
            initDagger();
        }
        return applicationComponent;
    }
}
