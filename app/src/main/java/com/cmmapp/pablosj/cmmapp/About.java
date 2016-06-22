package com.cmmapp.pablosj.cmmapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class About extends Activity {

    TextView inf1,inf2,inf3,inf4,inf5,inf6,inf7,inf8,inf9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");

        inf1 = (TextView) findViewById(R.id.txt_about);
        inf2 = (TextView) findViewById(R.id.txt_about2);
        inf3 = (TextView) findViewById(R.id.txt_about3);
        inf4 = (TextView) findViewById(R.id.txt_about4);
        inf5 = (TextView) findViewById(R.id.txt_about5);
        inf6 = (TextView) findViewById(R.id.txt_about6);
        inf7 = (TextView) findViewById(R.id.txt_about7);
        inf8 = (TextView) findViewById(R.id.txt_about8);
        inf9 = (TextView) findViewById(R.id.txt_about9);

        inf1.setTypeface(font);
        inf2.setTypeface(font);
        inf3.setTypeface(font);
        inf4.setTypeface(font);
        inf5.setTypeface(font);
        inf6.setTypeface(font);
        inf7.setTypeface(font);
        inf8.setTypeface(font);
        inf9.setTypeface(font);
    }

}
