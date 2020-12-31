package com.example.kyle.sandwichmakerchaptersix.fillings;


import com.example.kyle.sandwichmakerchaptersix.R;

public class Brie extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Brie";
    }

    @Override
    public int getImage() {
        return R.drawable.brie;
    }

    @Override
    public int getKcal() {
        return 142;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 68;
    }
}
