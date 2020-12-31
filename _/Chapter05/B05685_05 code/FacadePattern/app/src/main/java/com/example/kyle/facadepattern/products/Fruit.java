package com.example.kyle.facadepattern.products;

import com.example.kyle.facadepattern.R;

/**
 * Created by kyle on 31/07/2016.
 */
public class Fruit implements Product {
    @Override
    public int dispense() {
        return R.drawable.fruit;
    }
}
