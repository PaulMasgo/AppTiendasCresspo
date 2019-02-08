package com.example.jeanramos.appteindascresspo.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.jeanramos.appteindascresspo.MainActivity;
import com.example.jeanramos.appteindascresspo.R;

public class SplashScreen extends AppCompatActivity {
    private static int timeout=3000;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_splash_screen);
        img=findViewById(R.id.img);
        Animation animation=AnimationUtils.loadAnimation( SplashScreen.this,R.anim.myanim);
        img.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },timeout);
    }
}
