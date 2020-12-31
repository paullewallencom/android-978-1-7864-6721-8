package com.example.kyle.singleton;

import android.util.Log;


public class CurrentUser {
    private static final String DEBUG_TAG = "tag";

    // Create instance
    private static CurrentUser user = new CurrentUser();
    private String name;

    // Protect class from being instantiated
    private CurrentUser() {
    }

    // Return only instance of user
    public static CurrentUser getUser() {
        return user;
    }

    // Set name
    protected void setName(String n) {
        name = n;
    }

    // Output user name
    protected void outputName() {
        Log.d(DEBUG_TAG, name);
    }
}
