package com.example.zhouxicai.androidlearn;

/**
 * Created by zhouxicai on 2018/8/2.
 */

public class Data {

    private String imgUrl;
    private String content;

    public Data(){

    }

    public Data(String imgUrl, String content) {
        this.imgUrl = imgUrl;
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
