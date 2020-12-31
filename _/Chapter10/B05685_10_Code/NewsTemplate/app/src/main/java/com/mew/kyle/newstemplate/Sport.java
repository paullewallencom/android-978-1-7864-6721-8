package com.mew.kyle.newstemplate;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class Sport extends Story {
    TextView textHeadline;
    TextView textView;
    ImageView imageView;

    @Override
    protected void init(Context context) {
        source = "SPORT";
        textHeadline = (TextView) ((Activity) context).findViewById(R.id.text_headline);
        textView = (TextView) ((Activity) context).findViewById(R.id.text_view);
        imageView = (ImageView) ((Activity) context).findViewById(R.id.image_view);
    }

    @Override
    protected void setTitle(Context context) {
        ((Activity) context).setTitle("SPORT TODAY");
    }

    @Override
    protected void setImage(Context context) {
        imageView.setImageResource(R.drawable.sport);
    }

    @Override
    protected void setText(Context context) {
        textHeadline.setText(R.string.sport_headline);
        textView.setText(R.string.sport_content);
    }
}
