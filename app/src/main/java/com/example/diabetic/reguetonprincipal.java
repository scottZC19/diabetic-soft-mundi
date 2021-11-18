package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reguetonprincipal extends AppCompatActivity {

    Button atras, lacancion, criminal, tebote, elfarsante, vainaloca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reguetonprincipal);






        lacancion = findViewById(R.id.btnlacancion);

        lacancion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lacancioncancion();
            }
        });

        criminal = findViewById(R.id.btncriminal);

        criminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                criminalcancion();
            }
        });

        tebote = findViewById(R.id.btntebote);

        tebote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tebotecancion();
            }
        });

        elfarsante = findViewById(R.id.btnelfarsante);

        elfarsante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elfarsantecancion();
            }
        });

        vainaloca = findViewById(R.id.btnvainaloca);

        vainaloca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vainalocacancion();
            }
        });





    }



    private void lacancioncancion() {
        Intent intent = new Intent( reguetonprincipal.this,regue1.class);
        startActivity(intent);

    }
    private void criminalcancion() {
        Intent intent = new Intent( reguetonprincipal.this,regue2.class);
        startActivity(intent);

    }
    private void tebotecancion() {
        Intent intent = new Intent( reguetonprincipal.this,regue3.class);
        startActivity(intent);

    }
    private void elfarsantecancion() {
        Intent intent = new Intent( reguetonprincipal.this,regue4.class);
        startActivity(intent);

    }
    private void vainalocacancion() {
        Intent intent = new Intent( reguetonprincipal.this,regue5.class);
        startActivity(intent);

    }
}