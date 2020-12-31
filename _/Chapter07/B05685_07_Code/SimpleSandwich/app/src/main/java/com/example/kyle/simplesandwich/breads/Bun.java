package com.example.kyle.simplesandwich.breads;


public class Bun extends Bread {
    
    @Override
    public String description() {
        return "Bun with ...";
    }

    @Override
    public int kcal() {
        return 150;
    }
}
