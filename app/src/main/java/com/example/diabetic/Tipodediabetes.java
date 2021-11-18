package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tipodediabetes extends AppCompatActivity {


    Button diabetes1,diabetes2, musica, imc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipodediabetes);

        diabetes1 = findViewById(R.id.btndiabetes1);
        diabetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamardiabetes1();
            }
        });

        musica = findViewById(R.id.btnmusica);
        musica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarmusica();
            }
        });

        diabetes2 = findViewById(R.id.btndiabetes2);
        diabetes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamardiabetes2();
            }
        });

        imc = findViewById(R.id.btncalculaimc);
        imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarimc();
            }
        });

    }

    private void llamarimc() {
        Intent intent = new Intent( Tipodediabetes.this,calculadoraimc.class);
        startActivity(intent);
    }

    private void llamardiabetes2() {
        Intent intent = new Intent( Tipodediabetes.this,diabetes2.class);
        startActivity(intent);
    }

    private void llamarmusica() {
        Intent intent = new Intent( Tipodediabetes.this,musica1.class);
        startActivity(intent);
    }

    private void llamardiabetes1() {
        Intent intent = new Intent( Tipodediabetes.this,diabtes1.class);
        startActivity(intent);
    }


    public void irespecialista(View view) {
        Button especialista;
        String _url = "http://www.essalud.gob.pe/consultas-en-linea/";

        especialista = findViewById(R.id.btnespecialista);
        especialista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
    }
}