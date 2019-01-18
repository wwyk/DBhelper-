package com.example.hp.zixun.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hp.zixun.R;

public class jiaowuActivity extends AppCompatActivity {
    Intent a, b, c, d, e, f, g, h, i ,q,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiaowu_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tzzhongwenshujuku:
                q = new Intent(jiaowuActivity.this, zhongwenshujukuActivity.class);
                startActivity(q);
                break;
            case R.id.gerenzhongxin:
                a=new Intent(jiaowuActivity.this,dengluActivity.class);
                startActivity(a);
                break;
            case R.id.shouye:
                i=new Intent(jiaowuActivity.this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.jiaowu:
                q=new Intent(jiaowuActivity.this,jiaowuActivity.class);
                startActivity(q);
                break;
            case R.id.jiaowuguanli:
                r=new Intent(jiaowuActivity.this,jiaowuguanliActivity.class);
                startActivity(r);
                break;
        }
    }
}
