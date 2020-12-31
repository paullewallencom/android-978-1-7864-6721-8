package com.example.kyle.decoratorpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bread bun = new Bun();
        // or
        Bread bagel = new Bagel();

        //Butter spread = new Butter(bagel);
        // or
        LowFatSpread spread = new LowFatSpread(bagel);

        Toasted toast = new Toasted(spread);

        Open open = new Open(toast);

        Log.d(DEBUG_TAG, spread.getDescription() + " " + spread.getKcal());
        Log.d(DEBUG_TAG, toast.getDescription() + " " + toast.getKcal());
        Log.d(DEBUG_TAG, open.getDescription() + " " + open.getKcal());

    }
}
