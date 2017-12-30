package com.example.wxy.mvp.presenter.main;

import android.widget.Toast;

import com.example.wxy.mvp.R;
import com.example.wxy.mvp.application.BaseApplication;
import com.example.wxy.mvp.base.BaseMvpActivity;
import com.example.wxy.mvp.di.component.ActivityComponent;
import com.example.wxy.mvp.di.component.ApplicationComponent;
import com.example.wxy.mvp.presenter.main.contact.MainContact;
import com.example.wxy.mvp.presenter.main.presenter.MainPresenter;

import javax.inject.Inject;

/**
 * Created by wxy on 2017/12/30.
 */

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContact.MainViewInterface{



    @Inject
    ApplicationComponent applicationComponent;

    @Override
    public void inject() {
        getActivityComponent().inject(this);
        mPresenter.attachView(this);
    }

    @Override
    public int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mPresenter.requestBanner();
    }

    @Override
    public void showToast(String s) {
        Toast.makeText(applicationComponent.getBaseApplication(), s, Toast.LENGTH_SHORT).show();
    }
}
