package com.mew.kyle.librarytemplate;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SelectedMagazine extends Magazine {

    // Realization
    private static final String DEBUG_TAG = "tag";

    // Implement placeholder method only once instance created
    @Override
    protected void date() {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("MM-d-yyyy");
        format.setTimeZone(calendar.getTimeZone());
        Log.d(DEBUG_TAG,format.format(calendar.getTime()));
    }
}
