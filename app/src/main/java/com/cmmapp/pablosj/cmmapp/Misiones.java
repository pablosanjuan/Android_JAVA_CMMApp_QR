package com.cmmapp.pablosj.cmmapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Misiones extends Activity implements View.OnClickListener {

    Button b_m1, b_m2, b_m3, b_m4, b_m5, b_m6;
    ImageButton b_info;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misiones);

        b_m1 = (Button) findViewById(R.id.btn_mision1);
        b_m2 = (Button) findViewById(R.id.btn_mision2);
        b_m3 = (Button) findViewById(R.id.btn_mision3);
        b_m4 = (Button) findViewById(R.id.btn_mision4);
        b_m5 = (Button) findViewById(R.id.btn_mision5);
        b_m6 = (Button) findViewById(R.id.btn_mision6);
        b_info = (ImageButton) findViewById(R.id.btn_info);

        prefs = getSharedPreferences("datos", Context.MODE_PRIVATE);
        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");
        b_m1.setTypeface(font);
        b_m2.setTypeface(font);
        b_m3.setTypeface(font);
        b_m4.setTypeface(font);
        b_m5.setTypeface(font);
        b_m6.setTypeface(font);

        b_m1.setOnClickListener(this);
        b_m2.setOnClickListener(this);
        b_m3.setOnClickListener(this);
        b_m4.setOnClickListener(this);
        b_m5.setOnClickListener(this);
        b_m6.setOnClickListener(this);
        b_info.setOnClickListener(this);

        validar_btn1();
        validar_btn2();
        validar_btn3();
        validar_btn4();
        validar_btn5();
        validar_btn6();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_mision1:
                new AlertDialog.Builder(this).setTitle("Mision 1: Prueba Tu Scanner")
                        .setMessage("Misión inicial donde se prueba la configuración inicial del dispositivo")
                        .setPositiveButton("Iniciar Mision", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                Intent ir_m1 = new Intent().setClass(Misiones.this, M1.class);
                                startActivity(ir_m1);
                                finish();
                            }
                        }).show();
                break;

            case R.id.btn_mision2:
                new AlertDialog.Builder(this).setTitle("Mision 2: Sala 1 - Aprende a Jugar")
                        .setMessage("En la primera sala de la Casa Museo Mosquera encontraras algunos objetos pertenecientes a la familia del General Tomás Cipriano, sus padres José María Mosquera y María Manuela Arboleda. En esta misión aprenderás la mecánica del juego y como realizar las misiones.")
                        .setPositiveButton("Iniciar Mision", new DialogInterface.OnClickListener() {//un listener que al pulsar, cierre la aplicacion
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                Intent ir_m2 = new Intent().setClass(Misiones.this, M1.class);
                                startActivity(ir_m2);
                                finish();
                            }
                        }).show();
                break;

            case R.id.btn_mision3:
                new AlertDialog.Builder(this).setTitle("Mision 3: Sala 2 - Legado de los Proceres")
                        .setMessage("En esta misión recorrerás la sala de los próceres de Colombia, cada uno de ellos importante en la historia alrededor del Gran General Mosquera.")
                        .setPositiveButton("Iniciar Mision", new DialogInterface.OnClickListener() {//un listener que al pulsar, cierre la aplicacion
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                //Salir
                                Intent ir_m3 = new Intent().setClass(Misiones.this, M1.class);
                                startActivity(ir_m3);
                                finish();
                            }
                        }).show();
                break;

            case R.id.btn_mision4:
                new AlertDialog.Builder(this).setTitle("Mision 4: Sala 3 - Legado Religioso")
                        .setMessage("Aunque se dice que el Gran General Mosquera era ateo, su entorno se caracterizaba entre otros por sus creencias religiosas especialmente por parte de su hermano el Arzobispo Manuel José Mosquera.")
                        .setPositiveButton("Iniciar Mision", new DialogInterface.OnClickListener() {//un listener que al pulsar, cierre la aplicacion
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                //Salir
                                Intent ir_m4 = new Intent().setClass(Misiones.this, M1.class);
                                startActivity(ir_m4);
                                finish();
                            }
                        }).show();
                break;

            case R.id.btn_mision5:
                new AlertDialog.Builder(this).setTitle("Mision 5: Sala 4 - Legado y Vida del General")
                        .setMessage("El Gran General Mosquera a lo largo de su vida nos deja una serie de inimaginables recuerdos y anécdotas, con esta misión darás un pequeño recorrido por algunos de los hechos más importantes que marcaron la vida del general.")
                        .setPositiveButton("Iniciar Mision", new DialogInterface.OnClickListener() {//un listener que al pulsar, cierre la aplicacion
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                //Salir
                                Intent ir_m5 = new Intent().setClass(Misiones.this, M1.class);
                                startActivity(ir_m5);
                                finish();
                            }
                        }).show();
                break;

            case R.id.btn_mision6:
                new AlertDialog.Builder(this).setTitle("Mision 6: Sala 5 - Arte Religioso")
                        .setMessage("En esa época, las colecciones de arte religioso eran bastante importantes, se tenían diferentes tipos de escuelas con enfoques diferentes e incluso se importaban obras desde Europa. ¡Has un rápido recuento histórico a través de esta misión!")
                        .setPositiveButton("Iniciar Mision", new DialogInterface.OnClickListener() {//un listener que al pulsar, cierre la aplicacion
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                Intent ir_m6 = new Intent().setClass(Misiones.this, M1.class);
                                startActivity(ir_m6);
                                finish();
                            }
                        }).show();
                break;
            case R.id.btn_info:
                startActivity(new Intent(this, PopInfoMisiones.class));
                break;
        }
    }

    private void validar_btn1() {
        if (prefs.getBoolean("d_museo1", false)) {
            b_m1.setBackgroundColor(R.color.black);
            b_m1.setEnabled(false);
        }
    }
    @SuppressLint("ResourceAsColor")
    private void validar_btn2() {
        if (prefs.getBoolean("d_museo2", false)) {
            b_m1.setBackgroundColor(R.color.black);
            b_m2.setEnabled(false);
        }
    }
    @SuppressLint("ResourceAsColor")
    private void validar_btn3() {
        if (prefs.getBoolean("d_museo3", false)) {
            b_m1.setBackgroundColor(R.color.black);
            b_m3.setEnabled(false);
        }
    }
    @SuppressLint("ResourceAsColor")
    private void validar_btn4() {
        if (prefs.getBoolean("d_museo4", false)) {
            b_m1.setBackgroundColor(R.color.black);
            b_m4.setEnabled(false);
        }
    }
    @SuppressLint("ResourceAsColor")
    private void validar_btn5() {
        if (prefs.getBoolean("d_museo5", false)) {
            b_m1.setBackgroundColor(R.color.black);
            b_m5.setEnabled(false);
        }
    }
    private void validar_btn6() {
        if (prefs.getBoolean("d_museo6", false)) {
            b_m1.setBackgroundColor(R.color.black);
            b_m6.setEnabled(false);
        }
    }
}
