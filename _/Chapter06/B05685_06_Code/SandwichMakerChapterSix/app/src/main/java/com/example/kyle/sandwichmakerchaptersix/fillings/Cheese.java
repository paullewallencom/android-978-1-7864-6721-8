package com.example.kyle.sandwichmakerchaptersix.fillings;

/**
 * Created by kyle on 07/07/2016.
 */
public abstract class Cheese implements Filling {
    private String name;
    private int image;
    private String description;
    private int kcal;
    private boolean vegetarian;
    private int price;


    public Cheese() {
    }

    public abstract String getName();

    public abstract int getImage();

    public abstract int getKcal();

    public abstract boolean getVeg();

    public abstract int getPrice();
}
