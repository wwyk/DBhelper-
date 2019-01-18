package com.example.hp.zixun;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Intent a, b, c, d, e, f, g, h, i ,q,r;
    private List<Tzgg> tzggList = new ArrayList<>();
    private TzggAdapter adapter;

    private Tzgg tzgg;
    private int id;
    private String title;
    private String data;
    private String datetime;

    DBHelper dbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        ListView tongzhigonggao = (ListView)findViewById(R.id.tzgg_listView);

        dbHelper = new DBHelper(MainActivity.this);
        sqLiteDatabase = dbHelper.getReadableDatabase();
        //初始化
        adapter = new TzggAdapter(MainActivity.this,R.layout.item_main,tzggList);
        tongzhigonggao.setAdapter(adapter);
        tongzhigonggao.setTextFilterEnabled(true);
        getTzgg();

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
                case R.id.shouye:
                    i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                    break;
                case R.id.library:
                    q=new Intent(MainActivity.this,libraryActivity.class);
                    startActivity(q);
                    break;
                case R.id.jiaowuguanli:
                    r=new Intent(MainActivity.this,jiaowuguanliActivity.class);
                    startActivity(r);
                    break;
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

}
