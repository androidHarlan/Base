package com.tentcoo.baselibrary.activity;

import android.os.Bundle;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

/**
 * Created by huangdiudiu on 2018/4/4.
 */

public abstract  class BaseActivity extends RxAppCompatActivity{
    private Bundle state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        state = savedInstanceState;
    }
    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }




}
