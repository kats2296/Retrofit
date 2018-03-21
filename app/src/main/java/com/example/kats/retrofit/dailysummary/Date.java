package com.example.kats.retrofit.dailysummary;

/**
 * Created by tanya on 21/3/18.
 */

public class Date {

       private String pretty;
    private String year;
    private String mon;
    private String hour;
    private String min;
    private String tzname;

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getTzname() {
        return tzname;
    }

    public void setTzname(String tzname) {
        this.tzname = tzname;
    }

    public Date(String pretty, String year, String mon, String hour, String min, String tzname) {

        this.pretty = pretty;
        this.year = year;
        this.mon = mon;
        this.hour = hour;
        this.min = min;
        this.tzname = tzname;
    }
}
