package com.example.appweather23032021;

public class Demo1 {
    private String monhoc;
    private String noihoc;
    private String website;
    private String fanpage;
    private String logo;

    public Demo1(String monhoc, String noihoc, String website, String fanpage, String logo) {
        this.monhoc = monhoc;
        this.noihoc = noihoc;
        this.website = website;
        this.fanpage = fanpage;
        this.logo = logo;
    }

    public String getMonHoc() {
        return monhoc;
    }

    public void setMonHoc(String monHoc) {
        this.monhoc = monHoc;
    }

    public String getNoihoc() {
        return noihoc;
    }

    public void setNoihoc(String noihoc) {
        this.noihoc = noihoc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFanpage() {
        return fanpage;
    }

    public void setFanpage(String fanpage) {
        this.fanpage = fanpage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
