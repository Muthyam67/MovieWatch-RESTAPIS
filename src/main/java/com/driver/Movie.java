package com.driver;

public class Movie {
    private String name;
    private int durationInMinutes;
    private double imdbRating;

    public Movie() {
    }

    public Movie(String name,int durationInMinutes,double imbdRating) {
        this.name = name;
        this.durationInMinutes=durationInMinutes;
        this.imdbRating=imbdRating;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getImbdRating() {
        return imdbRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setImbdRating(double imbdRating) {
        this.imdbRating = imbdRating;
    }
}
