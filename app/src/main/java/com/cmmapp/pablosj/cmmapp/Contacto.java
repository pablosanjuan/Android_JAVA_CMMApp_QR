package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Contacto extends Activity implements View.OnClickListener {

    TextView msn;
    Button enviar;
    EditText mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");

        msn = (TextView) findViewById(R.id.msn);
        enviar = (Button) findViewById(R.id.enviar);
        mensaje = (EditText) findViewById(R.id.mensajes);

        msn.setTypeface(font);
        mensaje.setTypeface(font);
        enviar.setTypeface(font);

        enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.enviar:
                Intent intent = new Intent(this, Superada.class);
                startActivity(intent);
                break;
        }

    }
}
