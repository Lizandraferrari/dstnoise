package com.example.datingsimt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;
public class fumanteActivity extends AppCompatActivity {
    Intent intent;
    int cigano;
    int edgard;
    int maylson;
    int lizandra;
    private TextView frasesFumante;
    private int cont = 0;
    TextView fundo;
    int fotoAtual=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_fumante);
        intent = getIntent();
        cigano = intent.getIntExtra("cigano", 0);
        edgard = intent.getIntExtra("edgard", 0);
        maylson = intent.getIntExtra("maylson", 0);
        lizandra = intent.getIntExtra("lizandra", 0);
        fundo = (TextView)findViewById(R.id.fundo2);

        frasesFumante = (TextView) findViewById(R.id.frasesFumante);
        Button proximo = (Button) findViewById(R.id.proximo3);
        String show[] = {"Esse espaço é incrível, é aberto, confortável e fica na" +
                " frente de onde tocam. Muito bom pra dar aquela respirada depois de" +
                " moshar muito.", "Agora é hora de entrar pra ver.", "Os vocalistas Edgard " +
                "e Maylson já passaram o som e só estão esperando o restante da banda se preparar"};

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View chegada) {
                if (cont < show.length) {
                    frasesFumante.setText(show[cont++]);
                } else {
                    Intent barulho = new Intent(fumanteActivity.this, showActivity.class);
                    getIntent().putExtra("cigano",cigano);
                    getIntent().putExtra("edgard",edgard);
                    getIntent().putExtra("maylson",maylson);
                    getIntent().putExtra("lizandra",lizandra);
                    startActivity(barulho);
                    finish();

                }
            }
        });
    }
}