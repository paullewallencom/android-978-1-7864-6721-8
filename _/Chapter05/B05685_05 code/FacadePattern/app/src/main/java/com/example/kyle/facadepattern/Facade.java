package com.example.kyle.facadepattern;

import com.example.kyle.facadepattern.products.Crisps;
import com.example.kyle.facadepattern.products.Drink;
import com.example.kyle.facadepattern.products.Fruit;
import com.example.kyle.facadepattern.products.Product;

/**
 * Created by kyle on 31/07/2016.
 */
public class Facade {
    private Product crisps;
    private Product fruit;
    private Product drink;

    public Facade() {
        crisps = new Crisps();
        fruit = new Fruit();
        drink = new Drink();
    }

    public int dispenseCrisps() {
        return crisps.dispense();
    }

    public int dispenseFruit() {
        return fruit.dispense();
    }

    public int dispenseDrink() {
        return drink.dispense();
    }
}
