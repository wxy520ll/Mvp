package com.example.wxy.mvp.presenter.main.repertory;

import javax.inject.Inject;

/**
 * Created by wxy on 2017/12/30.
 */

public class MainRepertory {

    @Inject
    public MainRepertory(){

    }

    public String getData(){
        return "hello dagger2";
    }
}
