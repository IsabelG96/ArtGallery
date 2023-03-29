package org.example;

public class Artist {

    private String name;

    public Artist(String name){
        this.name = name;
    }
// Getter for artist name :)

public String getName(){
    return this.name;
}

public void setName(String newName){
    this.name = newName;
}
}