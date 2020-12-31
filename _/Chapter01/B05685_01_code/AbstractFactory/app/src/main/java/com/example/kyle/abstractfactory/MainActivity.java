package com.example.kyle.abstractfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.kyle.abstractfactory.breads.Bread;
import com.example.kyle.abstractfactory.fillings.Filling;

public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FIL");
        Filling filling = fillingFactory.getFilling("CHE");
        Log.d(DEBUG_TAG, filling.name()+" : "+filling.calories());

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BRI");
        Log.d(DEBUG_TAG, bread.name()+" : "+bread.calories());
    }
}
