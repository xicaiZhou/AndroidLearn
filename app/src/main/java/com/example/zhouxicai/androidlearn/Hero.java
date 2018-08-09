package com.example.zhouxicai.androidlearn;

/**
 * Created by zhouxicai on 2018/8/8.
 */

public class Hero {
    private int hIcon;
    private String hName;

    public int gethIcon() {
        return hIcon;
    }

    public void sethIcon(int hIcon) {
        this.hIcon = hIcon;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public Hero(int hIcon, String hName) {
        this.hIcon = hIcon;
        this.hName = hName;
    }
}
