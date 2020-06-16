package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playSong(View view){
        Button b = (Button) view;
        Log.i("Button Pressed",b.getTag().toString());
       // MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier(b.getTag().toString(), "raw", getPackageName()));
     //   mPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
