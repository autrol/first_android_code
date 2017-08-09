package com.example.broadcastbestpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yangzhinian on 2017/8/9.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
