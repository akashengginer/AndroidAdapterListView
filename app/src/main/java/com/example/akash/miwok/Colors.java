package com.example.akash.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("WHITE","white",R.drawable.color_white));
        words.add(new word("DUSTY_YELLOW","dirty_yellow",R.drawable.color_dusty_yellow));
        words.add(new word("MUSTARD_YELLOY","mustard_yellow",R.drawable.color_mustard_yellow));
        words.add(new word("GREY","grey",R.drawable.color_gray));
        words.add(new word("GREEN","green",R.drawable.color_green));
        words.add(new word("RED","red",R.drawable.color_red));
        words.add(new word("BROWN","brown",R.drawable.color_brown));
        words.add(new word("BLACK","black",R.drawable.color_black));


        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this,words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView)findViewById(R.id.Colors);
        listView.setAdapter(flavorAdapter);
    }
}
