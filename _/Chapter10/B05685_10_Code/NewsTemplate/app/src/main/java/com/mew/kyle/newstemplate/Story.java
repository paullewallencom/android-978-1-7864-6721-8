package com.mew.kyle.newstemplate;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

abstract class Story {
    public String source;

    // Template method
    public void publish(Context context) {
        init(context);
        setDate(context);
        setTitle(context);
        setImage(context);
        setText(context);
    }

    // Placeholder methods
    protected abstract void init(Context context);
    protected abstract void setTitle(Context context);
    protected abstract void setImage(Context context);
    protected abstract void setText(Context context);

    // Common method
    protected void setDate(Context context) {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("MMMM d");
        format.setTimeZone(calendar.getTimeZone());

        TextView textDate = (TextView) ((Activity) context).findViewById(R.id.text_date);
        textDate.setText(format.format(calendar.getTime()));
    }
}
