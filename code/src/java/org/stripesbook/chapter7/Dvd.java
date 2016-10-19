package org.stripesbook.chapter7;

public class Dvd {
    
    private String title;    
    private double cost;
    private String genre;

    //Important: Stripes requires a no-arg constructor.
    public Dvd() {
    }

    public Dvd(String title, double cost, String genre) {
        this.title = title;
        this.cost = cost;
        this.genre = genre;
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
