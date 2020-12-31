package com.example.kyle.simplesandwich;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.kyle.simplesandwich.breads.Bagel;
import com.example.kyle.simplesandwich.breads.Bread;
import com.example.kyle.simplesandwich.breads.Bun;
import com.example.kyle.simplesandwich.decorations.Toasted;
import com.example.kyle.simplesandwich.fillings.CreamCheese;
import com.example.kyle.simplesandwich.fillings.SmokedSalmon;


public class MainActivity extends AppCompatActivity {
    public SandwichBuilder builder;
    public Sandwich sandwich;
    public Bread bread;
    
    public CheckBox egg, cress;
    public Switch salt;
    public TextView order;
    public Switch toasted;
    private RadioButton bagel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bagel = (RadioButton) findViewById(R.id.radio_bagel);
        toasted = (Switch) findViewById(R.id.switch_toasted);
        egg = (CheckBox) findViewById(R.id.check_smoked_salmon);
        cress = (CheckBox) findViewById(R.id.check_cream_cheese);
        salt = (Switch) findViewById(R.id.switch_salt);
        order = (TextView) findViewById(R.id.text_order);
    }

    public void onActionOkClicked(View view) {
        builder = new SandwichBuilder();
        sandwich = new Sandwich();
        String toast;
        int extraKcal = 0;

        // Radio button group : Bread
        if (bagel.isChecked()) {
            sandwich = builder.build(sandwich, new Bagel());
        } else {
            sandwich = builder.build(sandwich, new Bun());
        }

        // Switch : Toasted
        if (toasted.isChecked()) {
            Toasted t = new Toasted(bread);
            toast = t.getDecoration();
            extraKcal += t.getDecorationKcal();
        } else {
            toast = "";
        }

        // Check boxes : Filling
        if (egg.isChecked()) {
            sandwich = builder.build(sandwich, new SmokedSalmon());
        }

        if (cress.isChecked()) {
            sandwich = builder.build(sandwich, new CreamCheese());
        }

        // Switch : Salt
        if (salt.isChecked()) {
            sandwich = builder.build(sandwich, new Salt());
        }

        // Display output
        order.setText(new StringBuilder()
                .append(toast + " ")
                .append(sandwich.getSandwich())
                .append("\n")
                .append(sandwich.getKcal() + extraKcal)
                .append(" kcal")
                .append("\n")
                .toString());
    }
}
