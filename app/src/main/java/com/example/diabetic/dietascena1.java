package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dietascena1 extends AppCompatActivity {
    Button dietacena1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietascena1);


        dietacena1 = findViewById(R.id.btndietacena11);
        dietacena1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamardietacena1();
            }
        });
    }

    private void llamardietacena1() {

        Intent intent = new Intent( dietascena1.this,cena1diabetes1.class);
        startActivity(intent);

    }
}