package com.example.appweather23032021;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Danhsach {
    private String khoahoc;

    public Danhsach(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

}