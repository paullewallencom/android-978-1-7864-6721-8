package com.example.kyle.sandwichmakerchaptersix.fillings;


import com.example.kyle.sandwichmakerchaptersix.R;

public class Camembert extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Camembert";
    }

    @Override
    public int getImage() {
        return R.drawable.camembert;
    }

    @Override
    public int getKcal() {
        return 193;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 70;
    }
}
