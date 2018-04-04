package com.tentcoo.baselibrary.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tentcoo.baselibrary.baseBean.Event;
import com.tentcoo.baselibrary.eventbus.EventManager;

import org.greenrobot.eventbus.Subscribe;

public class EventBusActivity extends BaseActivity {
    @Subscribe
    public void onEvent(Event mEvent){};
    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStart() {
        super.onStart();
        EventManager.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventManager.unregister(this);
    }
}
