package com.example.kyle.notifierexpanded;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {
    Sandwich sandwich = new Sandwich();
    Observer order = new Order(sandwich);
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void sendNotification(NotificationCompat.Style style) {

        Intent profileIntent = new Intent(this, UserProfile.class);

        // Create artificial back stack
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(UserProfile.class);
        stackBuilder.addNextIntent(profileIntent);

        PendingIntent pendingIntent = stackBuilder.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);

        // Use for custom view
        //RemoteViews expandedView = new RemoteViews(this.getPackageName(), R.layout.notification);

        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_stat_burger)
                .setContentTitle("The Sandwich Factory")
                .setContentText("Good news about great sandwiches")
                .setTicker("the best sandwiches in town")
                .setAutoCancel(true)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_sandwich))
                .setContentIntent(pendingIntent)

                .setStyle(style);
                //.setContent(expandedView);

        NotificationManager manager = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);

        manager.notify(id, builder.build());
        //id++;
    }

    public void onTextClicked(View view) {
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();

        bigTextStyle.setBigContentTitle("Congratulations!");
        bigTextStyle.setSummaryText("Your tenth sandwich is on us");
        bigTextStyle.bigText(getString(R.string.long_text));

        id = 1;
        sendNotification(bigTextStyle);
    }

    public void onPictureClicked(View view) {
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();

        bigPictureStyle.setBigContentTitle("Congratulations!");
        bigPictureStyle.setSummaryText("Your tenth sandwich is on us");
        bigPictureStyle.bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.big_picture));

        id = 2;
        sendNotification(bigPictureStyle);
    }

    public void onInboxClicked(View view) {
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();

        inboxStyle.setBigContentTitle("This weeks most popular sandwiches");
        inboxStyle.setSummaryText("As voted by you");

        String[] list = {
                "Cheese and pickle",
                "Ham and tomato",
                "Smoked salmon bagel",
                "BLT",
                "Egg and cress"
        };

        for (String l : list) {
            inboxStyle.addLine(l);
        }

        id = 3;
        sendNotification(inboxStyle);
    }
}
