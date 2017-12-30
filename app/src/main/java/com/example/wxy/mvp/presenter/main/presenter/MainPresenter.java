package com.example.wxy.mvp.presenter.main.presenter;

import com.example.wxy.mvp.base.RxPresenter;
import com.example.wxy.mvp.presenter.main.contact.MainContact;
import com.example.wxy.mvp.presenter.main.repertory.MainRepertory;

import javax.inject.Inject;

import io.reactivex.Observer;

/**
 * Created by wxy on 2017/12/30.
 */

public class MainPresenter extends RxPresenter<MainContact.MainViewInterface>implements MainContact.MainPresenterInterface {


    @Inject
    MainRepertory mainRepertory;

    @Inject
    public MainPresenter(){
    }
    @Override
    public Observer<String> requestBanner() {

        mView.showToast(mainRepertory.getData());
        return null;
    }
}
