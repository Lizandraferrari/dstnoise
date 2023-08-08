package com.example.datingsimt;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mainActivity extends AppCompatActivity {
    Button startarGame;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startarGame = findViewById(R.id.startar);
        startarGame.setOnClickListener(v -> {
            Intent redirecionar = new Intent(mainActivity.this, inicioActivity.class);
            startActivity(redirecionar);
            finish();
        });
    }
}