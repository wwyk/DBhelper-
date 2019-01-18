package com.example.hp.zixun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class personalActivity extends AppCompatActivity {
    Intent a, b, c, d, e, f, g, h, i, aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_main);
    }

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.xiugaimima:
                    f = new Intent(personalActivity.this, xiugaimimaActivity.class);
                    startActivity(f);
                    break;
                case R.id.gerenxinxi:
                    g = new Intent(personalActivity.this, gerenxinxiActivity.class);
                    startActivity(g);
                    break;
                case R.id.aboutus:
                    h = new Intent(personalActivity.this, aboutusActivity.class);
                    startActivity(h);
                    break;
                case R.id.tuichudenglu:
                    aa = new Intent(personalActivity.this, dengluActivity.class);
                    startActivity(aa);
                    break;

            }
//            Intent intent = new Intent(personalActivity.this, MainActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(intent);

    }
}
