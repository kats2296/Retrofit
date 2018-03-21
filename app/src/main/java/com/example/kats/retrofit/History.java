package com.example.kats.retrofit;

import com.example.kats.retrofit.dailysummary.DailySummary;

import java.util.ArrayList;

/**
 * Created by tanya on 21/3/18.
 */

public class History {

    private Date date;

    private ArrayList<DailySummary> dailysummary;

    public ArrayList<DailySummary> getDailySummary() {
        return dailysummary;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "History{" +
                "date=" + date +
                ", dailySummary=" + dailysummary +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDailySummary(ArrayList<DailySummary> dailySummary) {
        this.dailysummary = dailySummary;
    }
}
