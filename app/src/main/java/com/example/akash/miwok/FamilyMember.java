package com.example.akash.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMember extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("GrandFather","ONE",R.drawable.family_grandfather));
        words.add(new word("GrandMother","TWO",R.drawable.family_grandmother));
        words.add(new word("Father","THREE",R.drawable.family_father));
        words.add(new word("Mother","FOUR",R.drawable.family_mother));
        words.add(new word("Son","FIVE",R.drawable.family_son));
        words.add(new word("Daughter","SIX",R.drawable.family_daughter));
        words.add(new word("OlderBrother","SEVEN",R.drawable.family_older_brother));
        words.add(new word("OlderSister","EIGHT",R.drawable.family_older_sister));
        words.add(new word("YoungerBrother","NINE",R.drawable.family_younger_brother));
        words.add(new word("YoungerSister","TEN",R.drawable.family_younger_sister));

        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this,words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView)findViewById(R.id.FamilyMenber);
        listView.setAdapter(flavorAdapter);
    }
}
