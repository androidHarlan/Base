package com.tentcoo.base.activitys;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.tentcoo.base.R;
import com.tentcoo.baselibrary.activity.EventBusActivity;
import com.tentcoo.baselibrary.baseBean.Event;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class MainActivity extends EventBusActivity {
    TextView textView;
    Button testmvp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.test);
        testmvp=findViewById(R.id.testmvp);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        testmvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main3ActivityMVP.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onEvent(Event mEvent) {
        Toast.makeText(this,"跑到这里了",Toast.LENGTH_LONG).show();
        Log.e("backinfo","跑到这里了");
        super.onEvent(mEvent);
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event(Event mEvent){
        Log.e("backinfo","跑到这里了");
    }
}
