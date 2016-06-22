package com.cmmapp.pablosj.cmmapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends Activity implements View.OnClickListener {

    private Button registro;
    private EditText usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Typeface font = Typeface.createFromAsset(getAssets(),"Equal-Regular.otf");
        usuario = (EditText) findViewById(R.id.usuario);
        usuario.setTypeface(font);
        registro = (Button) findViewById(R.id.registro);
        registro.setTypeface(font);
        registro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.registro:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
