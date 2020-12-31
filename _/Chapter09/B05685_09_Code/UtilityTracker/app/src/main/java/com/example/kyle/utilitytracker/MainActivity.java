package com.example.kyle.utilitytracker;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Sandwich sandwich = new Sandwich(false);
    Order order = new Order();
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOrderClicked(View view) {
        sandwich.addObserver(order);
        sandwich.setReady(false);
        sendNotification(order.getUpdate());
    }

    public void onUpdateClicked(View view) {
        sandwich.setReady(true);
        sendNotification(order.getUpdate());
    }

    private void sendNotification(String message) {
        NotificationCompat.Builder builder = (NotificationCompat.Builder)
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_stat_burger)
                        .setContentTitle(getString(R.string.content_title))
                        .setContentText(message);

        NotificationManager manager = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);

        manager.notify(id, builder.build());
        id += 1;
    }
}
