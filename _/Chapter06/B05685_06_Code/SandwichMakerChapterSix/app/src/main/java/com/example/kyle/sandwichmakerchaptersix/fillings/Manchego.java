package com.example.kyle.sandwichmakerchaptersix.fillings;


import com.example.kyle.sandwichmakerchaptersix.R;

public class Manchego extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Manchego";
    }

    @Override
    public int getImage() {
        return R.drawable.manchego;
    }

    @Override
    public int getKcal() {
        return 132;
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
