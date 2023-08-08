package com.example.datingsimt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class barActivity extends AppCompatActivity {
private TextView frasesBar;
public int edgard=0;
public int cigano=0;
public int lizandra=0;
public int maylson=0;
private int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_bar);
        frasesBar = (TextView) findViewById(R.id.frasesBar);
        Button cerveja = (Button) findViewById(R.id.cerveja);
        Button suquinho = (Button) findViewById(R.id.suquinho);
        Button energetico = (Button) findViewById(R.id.energetico);
        Button cachaca = (Button) findViewById(R.id.cachaca);
        Button proximo = (Button) findViewById(R.id.proximo2);
        proximo.setVisibility(View.GONE);
        String cana[] = {"É a primeira vez que tomo uma cachaça artesanal de rapadura.",
                "Me falaram que é exclusivo desse bar essa aqui. ","Agora me sinto bem" +
                " para o show!","Vou ficar perto do palco para ver a banda " +
                "montando os equipamentos."};
        String redbull[]={"Muito bom tomar um(energetico favorito do maylson)geladinha.",
                " Agora me sinto bem para o show!","Vou ficar perto do palco para ver " +
                "a banda montando os equipamentos."};
        String suco[]={"Muito bom tomar um suquinho de caju.",
                "Agora me sinto bem para o show!","Vou ficar perto do palco para ver a" +
                " banda montando os equipamentos."};
        String gelada[]={"Muito bom tomar uma breja geladinha.","Agora me sinto bem para o" +
                " show!","Vou ficar perto do palco para ver a banda montando os equipamentos."};

        cachaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pinga) {

                cigano++;
                cerveja.setVisibility(View.GONE);
                suquinho.setVisibility(View.GONE);
                cachaca.setVisibility(View.GONE);
                energetico.setVisibility(View.GONE);

                proximo.setVisibility(View.VISIBLE);
                proximo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View pinga2) {

                        if (cont < cana.length) {
                            frasesBar.setText(cana[cont++]);
                        } else {
                            Intent equipamento = new Intent(barActivity.this, fumanteActivity.class);
                            getIntent().putExtra("cigano",cigano);
                            getIntent().putExtra("edgard",edgard);
                            getIntent().putExtra("maylson",maylson);
                            getIntent().putExtra("lizandra",lizandra);
                            startActivity(equipamento);
                            finish();
                        }
                    }
                });
            }
        });

        energetico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View monster) {
                maylson++;
                cerveja.setVisibility(View.GONE);
                suquinho.setVisibility(View.GONE);
                cachaca.setVisibility(View.GONE);
                energetico.setVisibility(View.GONE);

                proximo.setVisibility(View.VISIBLE);
                proximo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View monster2) {

                        if (cont < redbull.length) {
                            frasesBar.setText(redbull[cont++]);
                        } else {
                            Intent equipamento = new Intent(barActivity.this, fumanteActivity.class);
                            getIntent().putExtra("cigano",cigano);
                            getIntent().putExtra("edgard",edgard);
                            getIntent().putExtra("maylson",maylson);
                            getIntent().putExtra("lizandra",lizandra);
                            startActivity(equipamento);
                            finish();
                        }
                    }
                });
            }
        });
        suquinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View caju) {
                lizandra++;
                cerveja.setVisibility(View.GONE);
                suquinho.setVisibility(View.GONE);
                cachaca.setVisibility(View.GONE);
                energetico.setVisibility(View.GONE);

                proximo.setVisibility(View.VISIBLE);

                proximo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View caju2) {

                        if (cont < suco.length) {
                            frasesBar.setText(suco[cont++]);
                        } else {
                            Intent equipamento = new Intent(barActivity.this, fumanteActivity.class);
                            getIntent().putExtra("cigano",cigano);
                            getIntent().putExtra("edgard",edgard);
                            getIntent().putExtra("maylson",maylson);
                            getIntent().putExtra("lizandra",lizandra);
                            startActivity(equipamento);
                            finish();
                        }
                    }
                });
            }
        });
        cerveja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View breja) {
                cerveja.setVisibility(View.GONE);
                suquinho.setVisibility(View.GONE);
                cachaca.setVisibility(View.GONE);
                energetico.setVisibility(View.GONE);
                proximo.setVisibility(View.VISIBLE);
                edgard++;

                proximo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View breja2) {
                        if (cont < gelada.length) {
                            frasesBar.setText(gelada[cont++]);
                        } else {
                            Intent equipamento = new Intent(barActivity.this, fumanteActivity.class);
                            getIntent().putExtra("cigano",cigano);
                            getIntent().putExtra("edgard",edgard);
                            getIntent().putExtra("maylson",maylson);
                            getIntent().putExtra("lizandra",lizandra);
                            startActivity(equipamento);
                            finish();
                        }
                    }
                });
            }
        });
    }
}