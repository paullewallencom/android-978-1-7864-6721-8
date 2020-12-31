package com.example.kyle.factorypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.kyle.factorypattern.breads.Bread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.text_view_1);
        TextView textView2 = (TextView) findViewById(R.id.text_view_2);
        TextView textView3 = (TextView) findViewById(R.id.text_view_3);

        BreadFactory breadFactory = new BreadFactory();
        Bread bread = breadFactory.getBread("BAG");
        textView1.setText(new StringBuilder()
                .append(bread.name())
                .append(bread.calories())
                .toString());

        bread = breadFactory.getBread("ROL");
        textView2.setText(new StringBuilder()
                .append(bread.name())
                .append(bread.calories())
                .toString());

        bread = breadFactory.getBread("BRI");
        textView3.setText(new StringBuilder()
                .append(bread.name())
                .append(bread.calories())
                .toString());
    }
}
