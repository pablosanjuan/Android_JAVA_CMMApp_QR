package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opciones extends AppCompatActivity implements View.OnClickListener {
    private Button misiones, info, mapas;
    private TextView nomb_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        String VALORESCANEO = getIntent().getStringExtra("codigo");

        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Configuracion.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });

        misiones = (Button) findViewById(R.id.btn_misiones);
        info = (Button) findViewById(R.id.btn_info);
        mapas = (Button) findViewById(R.id.btn_mapas);
        nomb_usuario = (TextView) findViewById(R.id.nomb_usuario);

        misiones.setTypeface(font);
        info.setTypeface(font);
        mapas.setTypeface(font);
        nomb_usuario.setTypeface(font);

        misiones.setOnClickListener(this);
        info.setOnClickListener(this);
        mapas.setOnClickListener(this);

        try {
            // nomb_usuario.setText(VALORESCANEO);
        }catch (Exception e){

        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_misiones:
                Intent intent = new Intent(this, Misiones.class);
                startActivity(intent);
                break;
            case R.id.btn_info:
                Intent intent2 = new Intent(this, InfoPiezas.class);
                startActivity(intent2);
                break;
            case R.id.btn_mapas:
                Intent intent3 = new Intent(this, Mapas.class);
                startActivity(intent3);
                break;
        }
    }
}
