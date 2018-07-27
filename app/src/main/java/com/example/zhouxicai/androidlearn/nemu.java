package com.example.zhouxicai.androidlearn;

/**
 * Created by zhouxicai on 2018/7/25.
 */

public class nemu {
    private String name;
    private String imageURL;
    private String time;
    private String content;

    public nemu() {

    }
    public nemu(String name, String imageURL, String time, String content){
        this.name = name;
        this.imageURL = imageURL;
        this.time = time;
        this.content = content;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
