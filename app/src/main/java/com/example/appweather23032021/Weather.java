package com.example.appweather23032021;

import com.google.gson.annotations.SerializedName;

public class Weather {
    /**
     * main : Rain
     * icon : 10n
     */

    @SerializedName("main")
    private String main;
    @SerializedName("icon")
    private String icon;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
