package org.example;

public class Artwork {

    private String title;
    private double price;
    private String artist;


    public Artwork(String title, double price){

        this.title = title;
        this.price = price;
        }

    public void getArtist(Artist artist){

        this.artist = artist.getName();

    }



}
