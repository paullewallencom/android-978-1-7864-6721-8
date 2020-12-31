package com.mew.kyle.newstemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String source = "NEWS";
    Story story = new News();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.action_change);
        button.setOnClickListener(this);

        story.publish(this);
    }

    @Override
    public void onClick(View view) {
        if (story.source == "NEWS") {
            story = new Sport();
        } else {
            story = new News();
        }
        story.publish(this);
    }
}
