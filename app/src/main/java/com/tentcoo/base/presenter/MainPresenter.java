package com.tentcoo.base.presenter;

import android.content.Context;

import com.tentcoo.base.view.MainView;
import com.tentcoo.baselibrary.base.BaseRxPresenter;

/**
 * Created by huangdiudiu on 2018/4/4.
 */

public class MainPresenter extends BaseRxPresenter<MainView.View> implements MainView.Presenter{
    private Context context;
    public MainPresenter(Context context) {
        this.context = context;
    }
    @Override
    public void getnetworkData() {
        mView.showView();
    }


}
