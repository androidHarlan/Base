package com.tentcoo.baselibrary.base;

/**
 * Created by huangdiudiu on 2018/4/4.
 */

public interface BasePresenter<T extends BaseView> {
    void attachView(T view);
    void detachView();
}
