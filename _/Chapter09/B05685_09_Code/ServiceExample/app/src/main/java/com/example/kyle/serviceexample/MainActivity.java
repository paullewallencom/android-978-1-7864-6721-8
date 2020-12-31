package com.example.kyle.serviceexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onReminderClicked(View view) {
        Intent intent = new Intent(MainActivity.this, Reminder.class);
        startService(intent);
    }

    public void onCancelClicked(View view) {
        Intent intent = new Intent(MainActivity.this, Reminder.class);
        stopService(intent);
    }
}
