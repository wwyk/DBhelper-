package com.example.hp.zixun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class libraryActivity extends AppCompatActivity {
    Intent q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_main);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tzzhongwenshujuku:
                q = new Intent(libraryActivity.this, zhongwenshujukuActivity.class);
                startActivity(q);
                break;
        }
    }
}
