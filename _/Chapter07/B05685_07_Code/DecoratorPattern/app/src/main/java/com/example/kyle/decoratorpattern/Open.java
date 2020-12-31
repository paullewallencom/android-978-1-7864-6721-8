package com.example.kyle.decoratorpattern;


public class Open extends BreadDecorator {
    private Bread bread;

    public Open(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " Open";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() / 2;
    }
}
