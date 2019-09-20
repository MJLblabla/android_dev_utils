package com.afander.lib_util.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.pince.ut.AppUtil;
import com.testMaven.R;

/**
 * @author athoucai
 * @date 2018/12/27
 */
public class TestActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    @Override
    protected void onDestroy() {
        AppUtil.fixInputMethodManagerLeak(this);
        super.onDestroy();
    }
}
