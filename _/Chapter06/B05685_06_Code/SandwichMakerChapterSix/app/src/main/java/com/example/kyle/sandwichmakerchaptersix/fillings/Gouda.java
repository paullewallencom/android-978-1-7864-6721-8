package com.example.kyle.sandwichmakerchaptersix.fillings;


import com.example.kyle.sandwichmakerchaptersix.R;

public class Gouda extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Gouda";
    }

    @Override
    public int getImage() {
        return R.drawable.gouda;
    }

    @Override
    public int getKcal() {
        return 117;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 80;
    }
}
