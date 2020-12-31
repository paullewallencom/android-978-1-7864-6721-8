package com.example.kyle.serviceexample;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class Reminder extends Service {
    private static final String DEBUG_TAG = "tag";
    NotificationCompat.Builder builder;
    //private boolean isRunning = false;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(DEBUG_TAG, "Service StartCommand");

        // Build notification
        builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_bun)
                .setContentTitle("Reminder")
                .setContentText("Your sandwich is ready to collect");

        // Issue timed notification
        new Thread(new Runnable() {

            @Override
            public void run() {
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        manager.notify(0, builder.build());
                        cancel();
                    }

                }, 3000);
                //}, 1000 * 60 * 10);
                stopSelf();
            }

        }).start();

        return Service.START_STICKY;
    }

    @Override
    public void onCreate() {
        Log.d(DEBUG_TAG, "Service created");
        //isRunning = true;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        Log.d(DEBUG_TAG, "Service destroyed");
        //isRunning = false;
    }
}
