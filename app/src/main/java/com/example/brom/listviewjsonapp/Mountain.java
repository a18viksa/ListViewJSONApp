package com.example.brom.listviewjsonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Mountain {


    private String name;
    private String location;
    private int height;

    public Mountain(String inName, String inLocation, int inHeight) {
        name = inName;
        location = inLocation;
        height = inHeight;

    }

    public Mountain(String inName) {
        name = inName;
        location = "";
        height = -1;
    }

    @Override
    public String toString() {
        return name;
    }

    public String info() {
        String str = name;
        str+=" is located in ";
        str+=location;
        str+=" and has a height of ";
        str+=Integer.toString(height);
        str+="m.";
        return str;

    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

}
