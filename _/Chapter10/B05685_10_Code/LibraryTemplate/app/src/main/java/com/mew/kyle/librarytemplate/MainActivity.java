package com.mew.kyle.librarytemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Print book
        ReadingMaterial document = new SelectedBook();
        document.fetchDocument();

        // Print magazine
        document=new SelectedMagazine();
        document.fetchDocument();
    }
}
