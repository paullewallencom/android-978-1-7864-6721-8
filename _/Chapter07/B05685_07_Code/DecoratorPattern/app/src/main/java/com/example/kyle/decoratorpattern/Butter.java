package com.example.kyle.decoratorpattern;


public class Butter extends BreadDecorator {
    private Bread bread;

    public Butter(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " Butter";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 50;
    }
}
