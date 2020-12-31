package com.example.kyle.compositepattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    public LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.MATCH_PARENT;

        Builder builder = new Builder();

        super.onCreate(savedInstanceState);

        // Define root view
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new ViewGroup.LayoutParams(width, height));

        // inflate root view
        setContentView(layout);

        // Inflate a single component
        builder.list.inflate();

        // Inflate a composite component
        builder.layout1().inflate();

        // Inflate nested components
        builder.layout2().inflate();
        builder.layout3().inflate();
    }
}
