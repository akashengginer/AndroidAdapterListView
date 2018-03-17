package com.example.akash.miwok;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.onClick;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        setTitle("Number");

        //ArrayList<String> word = new ArrayList<String>();
        //word.add("one");
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,word);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","ONE",R.drawable.number_one));
        words.add(new word("two","TWO",R.drawable.number_two));
        words.add(new word("three","THREE",R.drawable.number_three));
        words.add(new word("four","FOUR",R.drawable.number_four));
        words.add(new word("five","FIVE",R.drawable.number_five));
        words.add(new word("six","SIX",R.drawable.number_six));
        words.add(new word("seven","SEVEN",R.drawable.number_seven));
        words.add(new word("eight","EIGHT",R.drawable.number_eight));
        words.add(new word("nine","NINE",R.drawable.number_nine));
        words.add(new word("ten","TEN",R.drawable.number_ten));

        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this,words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView)findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);
    }
}

