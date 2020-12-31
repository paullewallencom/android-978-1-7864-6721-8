package com.example.kyle.layoutbuilder.builder;

import java.util.ArrayList;
import java.util.List;


public class LayoutBuilder {

    public List<LayoutView> displayDetailed() {
        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new Headline());
        views.add(new SubHeadline());
        views.add(new DetailedContent());
        return views;
    }

    public List<LayoutView> displaySimple() {
        List<LayoutView> views = new ArrayList<LayoutView>();
        views.add(new Headline());
        views.add(new SimpleContent());
        return views;
    }
}
