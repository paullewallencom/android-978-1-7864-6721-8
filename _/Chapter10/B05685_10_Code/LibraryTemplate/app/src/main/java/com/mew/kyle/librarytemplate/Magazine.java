package com.mew.kyle.librarytemplate;

import android.util.Log;

abstract class Magazine extends ReadingMaterial {

    //Specialization
    private static final String DEBUG_TAG = "tag";

    // Implement placeholder methods
    @Override
    protected void id() {
        Log.d(DEBUG_TAG, "ISSN : " + doc.id);
    }

    @Override
    protected void edition() {
        Log.d(DEBUG_TAG, doc.period);
    }

    // Pass placeholder on to realization
    protected abstract void date();
}
