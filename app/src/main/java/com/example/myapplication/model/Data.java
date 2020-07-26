package com.example.myapplication.model;

public class Data {
    private String id;
    private String kata;
    private String arti;
    private String gejala1;

    public Data(){

    }

    public Data(String id, String kata, String arti, String gejala1){
        this.id = id;
        this.kata = kata;
        this.arti = arti;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public String getGejala1() {
        return gejala1;
    }

    public void setGejala1(String gejala1) {
        this.gejala1 = gejala1;
    }

}
