package com.example.hp.zixun;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class jiaowuguanliActivity extends AppCompatActivity {
    Intent q,r,s,t,u,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiaowuguanli_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tzjidianchaxun:
                z = new Intent(jiaowuguanliActivity.this, jidianchaxunActivity.class);
                startActivity(z);
                break;
            case R.id.tzjieyue:
                r = new Intent(jiaowuguanliActivity.this, jieyueActivity.class);
                startActivity(r);
                break;
            case R.id.tzurp:
                s = new Intent(jiaowuguanliActivity.this, urpActivity.class);
                startActivity(s);
                break;
            case R.id.tzeol:
                t = new Intent(jiaowuguanliActivity.this, eolActivity.class);
                startActivity(t);
                break;
            case R.id.tzbaoxiao:
                u = new Intent(jiaowuguanliActivity.this, zhongwenshujukuActivity.class);
                startActivity(u);
                break;

        }

    }

}
