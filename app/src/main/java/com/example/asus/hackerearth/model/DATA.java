package com.example.asus.hackerearth.model;

/**
 * Created by Infinity on 14-02-2018.
 */

public class DATA {
    String name;
    String msg;

    public DATA() {
    }

    public DATA(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
