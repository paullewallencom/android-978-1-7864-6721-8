package com.example.kyle.layoutcomposer.components;

import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.kyle.layoutcomposer.R;

public class ImageLeaf implements Component {
    private ImageView imageView;

    public ImageLeaf(ImageView imageView, int id) {
        this.imageView = imageView;
        setContent(id);
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void setContent(int id) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                dp(104)));

        imageView.setImageResource(id);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(imageView);
    }

    public int dp(int px) {
        float scale = imageView.getResources().getDisplayMetrics().density;
        return (int) (px * scale + 0.5f);
    }
}
