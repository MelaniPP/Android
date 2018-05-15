package com.example.afa.sounddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    public void playAudio(View view){
        setContentView(R.layout.activity_main);
        mediaPlayer.start();


    }
    public void pauseAudio(View view){
        mediaPlayer.pause();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mediaPlayer = MediaPlayer.create(this, R.raw.laugh);

    }
}
