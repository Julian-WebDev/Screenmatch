package com.aluracursos.screenmatch.models;

public class model_movie {
    //Declare the attributes of the object Movie
    private String name;
    private int releaseDate;
    private int duration;
    private boolean available;


    //Getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    //Access modifiers
    public double rating; //Private makes the variable undetectable to the common user
    private int totalRatings;

    public int getTotalRatings(){
        return totalRatings;
    }

    public void showMovie(){
        System.out.println("The name of the movie is: " + name);
        System.out.println("Release date: " + releaseDate);
        System.out.println("Duration: " + duration);
    }


    public void rating(double rate){
        rating += rate;
        rating = rating + rate;
        totalRatings ++;
    }

    public double average(){
        return rating / totalRatings;
    }
}
