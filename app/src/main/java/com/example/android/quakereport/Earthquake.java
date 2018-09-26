package com.example.android.quakereport;

public class Earthquake {

    private double mMag;
    private String mCity;
    private String mDate;

    public Earthquake(double mag, String city, String date) {
        mMag = mag;
        mCity = city;
        mDate = date;
    }

    public double getMag() {
        return mMag;
    }

    public String getCity() {
        return mCity;
    }

    public String getDate() {
        return mDate;
    }
}
