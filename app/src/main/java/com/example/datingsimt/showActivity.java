package com.example.datingsimt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {
    Intent intent;
    int cigano;
    int edgard;
    int maylson;
    int lizandra;
    int cont = 0;
    int textoIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        intent = getIntent();
        cigano = intent.getIntExtra("cigano", 0);
        edgard = intent.getIntExtra("edgard", 0);
        maylson = intent.getIntExtra("maylson", 0);
        lizandra = intent.getIntExtra("lizandra", 0);
        Button proximo = findViewById(R.id.proximo4);
        TextView fundo = findViewById(R.id.fundo3);
        final TextView frasesShow = findViewById(R.id.frasesShow);
        ImageView fotocas = findViewById(R.id.fotocas);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        final int[] fotos = {
                R.drawable.image16, R.drawable.image16,
                R.drawable.image9, R.drawable.image9,
                R.drawable.image14, R.drawable.image14,
                R.drawable.image11, R.drawable.image11
        };

        final String comentarios[] = {
                "Nossa que maneiro os vocalistas Edgard e Maylson",
                "Nossa que maneiro os vocalistas Edgard e Maylson",
                "Uau! Que incrível, é a guitarra do Diogo Rogério do DST!", "Uau! Que incrível, " +
                "é a guitarra do Diogo Rogério do DST!",
                "A baterista Lizandra já está quase terminando de montar a bateria. " +
                        "O show já vai começar.",
                "A baterista Lizandra já está quase terminando de montar a bateria. " +
                "O show já vai começar.",
                "Agora finalmente vou ver o DST ao vivo!",
                "Agora finalmente vou ver o DST ao vivo!"
        };

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont < fotos.length) {
                    if (cont % 2 != 0) {
                        fundo.setVisibility(View.VISIBLE);
                    } else {
                        fundo.setVisibility(View.GONE);
                    }
                    fotocas.setImageResource(fotos[cont]);
                    cont++;
                    if (textoIndex < comentarios.length) {
                        frasesShow.setText(comentarios[textoIndex]);
                        textoIndex++;
                    }
                } else {
                    Intent i = new Intent(showActivity.this, escolhaActivity.class);
                    getIntent().putExtra("cigano",cigano);
                    getIntent().putExtra("edgard",edgard);
                    getIntent().putExtra("maylson",maylson);
                    getIntent().putExtra("lizandra",lizandra);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}
