package org.example;

public class Customer {

    private String name;
    private double wallet;
    Artwork artwork;
    Gallery ourGallery;

    public Customer(String name){
        this.name = name;
        this.wallet = 100.00;
    }
    
    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void addWallet(double updatedWallet){
        this.wallet += updatedWallet;
    }

    public void depletedWallet(double updatedWallet){
        this.wallet -= updatedWallet;
    }

    public void buyArtwork(Artwork artwork){
        if(this.wallet >= artwork.getPrice()) {
            this.wallet -= artwork.getPrice();
            ourGallery.removeFromCollection(artwork);
            ourGallery.increaseTill(artwork);
        }
    }

}
