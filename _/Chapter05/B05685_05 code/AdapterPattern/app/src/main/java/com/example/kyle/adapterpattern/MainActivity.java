package com.example.kyle.adapterpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.text_view);

        OldLocation oldLocation = new CustomerLocation();
        oldLocation.setBuilding("Town Hall");
        oldLocation.setFloor(3);
        oldLocation.setDesk(14);

        NewLocation newLocation = new Adapter(oldLocation);

        textView.setText(new StringBuilder()
                .append(newLocation.getBuilding())
                .append(", floor: ")
                .append(newLocation.getFloor())
                .append(", desk: ")
                .append(newLocation.getDesk())
                .toString());
    }
}
