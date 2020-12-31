package com.mew.kyle.checkoutvisitor;

import android.util.Log;

public class Checkout implements Visitor {
    private static final String DEBUG_TAG = "tag";

    @Override
    public int visit(CannedFood cannedFood) {
        int cost = cannedFood.getCost();
        String name = cannedFood.getName();
        Log.d(DEBUG_TAG, "Canned " + name + " : " + cost + "c");
        return cost;
    }

    @Override
    public int visit(SpecialOffer specialOffer) {
        String name = specialOffer.getName();
        int cost = specialOffer.getBaseCost();
        int number = specialOffer.getQuantity();
        cost *= number;
        if (number > 1) {
            cost = cost / 2;
        }
        Log.d(DEBUG_TAG, "Special " + name + " : " + cost + "c");
        return cost;
    }

    @Override
    public int visit(FreshFood freshFood) {
        int cost = freshFood.getCostPerKilo() * freshFood.getWeight();
        String name = freshFood.getName();
        Log.d(DEBUG_TAG, "Fresh " + name + " : " + cost + "c");
        return cost;
    }
}
