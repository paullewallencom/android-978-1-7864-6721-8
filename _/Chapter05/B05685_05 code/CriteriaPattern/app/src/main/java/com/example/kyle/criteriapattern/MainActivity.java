package com.example.kyle.criteriapattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);

        List<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(new Ingredient("Cheddar,", "locally produced", true));
        ingredients.add(new Ingredient("Ham,", "Cheshire", false));
        ingredients.add(new Ingredient("Tomato,", "Kent", true));
        ingredients.add(new Ingredient("Turkey,", "locally produced", false));

        Filter local = new LocalFilter();
        Filter nonLocal = new NonLocalFilter();
        Filter vegetarian = new VegetarianFilter();
        Filter localAndVegetarian = new AndCriteria(local, vegetarian);
        Filter localOrVegetarian = new OrCriteria(local, vegetarian);

        printIngredients(local.meetCriteria(ingredients), "LOCAL:\n");
        printIngredients(nonLocal.meetCriteria(ingredients), "\nNOT LOCAL:\n");
        printIngredients(vegetarian.meetCriteria(ingredients), "\nVEGETARIAN:\n");
        printIngredients(localAndVegetarian.meetCriteria(ingredients), "\nLOCAL VEGETARIAN:\n");
        printIngredients(localOrVegetarian.meetCriteria(ingredients), "\nENVIRONMENTALLY FRIENDLY:\n");    }

    public void printIngredients(List<Ingredient> ingredients, String header) {

        textView.append(header);

        for (Ingredient ingredient : ingredients) {
            textView.append(new StringBuilder()
                    .append(ingredient.getName())
                    .append(" ")
                    .append(ingredient.getLocal())
                    .append("\n")
                    .toString());
        }
    }
}
