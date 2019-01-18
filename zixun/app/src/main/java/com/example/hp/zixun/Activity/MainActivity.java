package com.example.hp.zixun.Activity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.hp.zixun.Adapter;
import com.example.hp.zixun.DBHelper;
import com.example.hp.zixun.R;
import com.example.hp.zixun.model.Tzgg;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        Intent a, b, c, d, e, f, g, h, i ,q,r;

    private List<Tzgg> tzggList = new ArrayList<>();
    private Adapter adapter;
//    private Adapter adapter01;

    private Tzgg tzgg;
//    private Tzgg cfbg;
    private int id;
    private String title;
    private String data;
    private String datetime;

    DBHelper dbHelper;
    SQLiteDatabase sqLiteDatabase;

    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        scrollView = (ScrollView) findViewById(R.id.main_content);

        ListView tongzhigonggao = (ListView)findViewById(R.id.tzgg_listView);
//        ListView chufangbaogao = (ListView)findViewById(R.id.cfbg_listView);

        dbHelper = new DBHelper(MainActivity.this);
        sqLiteDatabase = dbHelper.getReadableDatabase();
        //初始化
        adapter = new Adapter(MainActivity.this,R.layout.item_main,tzggList);
//        adapter01 = new Adapter(MainActivity.this,R.layout.item_main,cfbgList);
        tongzhigonggao.setAdapter(adapter);
        tongzhigonggao.setTextFilterEnabled(true);
//        chufangbaogao.setAdapter(adapter01);
//        chufangbaogao.setTextFilterEnabled(true);
        getTzgg();
//        getCbbg();

        tongzhigonggao.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tzgg tzgg = tzggList.get(position);
                MainActivity.this.id = tzgg.getId();
                title = tzgg.getTitle();
                data = tzgg.getData();
                datetime = tzgg.getDatetime();
                Intent intent = new Intent(MainActivity.this,tongzhigaonggaoActivity.class);
                intent.putExtra("id", MainActivity.this.id);
                intent.putExtra("title", title);
                intent.putExtra("data", data);
                intent.putExtra("datetime", datetime);
                startActivity(intent);
                intent.putExtra("position", position);
            }
        });
//        chufangbaogao.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Cfbg cfbg = cfbgList.get(position);
//                MainActivity.this.id = cfbg.getId();
//                title = cfbg.getTitle();
//                data = cfbg.getData();
//                datetime = cfbg.getDatetime();
//                Intent intent = new Intent(MainActivity.this,chufangbaogaoActivity.class);
//                intent.putExtra("id", MainActivity.this.id);
//                intent.putExtra("title", title);
//                intent.putExtra("data", data);
//                intent.putExtra("datetime", datetime);
//                startActivity(intent);
//                intent.putExtra("position", position);
//            }
//        });



    }
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.gerenzhongxin:
                    a=new Intent(MainActivity.this,dengluActivity.class);
                    startActivity(a);
                    break;
                case R.id.technology:
                    b=new Intent(MainActivity.this,technologyActivity.class);
                    startActivity(b);
                    break;
                case R.id.news:
                    c=new Intent(MainActivity.this,newsActivity.class);
                    startActivity(c);
                    break;
                case R.id.college:
                   d=new Intent(MainActivity.this,collegeActivity.class);
                    startActivity(d);
                    break;
                case R.id.teacher:
                    e=new Intent(MainActivity.this,teacherActivity.class);
                    startActivity(e);
                    break;
//                case R.id.shouye:
//                    i=new Intent(MainActivity.this,MainActivity.class);
//                    startActivity(i);
//                    break;
//                case R.id.jiaowu:
//                    q=new Intent(MainActivity.this,jiaowuActivity.class);
//                    startActivity(q);
//                    break;
//                case R.id.jiaowuguanli:
//                    r=new Intent(MainActivity.this,jiaowuguanliActivity.class);
//                    startActivity(r);
//                    break;
            }
        }

    public void getTzgg(){
            tzggList.clear();
            Cursor cursor = null;
            cursor = dbHelper.query();//查询
           if(cursor.moveToFirst()){
               do{
                   int id=cursor.getInt(cursor.getColumnIndex("_id"));
                   title = cursor.getString(cursor.getColumnIndex("title"));
                   data = cursor.getString(cursor.getColumnIndex("data"));
                   datetime = cursor.getString(cursor.getColumnIndex("datetime"));
                   tzgg = new Tzgg(id,title,data,datetime);
                   tzggList.add(tzgg);
               }while (cursor.moveToNext());
           }
            cursor.close();
            adapter.notifyDataSetChanged();
        }



//    private List<Cfbg> cfbgList = new ArrayList<>();
//
//    public void getCbbg(){
//        cfbgList.clear();
//        Cursor cursor = null;
//        cursor = dbHelper.query();//查询
//        if(cursor.moveToFirst()){
//            do{
//                int id=cursor.getInt(cursor.getColumnIndex("_id"));
//                title = cursor.getString(cursor.getColumnIndex("title"));
//                data = cursor.getString(cursor.getColumnIndex("data"));
//                datetime = cursor.getString(cursor.getColumnIndex("datetime"));
//                cfbg = new Cfbg(id,title,data,datetime);
//                cfbgList.add(cfbg);
//            }while (cursor.moveToNext());
//        }
//        cursor.close();
//        adapter.notifyDataSetChanged();
//    }

}
