package com.driver;

public class movie {
    private String name;
    private int durationInMinutes;
    private double imbdRating;

    public movie() {
    }

    public movie(String name,int durationInMinutes,double imbdRating) {
        this.name = name;
        this.durationInMinutes=durationInMinutes;
        this.imbdRating=imbdRating;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getImbdRating() {
        return imbdRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setImbdRating(double imbdRating) {
        this.imbdRating = imbdRating;
    }
}