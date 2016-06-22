package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Superada extends Activity implements View.OnClickListener {

    private  Button siguiente;
    TextView s_txt1, s_txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superada);
        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");
        siguiente = (Button) findViewById(R.id.siguiente_scan);
        siguiente.setTypeface(font);
        siguiente.setOnClickListener(this);
        s_txt1 = (TextView) findViewById(R.id.s_txt1);
        s_txt2 = (TextView) findViewById(R.id.s_txt2);
        s_txt1.setTypeface(font);
        s_txt2.setTypeface(font);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.siguiente_scan:
                Intent intent = new Intent(this, Fallida.class);
                startActivity(intent);
                break;
        }
    }
}
