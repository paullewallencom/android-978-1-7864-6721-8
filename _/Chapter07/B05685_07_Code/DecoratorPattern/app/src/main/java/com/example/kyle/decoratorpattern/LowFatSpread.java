package com.example.kyle.decoratorpattern;


public class LowFatSpread extends BreadDecorator {
    private Bread bread;

    public LowFatSpread(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription() + " Low fat spread";
    }

    @Override
    public int getKcal() {
        return bread.getKcal() + 25;
    }
}
