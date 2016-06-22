package com.cmmapp.pablosj.cmmapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Mapas extends Activity implements View.OnClickListener {
    Button b_sal1, b_sal2, b_sal3, b_sal4, b_sal5, b_reco;
    ImageView maps;
    TextView nom_sala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);

        b_sal1 = (Button) findViewById(R.id.btn_sala1);
        b_sal2 = (Button) findViewById(R.id.btn_sala2);
        b_sal3 = (Button) findViewById(R.id.btn_sala3);
        b_sal4 = (Button) findViewById(R.id.btn_sala4);
        b_sal5 = (Button) findViewById(R.id.btn_sala5);
        b_reco = (Button) findViewById(R.id.btn_recorrido);
        maps = (ImageView) findViewById(R.id.mapas_museo);
        nom_sala = (TextView) findViewById(R.id.nom_sala);

        Typeface font = Typeface.createFromAsset(getAssets(), "Equal-Regular.otf");
        b_sal1.setTypeface(font);
        b_sal2.setTypeface(font);
        b_sal3.setTypeface(font);
        b_sal4.setTypeface(font);
        b_sal5.setTypeface(font);
        b_reco.setTypeface(font);
        nom_sala.setTypeface(font);

        b_sal1.setOnClickListener(this);
        b_sal2.setOnClickListener(this);
        b_sal3.setOnClickListener(this);
        b_sal4.setOnClickListener(this);
        b_sal5.setOnClickListener(this);
        b_reco.setOnClickListener(this);

        nom_sala.setText("Recorrido Dentro del Museo");
        b_reco.setBackgroundResource(R.drawable.shapemenu_presion);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sala1:
                maps.setBackgroundResource(R.drawable.s1);
                nom_sala.setText("Sala 1 - Sala del Contexto");
                b_sal1.setBackgroundResource(R.drawable.shapemenu_presion);

                b_reco.setBackgroundResource(R.drawable.shapemenu);
                b_sal2.setBackgroundResource(R.drawable.shapemenu);
                b_sal3.setBackgroundResource(R.drawable.shapemenu);
                b_sal4.setBackgroundResource(R.drawable.shapemenu);
                b_sal5.setBackgroundResource(R.drawable.shapemenu);
                break;
            case R.id.btn_sala2:
                maps.setBackgroundResource(R.drawable.s2);
                nom_sala.setText("Sala 2 - Sala de Ilustres Caucanos y del Pensamiento");
                b_sal2.setBackgroundResource(R.drawable.shapemenu_presion);

                b_reco.setBackgroundResource(R.drawable.shapemenu);
                b_sal1.setBackgroundResource(R.drawable.shapemenu);
                b_sal3.setBackgroundResource(R.drawable.shapemenu);
                b_sal4.setBackgroundResource(R.drawable.shapemenu);
                b_sal5.setBackgroundResource(R.drawable.shapemenu);

                break;
            case R.id.btn_sala3:
                maps.setBackgroundResource(R.drawable.s3);
                nom_sala.setText("Sala 3 - Sala del Legado Arzobispo José Manuel Mosquera");
                b_sal3.setBackgroundResource(R.drawable.shapemenu_presion);

                b_reco.setBackgroundResource(R.drawable.shapemenu);
                b_sal2.setBackgroundResource(R.drawable.shapemenu);
                b_sal1.setBackgroundResource(R.drawable.shapemenu);
                b_sal4.setBackgroundResource(R.drawable.shapemenu);
                b_sal5.setBackgroundResource(R.drawable.shapemenu);

                break;
            case R.id.btn_sala4:
                maps.setBackgroundResource(R.drawable.s4);
                nom_sala.setText("Sala 4 - Sala del Legado de Tomas Cipriano de Mosquera");
                b_sal4.setBackgroundResource(R.drawable.shapemenu_presion);

                b_reco.setBackgroundResource(R.drawable.shapemenu);
                b_sal2.setBackgroundResource(R.drawable.shapemenu);
                b_sal3.setBackgroundResource(R.drawable.shapemenu);
                b_sal1.setBackgroundResource(R.drawable.shapemenu);
                b_sal5.setBackgroundResource(R.drawable.shapemenu);

                break;
            case R.id.btn_sala5:
                maps.setBackgroundResource(R.drawable.s5);
                nom_sala.setText("Sala 5 - Sala de Colección de Arte Colonial");
                b_sal5.setBackgroundResource(R.drawable.shapemenu_presion);

                b_reco.setBackgroundResource(R.drawable.shapemenu);
                b_sal2.setBackgroundResource(R.drawable.shapemenu);
                b_sal3.setBackgroundResource(R.drawable.shapemenu);
                b_sal4.setBackgroundResource(R.drawable.shapemenu);
                b_sal1.setBackgroundResource(R.drawable.shapemenu);

                break;
            case R.id.btn_recorrido:
                maps.setBackgroundResource(R.drawable.ruta);
                nom_sala.setText("Recorrido Dentro del Museo");
                b_reco.setBackgroundResource(R.drawable.shapemenu_presion);

                b_sal1.setBackgroundResource(R.drawable.shapemenu);
                b_sal2.setBackgroundResource(R.drawable.shapemenu);
                b_sal3.setBackgroundResource(R.drawable.shapemenu);
                b_sal4.setBackgroundResource(R.drawable.shapemenu);
                b_sal5.setBackgroundResource(R.drawable.shapemenu);

                break;
        }
    }
}
