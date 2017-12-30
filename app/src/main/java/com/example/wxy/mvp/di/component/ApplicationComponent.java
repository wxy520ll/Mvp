package com.example.wxy.mvp.di.component;

import android.app.Application;

import com.example.wxy.mvp.application.BaseApplication;
import com.example.wxy.mvp.di.module.ActivityModule;
import com.example.wxy.mvp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wxy on 2017/9/4.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {



	BaseApplication getBaseApplication();
	void inject(Application application);
}
