package com.example.hp.zixun;

/**
 * Created by HP on 2018/9/19.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper
{
    //数据库名称
    private static final String DB_NAME="tongzhi.db";
    //表名称
    private static final String TBL_NAME="tongzhigonggao";
    //创建表SQL语句
    private static final String CREATE_TBL=" create table "
            +" tongzhigonggao(_id integer primary key autoincrement,title text,data text,datetime text)";
    //SQLiteDatabase实例
    private SQLiteDatabase db;

    /*
     * 构造方法
     */
    DBHelper(Context c){
        super(c,DB_NAME,null,2);
    };
    /*
     * 创建表
     * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
     */
    public void onCreate(SQLiteDatabase db)
    {
        this.db=db;
        db.execSQL(CREATE_TBL);
    }
    /*
     * 插入方法
     */
    public void insert(ContentValues values)
    {
        //获得SQLiteDatabase实例
        SQLiteDatabase db=getWritableDatabase();
        //插入
        db.insert(TBL_NAME, null, values);
        //关闭
        db.close();
    }
    /*
     * 查询方法
     */
    public Cursor query()
    {
        //获得SQLiteDatabase实例
        SQLiteDatabase db=getWritableDatabase();
        //查询获得Cursor
        Cursor c=db.query(TBL_NAME, null, null, null, null, null, null);
        return c;
    }
    /*
     * 删除方法
     */
    public void del(int id)
    {
        if(db==null)
        {
            //获得SQLiteDatabase实例
            db=getWritableDatabase();
        }
        //执行删除
        db.delete(TBL_NAME, "_id=?", new String[]{String.valueOf(id)});
    }
    /*
     * 关闭数据库
     */
    public void colse()
    {
        if(db!=null)
        {
            db.close();
        }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub

    }


}
