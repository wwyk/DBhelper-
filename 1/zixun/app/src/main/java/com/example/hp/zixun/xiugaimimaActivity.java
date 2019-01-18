package com.example.hp.zixun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class xiugaimimaActivity extends AppCompatActivity {
    Intent a, b, c, d, e, f, g, h, i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiugaimima_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.querenxiugai:
                i = new Intent(xiugaimimaActivity.this, personalActivity.class);
                startActivity(i);
                break;
            case R.id.fanhuigerenzhongxin:
                i = new Intent(xiugaimimaActivity.this, personalActivity.class);
                startActivity(i);
                break;

        }
    }
}
