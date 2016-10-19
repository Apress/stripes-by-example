package org.stripesbook.chapter6;

public class Dvd {
    
    private String title;    
    private double cost;
    private String genre;

    //Important: Stripes requires a no-arg constructor.
    //Inserted by the compilier by default if no other constructors are provided.
    public Dvd() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
