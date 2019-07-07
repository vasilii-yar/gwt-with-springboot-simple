package ru.test.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GwtEntry implements EntryPoint {
    @Override
    public void onModuleLoad() {
        VerticalPanel vp = new VerticalPanel();
        Button btn = new Button("Click me!!");
        Label lb = new Label("Click this button");
        vp.add(lb);
        vp.add(btn);
        RootPanel.get().add(vp);
    }
}
