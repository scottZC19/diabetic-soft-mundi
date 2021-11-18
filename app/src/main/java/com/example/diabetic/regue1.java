package com.example.diabetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class regue1 extends AppCompatActivity {

    MediaPlayer mp;
    int pause;
    private Button btnlink;
    String _url = "https://www.google.com/search?sxsrf=AOaemvLLW5zDwBrQLbkxDV2WyAY_p0JrvA:1633009925338&q=bad+bunny+la+canci%C3%B3n&stick=H4sIAAAAAAAAAONgFuLVT9c3NExPKTQ0NbcwUoJwMyrjC83SLU21xLKTrfRzS4szk_UTi0oyi0usivPz0osfMX5i5BZ4-eOesNQLxklrTl5jfMjIhUOtkCEXm2teSWZJpZCgFD8Xqn1GIlCBbLPstAzjMkOBZ59nMCp1Mxpl7Lo07RxbkiADECgcCXaQMhLUlBH8uM6wzV5LiIvds9gnPzkxR9D2K7fC4b_v7bWEuThCEivy8_JzKwV3HpY58P__e3slRU4YU9Ag8Vd94HMhBwk2BQYNBsPL19gfsMVzHdBiCOLQz9U3MCnKSYOwzE3SSg4wMjXtW3GIjYWDUYDBikmDsYqJg41nEatoUmKKQlJpXl6lQk6iQnJiXnLm4c15E9gYAX4sD1pJAQAA&sa=X";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regue1);
        btnlink = findViewById(R.id.btnlink16);
        btnlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
    }

    public void play (View view){
        if (mp == null){
            mp = MediaPlayer.create(this,R.raw.lacancion);
            mp.start();
            Toast.makeText(this,"reproduciendo",Toast.LENGTH_SHORT).show();
        }
        else if (!mp.isPlaying()){
            mp.seekTo(pause);
            mp.start();
            Toast.makeText(this,"reproduciendo",Toast.LENGTH_SHORT).show();
        }

    }
    public void pausa (View view){
        if (mp !=null){
            mp.pause();
            pause = mp.getCurrentPosition();
            Toast.makeText(this,"pausando",Toast.LENGTH_SHORT).show();
        }

    }
    public void stop (View view){

        mp.stop();
        mp = null;
        Toast.makeText(this,"reiniciado",Toast.LENGTH_SHORT).show();
    }
}