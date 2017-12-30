package com.example.wxy.mvp.base;


import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by codeest on 2016/8/2.
 * 基于Rx的Presenter封装,控制订阅的生命周期
 */
public class RxPresenter<T extends IBaseView>implements BasePresenter<T>{


	protected CompositeDisposable mCompositeDisposable;
	public T mView;
	@Override
	public void attachView(T view) {
		this.mView=view;
	}

	@Override
	public void detachView() {
		this.mView = null;
		if (mCompositeDisposable != null) {
			mCompositeDisposable.clear();
		}
	}

	protected void addSubscribe(Disposable subscription) {
		if (mCompositeDisposable == null) {
			mCompositeDisposable = new CompositeDisposable();
		}
		mCompositeDisposable.add(subscription);
	}

}
