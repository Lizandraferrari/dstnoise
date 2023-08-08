package com.example.datingsimt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class funHouseActivity extends AppCompatActivity {
    private TextView frasesFunHouse;
    private int contInicio = 0;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_house);
        this.setContentView(R.layout.activity_fun_house);

        Button avancar = findViewById(R.id.energetico);
        frasesFunHouse = findViewById(R.id.frasesFunHouse);

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View clica) {
                String frases[] = {"O ambiente é bem acolhedor, tem até sofás na entrada.",
                        "Vou pegar algo para beber.", "Ir para o balcão"};
                if (contInicio<frases.length){
                    frasesFunHouse.setText(frases[contInicio]);
                    contInicio++;
                } else {
                Intent redirecionar = new Intent(funHouseActivity.this, barActivity.class);
                startActivity(redirecionar);
                    finish();
            }
            }
        });
    }
}