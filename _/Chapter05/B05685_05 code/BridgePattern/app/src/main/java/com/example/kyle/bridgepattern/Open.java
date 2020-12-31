package com.example.kyle.bridgepattern;

import android.util.Log;

/**
 * Created by kyle on 30/07/2016.
 */
public class Open implements SandwichInterface {
    private static final String DEBUG_TAG = "tag";

    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d(DEBUG_TAG, "Open sandwich " + filling1 + filling2);
    }
}
