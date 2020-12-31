package com.example.kyle.decoratorpattern;


public class Toasted extends BreadDecorator {
    private Bread bread;

    public Toasted(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " Toasted";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 0;
    }
}
