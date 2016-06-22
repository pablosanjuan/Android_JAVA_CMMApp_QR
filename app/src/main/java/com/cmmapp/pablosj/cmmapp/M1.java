package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M1 extends Activity implements View.OnClickListener {

    TextView info, titulo, cont_info;
    Button scan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);

        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");

        scan = (Button) findViewById(R.id.btn_scan_m1);
        info = (TextView) findViewById(R.id.tit_informacion);
        titulo = (TextView) findViewById(R.id.titulo);
        cont_info = (TextView) findViewById(R.id.cont_informacion);
        cont_info.setTypeface(font);
        titulo.setTypeface(font);
        scan.setTypeface(font);
        info.setTypeface(font);

        titulo.setText("Misión 1 - Pasillo");
        scan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_scan_m1:
                Intent inte = new Intent(this, Scanner.class);
                startActivity(inte);
                finish();
        }
    }
}
