package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class musica1 extends AppCompatActivity {

    Button salsa, regueton, merengue, rap, bachata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica1);


        salsa = findViewById(R.id.btnsalsa);
        salsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarsalsa();
            }
        });

        regueton = findViewById(R.id.btnregueton);
        regueton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarregueton();
            }
        });

    }

    private void llamarregueton() {
        Intent intent = new Intent( musica1.this,reguetonprincipal.class);
        startActivity(intent);
    }


    private void llamarsalsa() {
        Intent intent = new Intent( musica1.this,salsaprincipal.class);
        startActivity(intent);
    }
}