package com.example.datingsimt;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class escolhaActivity extends AppCompatActivity {

    Button liz, ed, diogo, may, mosh;
    TextView olhar, fundo;
    ImageView fotoca;
    Intent intent;
    int cigano, edgard, maylson, lizandra;
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        liz = findViewById(R.id.liz);
        olhar = findViewById(R.id.olhar);
        ed = findViewById(R.id.ed);
        diogo = findViewById(R.id.diogo);
        may = findViewById(R.id.may);
        mosh = findViewById(R.id.moshar);
        fundo = findViewById(R.id.fundo4);
        fotoca = findViewById(R.id.fotocas2);

        intent = getIntent();
        cigano = intent.getIntExtra("cigano", 0);
        edgard = intent.getIntExtra("edgard", 0);
        maylson = intent.getIntExtra("maylson", 0);
        lizandra = intent.getIntExtra("lizandra", 0);

        liz.setVisibility(View.GONE);
        may.setVisibility(View.GONE);
        ed.setVisibility(View.GONE);
        diogo.setVisibility(View.GONE);
        fundo.setVisibility(View.VISIBLE);
        olhar.setVisibility(View.VISIBLE);
        fotoca.setVisibility(View.GONE);

        mosh.setText("Avançar");

        final String[] phrases = {
                "Esse show foi muito zika, eles são muito bons ao vivo e passam uma energia " +
                        "enorme com suas músicas.",
                "Me encantei muito em finalmente ouvir ao vivo minha música favorita do DST.",
                "Acho que vou falar com a banda pra conhecer eles"
        };

        mosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cont < phrases.length) {
                    olhar.setText(phrases[cont]);
                    cont++;
                } else {
                    olhar.setText("Olhar para:");

                    liz.setVisibility(View.VISIBLE);
                    may.setVisibility(View.VISIBLE);
                    ed.setVisibility(View.VISIBLE);
                    diogo.setVisibility(View.VISIBLE);
                    fundo.setVisibility(View.VISIBLE);
                    olhar.setVisibility(View.VISIBLE);
                    fotoca.setVisibility(View.GONE);
                    mosh.setText("Moshar até o fim do show");
                }
            }
        });

        liz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liz.setVisibility(View.GONE);
                may.setVisibility(View.GONE);
                ed.setVisibility(View.GONE);
                diogo.setVisibility(View.GONE);
                fundo.setVisibility(View.GONE);
                olhar.setVisibility(View.GONE);
                fotoca.setVisibility(View.VISIBLE);
                fotoca.setImageResource(R.drawable.image15);
                mosh.setText("Voltar");
                lizandra++;
            }
        });

        may.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liz.setVisibility(View.GONE);
                may.setVisibility(View.GONE);
                ed.setVisibility(View.GONE);
                diogo.setVisibility(View.GONE);
                fundo.setVisibility(View.GONE);
                olhar.setVisibility(View.GONE);
                fotoca.setVisibility(View.VISIBLE);
                fotoca.setImageResource(R.drawable.image13);
                mosh.setText("Voltar");
                maylson++;
            }
        });

        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liz.setVisibility(View.GONE);
                may.setVisibility(View.GONE);
                ed.setVisibility(View.GONE);
                diogo.setVisibility(View.GONE);
                fundo.setVisibility(View.GONE);
                olhar.setVisibility(View.GONE);
                fotoca.setVisibility(View.VISIBLE);
                fotoca.setImageResource(R.drawable.image3);
                mosh.setText("Voltar");
                edgard++;
            }
        });

        diogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liz.setVisibility(View.GONE);
                may.setVisibility(View.GONE);
                ed.setVisibility(View.GONE);
                diogo.setVisibility(View.GONE);
                fundo.setVisibility(View.GONE);
                olhar.setVisibility(View.GONE);
                fotoca.setVisibility(View.VISIBLE);
                fotoca.setImageResource(R.drawable.image1);
                mosh.setText("Voltar");
                cigano++;
            }
        });
    }
}

/*
private void mostrabotao() {
        liz.setVisibility(View.VISIBLE);
        may.setVisibility(View.VISIBLE);
        ed.setVisibility(View.VISIBLE);
        diogo.setVisibility(View.VISIBLE);
        fundo.setVisibility(View.VISIBLE);
        olhar.setVisibility(View.VISIBLE);
        fotoca.setVisibility(View.GONE);
        mosh.setText("Moshar até o fim do show");
    }

reseta as views e transforma os botões em direções pras respectivas activitys
Esse show foi muito zika, eles são muito bons ao vivo e passam uma energia enorme com suas músicas.
Me encantei muito em finalmente ouvir ao vivo minha música favorita do DST.
Acho que vou falar com a banda pra conhecer eles: (escolha de encontro)
>Vou falar com o Diogo Rogério
>Vou falar com a Lizandra
>Vou falar com o Maylson
>Vou falar com o Edgard
cada botao direciona a um encontro
*/


