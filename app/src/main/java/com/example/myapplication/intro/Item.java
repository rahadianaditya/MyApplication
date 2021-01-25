package com.example.myapplication.intro;

public class Item {

    String Description;
    int ScreenImg;

    public Item(String description, int screenImg) {
        Description = description;
        ScreenImg = screenImg;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

}
