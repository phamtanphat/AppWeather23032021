package com.example.appweather23032021;

import com.google.gson.annotations.SerializedName;

public class Main {
    /**
     * temp : 30
     */

    @SerializedName("temp")
    private int temp;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

}
