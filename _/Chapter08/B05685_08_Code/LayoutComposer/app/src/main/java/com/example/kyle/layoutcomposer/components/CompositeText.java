package com.example.kyle.layoutcomposer.components;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CompositeText implements Component {
    List<Component> components = new ArrayList<>();
    private TextView textView;

    public CompositeText(TextView textView, int id) {
        this.textView = textView;
        setContent(id);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void setContent(int id) {
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        textView.setPadding(20,20,20,20);
        textView.setText(id);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(textView);

        for (Component component : components) {
            component.inflate(layout);
        }
    }
}
