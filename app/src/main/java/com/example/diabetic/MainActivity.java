package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button ingresar, registrarse ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar = findViewById(R.id.btningresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamaringresar();
            }
        });

        registrarse = findViewById(R.id.btnregistro);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamarregistrase();
            }
        });




    }

    private void llamarregistrase() {
        Intent intent = new Intent( MainActivity.this,registro.class);
        startActivity(intent);
    }

    private void llamaringresar() {
        Intent intent = new Intent( MainActivity.this,Tipodediabetes.class);
        startActivity(intent);
    }

    public void irfacebook(View view) {

        Button facebook;
        String _url = "https://web.facebook.com/groups/1480787015572827";

        facebook = findViewById(R.id.btnfacebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
    }

    public void irinstagram(View view) {
        Button instagram;
        String _url = "https://www.instagram.com/lavienutritive/?hl=es";

        instagram = findViewById(R.id.btninstagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
    }

    public void irwhatsap(View view) {
        Button whatsap;
        String _url = "https://chat.whatsapp.com/ErHlQ0T7SUUCZNPLjN0wFI";

        whatsap = findViewById(R.id.btnwhatsap);
        whatsap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
    }

    public void irtelegram(View view) {
        Button telegram;
        String _url = "https://t.me/joinchat/lo5R6eJ03XhkYjEx";

        telegram = findViewById(R.id.btntelegram);
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
    }
}