package com.example.hp.zixun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class zhuceActivity extends AppCompatActivity {
    Intent n,o,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuce_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dianwodenglu:
                n = new Intent(zhuceActivity.this, dengluActivity.class);
                startActivity(n);
                break;
            case R.id.fanhuidenglu:
                o = new Intent(zhuceActivity.this, dengluActivity.class);
                startActivity(o);
                break;
            case R.id.denglu:
                p = new Intent(zhuceActivity.this, dengluActivity.class);
                startActivity(p);
                break;
        }
    }
}
