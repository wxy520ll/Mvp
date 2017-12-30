package com.example.wxy.mvp.presenter.main.contact;

import com.example.wxy.mvp.base.IBaseView;

import io.reactivex.Observer;

/**
 * Created by wxy on 2017/12/30.
 */

public interface MainContact {

    public interface MainViewInterface extends IBaseView{

        public void showToast(String s);
    }
    public interface MainPresenterInterface{

        public Observer<String>requestBanner();
    }
}
