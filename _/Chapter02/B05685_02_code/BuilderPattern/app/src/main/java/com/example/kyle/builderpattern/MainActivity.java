package com.example.kyle.builderpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.kyle.builderpattern.breads.Bun;
import com.example.kyle.builderpattern.fillings.CreamCheese;

public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Build a customized sandwich
        SandwichBuilder builder = new SandwichBuilder();
        Sandwich custom = new Sandwich();

        // Simulate user selections
        custom = builder.build(custom, new Bun());
        custom = builder.build(custom, new CreamCheese());
        Log.d(DEBUG_TAG, "CUSTOMIZED");
        custom.getSandwich();
        custom.getCalories();

        // Build a ready made sandwich
        Sandwich offTheShelf = SandwichBuilder.readyMade();
        Log.d(DEBUG_TAG, "READY MADE");
        offTheShelf.getSandwich();
        offTheShelf.getCalories();
    }
}
