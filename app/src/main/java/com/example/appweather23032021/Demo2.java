package com.example.appweather23032021;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Demo2 {
    private List<Danhsach> danhsach;

    public Demo2(List<Danhsach> danhsach) {
        this.danhsach = danhsach;
    }

    public List<Danhsach> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(List<Danhsach> danhsach) {
        this.danhsach = danhsach;
    }
}
