package com.tentcoo.baselibrary.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tentcoo.baselibrary.base.BasePresenter;
import com.tentcoo.baselibrary.base.BaseView;
import com.tentcoo.baselibrary.baseBean.Event;
import com.tentcoo.baselibrary.eventbus.EventManager;

import org.greenrobot.eventbus.Subscribe;



import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by huangdiudiu on 2018/4/4.
 */

public abstract class EventBusBaseFragmentMVP<T extends BasePresenter> extends SupportFragment implements BaseView {

    protected T mPresenter;
    protected Activity mActivity;
    protected View mView;
    protected Context mContext;
    protected boolean isInited = false;

    @Override
    public void onAttach(Context context) {
        mActivity = (Activity) context;
        mContext = context;
        super.onAttach(context);
    }

    protected abstract T initPresenter();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(mView==null){
            mView = inflater.inflate(getLayoutId(), null);
        }
        ViewGroup parent = (ViewGroup) mView.getParent();
        if (parent != null) {
            parent.removeView(mView);
        }

        return mView;
    }
    @Subscribe
    public void onEvent(Event mEvent){};
    @Override
    public void onStart() {
        super.onStart();
        EventManager.register(this);
    }

    @Override
    public void onStop() {
        EventManager.unregister(this);
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (mPresenter != null)
            mPresenter.attachView(this);
        if (savedInstanceState == null) {
            if (!isHidden()) {
                isInited = true;
            }
        } else {
            if (!isSupportHidden()) {
                isInited = true;
            }
        }
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!isInited && !hidden) {
            isInited = true;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) mPresenter.detachView();
    }

    protected abstract int getLayoutId();

}
