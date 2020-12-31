package com.example.kyle.sandwichmakerchaptersix.fillings;


import com.example.kyle.sandwichmakerchaptersix.R;

public class Roquefort extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Roquefort";
    }

    @Override
    public int getImage() {
        return R.drawable.roquefort;
    }

    @Override
    public int getKcal() {
        return 160;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 93;
    }
}
