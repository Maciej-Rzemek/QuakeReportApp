package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long date;
    private String url;

    public Earthquake(double magnitude, String location, long date, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
        this.url = url;
    }

    //Getters
    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    //Setters
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
