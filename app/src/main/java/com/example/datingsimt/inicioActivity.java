package com.example.datingsimt;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class inicioActivity extends Activity {

    private TextView frasesInicio;
    private int contInicio = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        this.setContentView(R.layout.activity_inicio);
        setContentView(R.layout.activity_inicio);

        Button avancar = (Button) findViewById(R.id.proximo1);
        frasesInicio = (TextView) findViewById(R.id.frasesInicio);

        avancar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View clica) {
                String frases[] = {"Acabei de chegar no rolê de hoje. Dia de ver bandas" +
                        " locais do jeito que gosto. Estou feliz por isso! ", "Hoje tem a banda" +
                        " DST. Gosto muito do som deles mas ainda não vi ao vivo. " +
                        "Finalmente vou poder conhecer melhor essa " +
                        "banda. Também quero conhecer essa casa de show.", "Entre no bar"};
                if (contInicio < frases.length) {
                    frasesInicio.setText(frases[contInicio]);
                    contInicio++;
                } else {
                    Intent redirecionar = new Intent(inicioActivity.this, funHouseActivity.class);
                    startActivity(redirecionar);
                    finish();
                }
            }
        });
    }
}

/*
public class inicioActivity extends Activity {

    private TextView frasesInicio;
    private int contInicio = 0; //< Make contInicio global so that it can hold the last value

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.setContentView(R.layout.activity_inicio);
        setContentView(R.layout.activity_inicio);

        Button avancar = (Button) findViewById(R.id.proximo1);
        frasesInicio = (TextView) findViewById(R.id.frasesInicio);

        avancar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View clica) {
                String frases[] = {"Acabei de chegar no rolê de hoje. Dia de ver bandas" +
                    " locais do jeito que gosto. Estou feliz por isso! ", "Hoje tem a banda DST.
                    Gosto muito do som deles " +
                    "mas ainda não vi ao vivo. Finalmente vou poder conhecer melhor essa " +
                    "banda. Também quero conhecer essa casa de show.", "Entre no bar"};
                    switch (contInicio) {
                        case 0:
                            frasesInicio.setText(frases[contInicio]);
                            contInicio++;
                            break;
                        case 1:
                            frasesInicio.setText(frases[contInicio]);
                            contInicio++;
                            break;
                        case 2:
                            frasesInicio.setText(frases[contInicio]);
                            contInicio++;
                            break;
                        case 3:
                            Intent redirecionar = new Intent(inicioActivity.this, funHouseActivity.class);
                            startActivity(redirecionar);
                            break;
                        default:
                            contInicio = 0;
                    }
            }
        });
    }
}
 */





