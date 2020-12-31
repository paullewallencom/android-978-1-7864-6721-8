package com.mew.kyle.librarytemplate;

import android.util.Log;

public class SelectedBook extends Book {

    // Realization
    private static final String DEBUG_TAG = "tag";

    // Implement specialization placeholders
    @Override
    protected void rating() {
        Log.d(DEBUG_TAG, "4 stars");
    }
}
