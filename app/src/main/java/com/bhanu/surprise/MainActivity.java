package com.bhanu.surprise;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView cakeImage;
    private Button cutTheCake;
    private TextView wishText;
    private final String wish="Happy Birthday Bhanu Bhai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        cakeImage=findViewById(R.id.cakeImage);
        cutTheCake=findViewById(R.id.cutTheCake);
        wishText=findViewById(R.id.wishText);
        final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.happy_birthday_nakash_aziz);

        cutTheCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    wishText.setText("");
                }
                else{
                    mediaPlayer.start(); // no need to call prepare(); create() does that for you
                    wishText.setText(wish);
                }
            }
        });
    }
}