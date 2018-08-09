package com.example.zhouxicai.androidlearn.GridView;

/**
 * Created by zhouxicai on 2018/8/6.
 */

public class gridViewData {
    private int id;
    private String iName;

    public gridViewData(int id, String iName) {
        this.id = id;
        this.iName = iName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }
}
