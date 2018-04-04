package com.tentcoo.baselibrary.activity;

import android.app.Activity;
import android.os.Bundle;

import com.tentcoo.baselibrary.base.BasePresenter;
import com.tentcoo.baselibrary.base.BaseView;
import com.tentcoo.baselibrary.baseBean.Event;
import com.tentcoo.baselibrary.eventbus.EventManager;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import org.greenrobot.eventbus.Subscribe;


/**
 * Created by huangdiudiu on 2018/4/4.
 */

public abstract class EventBusBaseActivityMVP<T extends BasePresenter> extends RxAppCompatActivity implements BaseView {
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
    @Subscribe
    public void onEvent(Event mEvent){};
    @Override
    protected void onDestroy() {
        EventManager.unregister(this);
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        EventManager.register(this);
        super.onStart();
    }
}
