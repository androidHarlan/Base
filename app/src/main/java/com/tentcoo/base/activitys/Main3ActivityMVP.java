package com.tentcoo.base.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.tentcoo.base.R;
import com.tentcoo.base.presenter.MainPresenter;
import com.tentcoo.base.view.MainView;
import com.tentcoo.baselibrary.activity.BaseActivityMVP;

public class Main3ActivityMVP extends BaseActivityMVP<MainPresenter> implements MainView.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_mvp);
        mPresenter=new MainPresenter(this);
        mPresenter.attachView(this);
        mPresenter.getnetworkData();
    }



    @Override
    public void toastMsg(String msg) {

    }

    @Override
    public void showView() {
        Toast.makeText(this,"跑到这里了",Toast.LENGTH_LONG).show();
    }
}
