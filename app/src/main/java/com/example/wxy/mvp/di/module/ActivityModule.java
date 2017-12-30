package com.example.wxy.mvp.di.module;

import com.example.wxy.mvp.base.BaseMvpActivity;
import com.example.wxy.mvp.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;


/**
 * Created by wxy on 2017/9/4.
 */

@Module
public class ActivityModule {

	private BaseMvpActivity mActivity;

	public ActivityModule(BaseMvpActivity activity) {
		this.mActivity = activity;
	}
	/**
	 * Expose the activity to dependents in the graph.
	 */
	@Provides
	@ActivityScope
	BaseMvpActivity provideBaseMvpActivity() {
		return this.mActivity;
	}


}
