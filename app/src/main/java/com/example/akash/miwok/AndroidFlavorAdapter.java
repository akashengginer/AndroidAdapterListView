package com.example.akash.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.Phaser;

/**
 * Created by Akash on 12/3/2017.
 */

public class AndroidFlavorAdapter extends ArrayAdapter<word> {
    private static final String LOG_TAG = AndroidFlavorAdapter.class.getSimpleName();

    public AndroidFlavorAdapter(Number context, ArrayList<word> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    public AndroidFlavorAdapter(Colors context, ArrayList<word> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    public AndroidFlavorAdapter(FamilyMember context, ArrayList<word> androidFlavors) {
        super(context, 0, androidFlavors);
    }

    public AndroidFlavorAdapter(Phrases context, ArrayList<word> androidFlavors) {
        super(context, 0, androidFlavors);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentAndroidFlavor = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        nameTextView.setText(currentAndroidFlavor.getText());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
        numberTextView.setText(currentAndroidFlavor.getConvert_text());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageView);
        if(currentAndroidFlavor.getmImageResourceId()!=0)
        {
            iconView.setImageResource(currentAndroidFlavor.getmImageResourceId());
        }
        else iconView.setVisibility(View.GONE);


        return listItemView;
    }

}
