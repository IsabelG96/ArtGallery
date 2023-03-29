package org.example;

import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> collection;

    public Gallery(String name){
        this.name = name;
        this.till = 0.00;
        this.collection = new ArrayList<>();
    }
// Getters and Setters
public String getName(){
    return this.name;
}

public double getTill(){
    return this.till;
}

//public ArrayList<Artwork> getCollection (){
//        return this.collection;
//}

public int countCollection(){
        return collection.size();
}

// Increase Till
public void increaseTill(Artwork price){
    this.till += price.getPrice();
}
// Decrease Till
public void decreaseTill(Artwork price){
    this.till -= price.getPrice();
}

public void addToCollection(Artwork piece){
    this.collection.add(piece);
}

public void removeFromCollection(Artwork piece){
    this.collection.remove(piece);
}


}
