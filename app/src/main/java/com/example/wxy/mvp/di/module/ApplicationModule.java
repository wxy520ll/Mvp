package com.example.wxy.mvp.di.module;

import com.example.wxy.mvp.application.BaseApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * Created by wxy on 2017/9/4.
 */
@Module
public class ApplicationModule {

	private BaseApplication application;

	public ApplicationModule(BaseApplication baseApplication) {
		this.application = baseApplication;
	}

	@Provides
	@Singleton
	public BaseApplication provideApplicationContext() {
		return application;
	}




}

