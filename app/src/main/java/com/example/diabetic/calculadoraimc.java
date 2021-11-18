package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class calculadoraimc extends AppCompatActivity {

    EditText txtAltura, txtPeso;
    TextView txtresultadogeneral, txtconsejo;
    Button btnLimpiar, btnCalculadora;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadoraimc);

        txtAltura = (EditText) findViewById(R.id.txtAltura);
        txtPeso = (EditText) findViewById(R.id.txtPeso);
        btnCalculadora = (Button) findViewById(R.id.btnCalculadora);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        imagen = (ImageView) findViewById(R.id.imgpeso);
        txtconsejo = (TextView)findViewById(R.id.txtconsejo);
        txtresultadogeneral=(TextView) findViewById(R.id.txtresultadogeneral);


        btnLimpiar.setOnClickListener((v) -> {Limpiar();});
        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick (View view) {
                Double peso, altura, imc;
                peso =Double.parseDouble(txtPeso.getText().toString());
                altura = Double.parseDouble(txtAltura.getText().toString());
                imc = peso/Math.pow(altura,2);
                int situacion;

                if (imc <= 18.5) {
                    situacion =1;
                    txtconsejo.setText("Come con más frecuencia. Tienes bajo peso, puedes sentirte satisfecho más rápido. Consume de cinco a seis comidas más pequeñas durante el día en lugar de dos o tres comidas grandes.");
                }
                else if (imc > 18.5 && imc < 24.99) {
                    situacion =2;
                    txtconsejo.setText("¡¡¡ PERFECTO !!! siga asi y realice 30 minutos de ejercicio aeróbico 5 veces por semana* Logre un equilibrio entre su consumo de calorías y su actividad física. Limite las grasas saturadas a no más del 7 % de sus calorías totales.");
                }
                else {
                    situacion =3;
                    txtconsejo.setText("Limite el consumo de alimentos que sean ricos en azúcares y grasas. Puedes comprobarlo mirando la etiqueta de los productos que comes. Por ejemplo, algunos cereales son ricos en fibra, pero también en azúcares.");
                }
                switch (situacion){
                    case 1:
                        imagen.setImageResource(R.drawable.flaco);
                        Crouton.makeText(calculadoraimc.this,"¡¡¡BAJO PESO!!!", Style.INFO).show();
                        break;
                    case 2:
                        imagen.setImageResource(R.drawable.normal);
                        Crouton.makeText(calculadoraimc.this,"peso normal", Style.CONFIRM).show();
                        break;
                    case 3:
                        imagen.setImageResource(R.drawable.gordo);
                        Crouton.makeText(calculadoraimc.this,"¡¡¡SOBRE PESO!!!", Style.ALERT).show();
                        break;


                }

                txtresultadogeneral.setText(""+imc);
            }

        });
    }

    private void Limpiar()
    {
        imagen.setImageResource(R.drawable.incognito);
        txtAltura.setText("");
        txtPeso.setText("");
        txtresultadogeneral.setText("");
        txtconsejo.setText("");


    }
}