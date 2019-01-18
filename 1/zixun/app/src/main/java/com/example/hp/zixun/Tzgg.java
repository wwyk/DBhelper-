package com.example.hp.zixun;

/**
 * Created by HP on 2018/9/19.
 */

public class Tzgg {
    private int id;
    private  String title;
    private  String data;
    private  String datetime;

    public Tzgg(int id, String title, String data, String datetime){
        this.id=id;
        this.title=title;
        this.data=data;
        this.datetime=datetime;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getData() {
        return data;
    }
    public String getDatetime() {
        return datetime;
    }
}
