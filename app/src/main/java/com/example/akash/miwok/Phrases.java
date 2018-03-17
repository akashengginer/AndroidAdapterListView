package com.example.akash.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("WHITE","white"));
        words.add(new word("DUSTY_YELLOW","dirty_yellow"));
        words.add(new word("MUSTARD_YELLOY","mustard_yellow"));
        words.add(new word("GREY","grey"));
        words.add(new word("GREEN","green"));
        words.add(new word("RED","red"));
        words.add(new word("BROWN","brown"));
        words.add(new word("BLACK","black"));


        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this,words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView)findViewById(R.id.Phrases);
        listView.setAdapter(flavorAdapter);
    }
}
