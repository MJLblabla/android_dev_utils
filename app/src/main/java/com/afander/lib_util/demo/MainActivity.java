package com.afander.lib_util.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.pince.ut.AppCache;
import com.pince.ut.AppUtil;
import com.pince.ut.ScreenUtil;
import com.testMaven.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCache.setContext(getApplication());
        setContentView(R.layout.activity_main);
        System.out.println("height1:" + ScreenUtil.getDisplayMetrics());
        System.out.println("height2:" + ScreenUtil.getRealDisplayMetrics());

        System.out.println("navibar: setp1");
        System.out.println("navibar:" + ScreenUtil.getNavigationBarHeight(this));
        System.out.println("navibar: setp2");
        System.out.println("navibar:" + ScreenUtil.getNavigationBarHeight());
        System.out.println("navibar: setp3");

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestActivity2.class));
            }
        });
    }


    @Override
    protected void onDestroy() {
        AppUtil.fixInputMethodManagerLeak(this);
        super.onDestroy();
    }
}
