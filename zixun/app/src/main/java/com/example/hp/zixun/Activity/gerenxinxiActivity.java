package com.example.hp.zixun.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hp.zixun.R;

public class gerenxinxiActivity extends AppCompatActivity {
    Intent j;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerenxinxi_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.fanhuigerenzhongxin:
                j = new Intent(gerenxinxiActivity.this, personalActivity.class);
                startActivity(j);
                break;
        }
    }
}
