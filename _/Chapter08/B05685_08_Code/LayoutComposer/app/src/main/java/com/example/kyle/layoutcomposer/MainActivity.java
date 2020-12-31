package com.example.kyle.layoutcomposer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Replace default layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundResource(R.color.colorLayoutBackground);
        layout.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        setContentView(layout);

        // Inflate components
        Builder builder = new Builder(this);

        // eg 1 & 2
        // builder.header.inflate(layout);
        // builder.headline.inflate(layout);

        // eg 3
        builder.headerGroup().inflate(layout);

        // eg 4
        //builder.sandwichArray().inflate(layout);

        // eg 5
        builder.sandwichLayout().inflate(layout);
        builder.story().inflate(layout);
    }
}
