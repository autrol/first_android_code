package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
//        获取上一活动传过来的数据
//        Intent receiveIntent = getIntent();
//        String data = receiveIntent.getStringExtra("extra_data");
//        Log.d("SecondActivity", data);
//        返回数据给上一活动
        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.putExtra("data_return", "Hello FirstActivity");
                setResult(RESULT_OK, sendIntent);
                finish();
            }
        });
    }
}
