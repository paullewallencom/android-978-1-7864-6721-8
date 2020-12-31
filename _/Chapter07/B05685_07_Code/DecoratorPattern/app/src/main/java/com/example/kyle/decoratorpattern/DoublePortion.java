package com.example.kyle.decoratorpattern;


public class DoublePortion extends FillingDecorator {
    private Filling filling;

    public DoublePortion(Filling filling) {
        this.filling = filling;
    }

    @Override
    public String getDescription() {
        return filling.getDescription() + " Double portion";
    }

    @Override
    public int getKcal() {
        return filling.getKcal() * 2;
    }
}
