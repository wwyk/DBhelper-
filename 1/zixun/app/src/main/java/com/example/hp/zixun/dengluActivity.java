package com.example.hp.zixun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class dengluActivity extends AppCompatActivity {
    Intent l,m,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denglu_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.denglu:
                l = new Intent(dengluActivity.this, personalActivity.class);
                startActivity(l);
                break;
            case R.id.zhucexinyonghu:
                m = new Intent(dengluActivity.this, zhuceActivity.class);
                startActivity(m);
                break;
            case R.id.fanhuihome:
                p = new Intent(dengluActivity.this, MainActivity.class);
                startActivity(p);
                break;
        }
    }
}
