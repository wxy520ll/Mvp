package com.example.wxy.mvp.di.component;

import com.example.wxy.mvp.base.BaseMvpActivity;
import com.example.wxy.mvp.di.module.ActivityModule;
import com.example.wxy.mvp.di.module.ApplicationModule;
import com.example.wxy.mvp.di.scope.ActivityScope;
import com.example.wxy.mvp.presenter.main.MainActivity;

import dagger.Component;


/**
 * Created by wxy on 2017/9/4.
 */

@ActivityScope
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
	//Exposed to sub-graphs.
	BaseMvpActivity getActivity();

	void inject(MainActivity mainActivity);
}

