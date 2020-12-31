package com.mew.kyle.librarytemplate;

import android.util.Log;

abstract class Book extends ReadingMaterial {

    // Specialization
    private static final String DEBUG_TAG = "tag";

    // Override implemented base method
    @Override
    public void fetchDocument() {
        super.fetchDocument();
        author();
        rating();
    }

    // Implement placeholder methods
    @Override
    protected void id() {
        Log.d(DEBUG_TAG, "ISBN : " + doc.id);
    }

    @Override
    protected void date() {
        Log.d(DEBUG_TAG, doc.date);
    }

    private void author() {
        Log.d(DEBUG_TAG, doc.author);
    }

    // Include specialization placeholder methods
    protected abstract void rating();
}
