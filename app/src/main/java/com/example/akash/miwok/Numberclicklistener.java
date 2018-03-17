package com.example.akash.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Akash on 10/10/2017.
 */

public class Numberclicklistener implements View.OnClickListener{
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Open list of number",Toast.LENGTH_LONG).show();

    }
}

