package com.example.akash.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView)findViewById(R.id.Numbers);
        numbers.setOnClickListener(new Numberclicklistener(){
            @Override
            public void onClick(View view) {
                Intent intentNumber = new Intent(MainActivity.this,Number.class);
                startActivity(intentNumber);
            }
        });

        TextView Colors = (TextView)findViewById(R.id.Colors);
        Colors.setOnClickListener(new Numberclicklistener(){
            @Override
            public void onClick(View view) {
                Intent intentNumber = new Intent(MainActivity.this,Colors.class);
                startActivity(intentNumber);
            }
        });

        TextView Family = (TextView)findViewById(R.id.FamilyMenber);
        Family.setOnClickListener(new Numberclicklistener(){
            @Override
            public void onClick(View view) {
                Intent intentFamily = new Intent(MainActivity.this,FamilyMember.class);
                startActivity(intentFamily);
            }
        });

        TextView Phases = (TextView)findViewById(R.id.Phrases);
        Phases.setOnClickListener(new Numberclicklistener(){
            @Override
            public void onClick(View view) {
                Intent intentPhases = new Intent(MainActivity.this,Phrases.class);
                startActivity(intentPhases);
            }
        });
    }
}

