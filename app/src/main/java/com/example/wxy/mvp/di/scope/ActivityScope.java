package com.example.wxy.mvp.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by wxy on 16/8/7.
 */

@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}
