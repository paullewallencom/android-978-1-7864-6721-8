package com.example.kyle.strategypattern;


public class BasicPrice {
    private static BasicPrice basicPrice = new BasicPrice();
    private float price;

    // Prevent more than one copy
    private BasicPrice() {
    }

    // Return only instance
    public static BasicPrice getInstance() {
        return basicPrice;
    }

    protected float getPrice() {
        return price;
    }

    protected void setPrice(float v) {
        price = v;
    }
}
