package com.example.kyle.prototypepattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView primeText = (TextView) findViewById(R.id.text_prime);
        TextView fibText = (TextView) findViewById(R.id.text_fib);
        TextView cloneText = (TextView) findViewById(R.id.text_clone);

        SequenceCache.loadCache();

        Sequence prime = (Sequence) SequenceCache.getSequence("1");
        primeText.setText(new StringBuilder()
                .append(getString(R.string.prime_text))
                .append(prime.getResult())
                .toString());

        Sequence fib = (Sequence) SequenceCache.getSequence("2");
        fibText.setText(new StringBuilder()
                .append(getString(R.string.fib_text))
                .append(fib.getResult())
                .toString());

        Sequence clone = (Fibonacci) new Fibonacci().clone();
        long result = clone.getResult() / 2;
        cloneText.setText(new StringBuilder()
                .append(getString(R.string.clone_text))
                .append(result)
                .toString());
    }
}
