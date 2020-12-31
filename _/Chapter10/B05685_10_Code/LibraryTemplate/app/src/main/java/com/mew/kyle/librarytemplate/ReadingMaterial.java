package com.mew.kyle.librarytemplate;

import android.util.Log;

abstract class ReadingMaterial {

    // Generalization
    private static final String DEBUG_TAG = "tag";
    Document doc;

    // Standardized skeleton algorithm
    public void fetchDocument() {
        init();
        title();
        genre();
        id();
        date();
        edition();
    }

    // placeholder functions
    protected abstract void id();

    protected abstract void date();

    // Common functions
    private void init() {
        doc = new Document();
    }

    private void title() {
        Log.d(DEBUG_TAG,"Title : "+doc.title);
    }

    private void genre() {
        Log.d(DEBUG_TAG, doc.genre);
    }

    protected void edition() {
        Log.d(DEBUG_TAG, doc.edition);
    }
}
