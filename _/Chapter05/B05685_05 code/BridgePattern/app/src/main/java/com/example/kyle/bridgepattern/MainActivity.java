package com.example.kyle.bridgepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractSandwich openSandwich = new Sandwich("Cheese ", "Tomato", new Open());
        openSandwich.make();

        AbstractSandwich closedSandwich = new Sandwich("Ham ", "Eggs", new Closed());
        closedSandwich.make();
    }
}
