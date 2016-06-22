package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Configuracion extends Activity implements View.OnClickListener {

    private Button edt, borrar, contacto, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");

        edt = (Button) findViewById(R.id.edt_perfil);
        borrar = (Button) findViewById(R.id.borrar_perfil);
        contacto = (Button) findViewById(R.id.contacto);
        about = (Button) findViewById(R.id.aboutus);

        edt.setTypeface(font);
        borrar.setTypeface(font);
        contacto.setTypeface(font);
        about.setTypeface(font);

        edt.setOnClickListener(this);
        borrar.setOnClickListener(this);
        contacto.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.edt_perfil:
                Intent intent1 = new Intent(this, EditarPerfil.class);
                startActivity(intent1);
                break;
            case R.id.borrar_perfil:

                break;
            case R.id.contacto:
                Intent intent2 = new Intent(this, Contacto.class);
                startActivity(intent2);
                break;
            case R.id.aboutus:
                Intent intent3 = new Intent(this, About.class);
                startActivity(intent3);
                break;
        }
    }
}
