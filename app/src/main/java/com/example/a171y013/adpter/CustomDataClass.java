package com.example.a171y013.adpter;


import java.util.Random;

/**
 * Created by 171Y013 on 2018/07/06.
 */

public class CustomDataClass {
    private long id = 0;

    private int imageId = 0;

    private String mainString = "";

    private String subString = "";

    private String description = "";


    // コンストラクタ -- このクラスがインスタンス化された時に実行されます
    public CustomDataClass(int imageid, String main, String sub, String desc){
        this.id = (new Random()).nextLong();
        this.imageId = imageid;
        this.mainString = main;
        this.subString = sub;
        this.description = desc;
    }


    // ここからgetter, setter
    public long getId(){
        return id;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getMainString() {
        return mainString;
    }

    public void setMainString(String mainString) {
        this.mainString = mainString;
    }

    public String getSubString() {
        return subString;
    }

    public void setSubString(String subString) {
        this.subString = subString;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
