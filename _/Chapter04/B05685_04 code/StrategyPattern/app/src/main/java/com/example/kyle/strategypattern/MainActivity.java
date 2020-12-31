package com.example.kyle.strategypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kyle.strategypattern.strategies.Card;
import com.example.kyle.strategypattern.strategies.Cash;
import com.example.kyle.strategypattern.strategies.Coupon;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public BasicPrice basicPrice = BasicPrice.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Instantiate action views
        TextView textCash = (TextView) findViewById(R.id.action_cash);
        TextView textCard = (TextView) findViewById(R.id.action_card);
        TextView textCoupon = (TextView) findViewById(R.id.action_coupon);

        // Connect to local click listener
        textCash.setOnClickListener(this);
        textCard.setOnClickListener(this);
        textCoupon.setOnClickListener(this);

        // Simulate price calculation
        basicPrice.setPrice(1.5f);
    }

    @Override
    public void onClick(View view) {
        Payment payment;

        switch (view.getId()) {

            case R.id.action_card:
                payment = new Payment(new Card());
                break;

            case R.id.action_coupon:
                payment = new Payment(new Coupon());
                break;

            default:
                payment = new Payment((new Cash()));
                break;
        }

        // Output price
        String price = new StringBuilder()
                .append("Total cost : $")
                .append(payment.employStrategy(basicPrice.getPrice()))
                .append("c")
                .toString();
        
        Toast toast = Toast.makeText(this, price, Toast.LENGTH_LONG);
        toast.show();
    }
}
