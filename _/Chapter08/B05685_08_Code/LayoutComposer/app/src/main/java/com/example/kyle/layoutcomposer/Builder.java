package com.example.kyle.layoutcomposer;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kyle.layoutcomposer.components.Component;
import com.example.kyle.layoutcomposer.components.CompositeImage;
import com.example.kyle.layoutcomposer.components.CompositeLayer;
import com.example.kyle.layoutcomposer.components.CompositeShell;
import com.example.kyle.layoutcomposer.components.CompositeText;
import com.example.kyle.layoutcomposer.components.ImageLeaf;
import com.example.kyle.layoutcomposer.components.TextLeaf;

public class Builder {

    Component header;
    Context context;
    Component headline;

    Builder(Context context) {
        this.context = context;
        initLeaves();
    }

    private void initLeaves() {
        header = new ImageLeaf(new ImageView(context),
                R.drawable.header);
        headline = new TextLeaf(new TextView(context),
                R.string.headline);
    }

    Component headerGroup() {
        Component c = new CompositeImage(new ImageView(context),
                R.drawable.header);
        c.add(headline);
        return c;
    }

    Component sandwichArray() {
        Component c = new CompositeShell();
        c.add(setImage(R.drawable.sandwich1));
        c.add(setImage(R.drawable.sandwich2));
        c.add(setImage(R.drawable.sandwich3));
        return c;
    }

    Component sandwichLayout() {
        Component c = new CompositeLayer(new LinearLayout(context),
                R.color.colorLayoutBackground);
        c.add(sandwichArray());
        return c;
    }

    Component story(){
        Component c = new CompositeText(new TextView(context)
                ,R.string.story);
        c.add(setImage(R.drawable.footer));
        return c;
    }

    public TextLeaf setText(int t) {
        TextLeaf leaf = new TextLeaf(new TextView(context), t);
        return leaf;
    }

    public ImageLeaf setImage(int t) {
        ImageLeaf leaf = new ImageLeaf(new ImageView(context), t);
        return leaf;
    }
}
