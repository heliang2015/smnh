package com.hl.ssnh.ui.detail;

public class UserInfo {
    private String name;
    private int age;
    private long time;
    private boolean isCheck;
    private String url;
    private Boolean isTest;


    public UserInfo(String name, int age, long time, boolean isCheck) {
        this.name = name;
        this.age = age;
        this.time = time;
        this.isCheck = isCheck;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
