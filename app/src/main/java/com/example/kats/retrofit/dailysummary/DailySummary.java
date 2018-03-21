package com.example.kats.retrofit.dailysummary;

/**
 * Created by tanya on 21/3/18.
 */

public class DailySummary {

    private String thunder;

    private Date date;

    private String maxtempm;
    private String mintempm;

    public String getMaxtempm() {
        return maxtempm;
    }

    public String getMintempm() {
        return mintempm;
    }

    public String getThunder() {
        return thunder;
    }

    public void setThunder(String thunder) {
        this.thunder = thunder;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "DailySummary{" +
                "thunder='" + thunder + '\'' +
                '}';
    }
}
