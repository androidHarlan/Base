package com.tentcoo.baselibrary.activity;

import android.app.Activity;
import android.os.Bundle;

import com.tentcoo.baselibrary.base.BasePresenter;
import com.tentcoo.baselibrary.base.BaseView;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;



/**
 * Created by huangdiudiu on 2018/4/4.
 */

public abstract class BaseActivityMVP<T extends BasePresenter> extends RxAppCompatActivity implements BaseView {
    private Bundle state;
    protected T mPresenter;
    protected Activity mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        state = savedInstanceState;
        if (mPresenter != null)
            mPresenter.attachView(this);
    }
    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

}
