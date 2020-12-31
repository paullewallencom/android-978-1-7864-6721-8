package com.example.kyle.sandwichmakerchaptersix;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import com.example.kyle.sandwichmakerchaptersix.fillings.Brie;
import com.example.kyle.sandwichmakerchaptersix.fillings.Camembert;
import com.example.kyle.sandwichmakerchaptersix.fillings.Cheddar;
import com.example.kyle.sandwichmakerchaptersix.fillings.Cheese;
import com.example.kyle.sandwichmakerchaptersix.fillings.Emmental;
import com.example.kyle.sandwichmakerchaptersix.fillings.Gouda;
import com.example.kyle.sandwichmakerchaptersix.fillings.Manchego;
import com.example.kyle.sandwichmakerchaptersix.fillings.Roquefort;

import static com.example.kyle.sandwichmakerchaptersix.R.color;
import static com.example.kyle.sandwichmakerchaptersix.R.id;
import static com.example.kyle.sandwichmakerchaptersix.R.layout;
import static com.example.kyle.sandwichmakerchaptersix.R.string;


public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "tag";
    DataAdapter adapter;
    RecyclerView recyclerView;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(id.toolbar);
        setSupportActionBar(toolbar);


        final ArrayList<Cheese> cheeses = buildList();
        adapter = new DataAdapter(cheeses);

        recyclerView = (RecyclerView) findViewById(id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        // recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addItemDecoration(new ItemDivider(this));
        // recyclerView.addItemDecoration(new ItemDivider(this, R.drawable.divider));
        recyclerView.setAdapter(adapter);
        // REMOVE WHEN SLIDE AND DISMISS IS ACTIVE
        // recyclerView.setHasFixedSize(true);

        initItemTouchHelper();

        fab = (FloatingActionButton) findViewById(id.fab);
        buildDialog(fab);
    }

    private void initItemTouchHelper() {
        ItemTouchHelper.SimpleCallback callback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder1) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

                if (direction == ItemTouchHelper.LEFT) {
                    Log.d(DEBUG_TAG, "Swiped LEFT");
                } else {
                    Log.d(DEBUG_TAG, "Swiped RIGHT");
                }

                int position = viewHolder.getAdapterPosition();
                adapter.removeItem(position);
            }
        };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    private void buildDialog(FloatingActionButton fab) {
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                LayoutInflater inflater = MainActivity.this.getLayoutInflater();

                builder.setView(inflater.inflate(layout.checkout_dialog, null))

                        .setPositiveButton(string.action_ok_text, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(MainActivity.this, CheckoutActivity.class);
                                startActivity(intent);
                            }
                        })

                        .setNegativeButton(string.action_cancel_text, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // System dismisses dialog
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();

                Button cancelButton = dialog.getButton(DialogInterface.BUTTON_NEGATIVE);
                cancelButton.setTextColor(getResources().getColor(color.colorAccent));

                Button okButton = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
                okButton.setTextColor(getResources().getColor(color.colorAccent));
            }
        });
    }

    private ArrayList<Cheese> buildList() {
        ArrayList<Cheese> cheeses = new ArrayList<>();

        cheeses.add(new Brie());
        cheeses.add(new Camembert());
        cheeses.add(new Cheddar());
        cheeses.add(new Emmental());
        cheeses.add(new Gouda());
        cheeses.add(new Manchego());
        cheeses.add(new Roquefort());

        return cheeses;
    }
}
