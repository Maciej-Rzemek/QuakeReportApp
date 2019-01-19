package com.example.android.quakereport;

public class Earthquake {
    private String magnitude;
    private String location;
    private long date;

    public Earthquake(String magnitude, String location, long date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    //Getters
    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getDate() {
        return date;
    }

    //Setters
    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
