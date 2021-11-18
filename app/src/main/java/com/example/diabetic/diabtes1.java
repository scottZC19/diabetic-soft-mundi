package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diabtes1 extends AppCompatActivity {
    Button desayunodiabetes1, almuerzodiabetes1, cenadiabetes1, postrediabetes1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabtes1);


        desayunodiabetes1 = findViewById(R.id.btndesayunodiabtes1);
        desayunodiabetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamardesayunodiabetes1();
            }
        });
        almuerzodiabetes1 = findViewById(R.id.btnalmuerzodiabetes1);
        almuerzodiabetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamaralmuerzodiabetes1();
            }
        });
        cenadiabetes1 = findViewById(R.id.btncenadiabetes1);
        cenadiabetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarcenadiabetes1();
            }
        });
        postrediabetes1 = findViewById(R.id.btnpostrediabetes1);
        postrediabetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarpostrediabetes1();
            }
        });
    }

    private void llamarpostrediabetes1() {
        Intent intent = new Intent( diabtes1.this,dietapostre1.class);
        startActivity(intent);
    }

    private void llamarcenadiabetes1() {
        Intent intent = new Intent( diabtes1.this,dietascena1.class);
        startActivity(intent);
    }

    private void llamaralmuerzodiabetes1() {
        Intent intent = new Intent( diabtes1.this,dietasalmuerzo1.class);
        startActivity(intent);
    }

    private void llamardesayunodiabetes1() {
        Intent intent = new Intent( diabtes1.this,dietasdesayunod1.class);
        startActivity(intent);
    }


}