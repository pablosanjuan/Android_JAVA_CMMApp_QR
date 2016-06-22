package com.cmmapp.pablosj.cmmapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivitty extends AppCompatActivity {

    private static long SPLASH_SCREEN_DELAY = 3000;
    private SharedPreferences prefs;
    private TextView impul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activitty);
        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");
        impul = (TextView) findViewById(R.id.impulsado);
        impul.setTypeface(font);
        prefs = getSharedPreferences("datos", Context.MODE_PRIVATE);
        TimerTask  task = new TimerTask() {
            @Override
            public void run() {

                if (prefs.getBoolean("validar_sesion", false)) {
                    Intent ir_log = new Intent().setClass(SplashActivitty.this, Opciones.class);
                    startActivity(ir_log);
                    finish();
                }else{
                    Intent ir_princ = new Intent().setClass(SplashActivitty.this, RegistroActivity.class);
                    startActivity(ir_princ);
                    finish();
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
        }
    }