package com.example.myapplication.model;

public class Data {
    private String id;
    private String kata;
    private String arti;
    private String gejala1;
    private String penyakit;
    private String deskripsi;
    private String hasil;
    private String tanggal;
    private String image;

    public Data(){

    }

    public Data(String id, String kata, String arti, String penyakit, String deskripsi, String hasil, String tanggal, String image){
        this.id = id;
        this.kata = kata;
        this.arti = arti;
        this.penyakit = penyakit;
        this.deskripsi = deskripsi;
        this.hasil = hasil;
        this.tanggal = tanggal;
        this.image = image;
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

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
