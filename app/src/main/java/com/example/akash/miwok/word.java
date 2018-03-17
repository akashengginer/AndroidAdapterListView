package com.example.akash.miwok;

/**
 * Created by Akash on 12/3/2017.
 */

public class word {

    private String text="";
    private String convert_text="";
    private int mImageResourceId=0;

    public word(String text1,String convert,int ImageResourceId)
    {
        this.text = text1;
        this.convert_text = convert;
        this.mImageResourceId=ImageResourceId;
    }

    public word(String text2,String convert2)
    {
        this.text=text2;
        this.convert_text=convert2;
    }

    public String getConvert_text() {
        return convert_text;
    }

    public String getText() {
        return text;
    }

    public int getmImageResourceId(){return mImageResourceId;}
}