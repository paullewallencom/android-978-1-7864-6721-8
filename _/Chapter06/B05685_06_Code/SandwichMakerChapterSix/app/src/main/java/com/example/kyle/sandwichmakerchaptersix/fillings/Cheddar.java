package com.example.kyle.sandwichmakerchaptersix.fillings;


import com.example.kyle.sandwichmakerchaptersix.R;

public class Cheddar extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Cheddar";
    }

    @Override
    public int getImage() {
        return R.drawable.cheddar;
    }

    @Override
    public int getKcal() {
        return 130;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 75;
    }
}
