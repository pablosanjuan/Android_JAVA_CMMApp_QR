package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fallida extends Activity implements View.OnClickListener {

    private  Button siguiente;
    TextView f_txt1, f_txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fallida);
        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");
        siguiente = (Button) findViewById(R.id.scan_fallido);
        siguiente.setTypeface(font);
        siguiente.setOnClickListener(this);
        f_txt1 = (TextView) findViewById(R.id.f_txt1);
        f_txt2 = (TextView) findViewById(R.id.f_txt2);
        f_txt1.setTypeface(font);
        f_txt2.setTypeface(font);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.scan_fallido:
                Intent intent = new Intent(this, Opciones.class);
                startActivity(intent);
                break;
        }
    }
}
