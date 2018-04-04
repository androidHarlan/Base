package com.tentcoo.base.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tentcoo.base.R;
import com.tentcoo.baselibrary.baseBean.Event;
import com.tentcoo.baselibrary.eventbus.EventManager;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EventManager.post(new Event());
    }
}
