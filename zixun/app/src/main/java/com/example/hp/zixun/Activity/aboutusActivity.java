package com.example.hp.zixun.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hp.zixun.R;

public class aboutusActivity extends AppCompatActivity {
    Intent k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus_main);
    }
    public void onClick(View v) {
     switch (v.getId()) {
        case R.id.fanhuigerenzhongxin:
            k = new Intent(aboutusActivity.this, personalActivity.class);
                startActivity(k);
                    break;
        }
    }
}
