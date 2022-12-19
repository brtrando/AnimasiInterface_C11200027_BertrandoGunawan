package com.example.animasiinterface_c11200027_bertrandogunawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7, bt8, bt9;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.btBlink);
        bt2 = (Button) findViewById(R.id.btBounce);
        bt3 = (Button) findViewById(R.id.btMove);
        bt4 = (Button) findViewById(R.id.btRotate);
        bt5 = (Button) findViewById(R.id.btZoomIn);
        bt6 = (Button) findViewById(R.id.btZoomOut);
        bt7 = (Button) findViewById(R.id.btFadeIn);
        bt8 = (Button) findViewById(R.id.btFadeOut);
        bt9 = (Button) findViewById(R.id.btMix);
        iv1 = (ImageView) findViewById(R.id.imageView);

        Animation aBlink,aBounce,aMove,aRotate,aZoomIn,aZoomOut,aFadeIn,aFadeOut,aMix;

        aBlink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        aBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        aMove = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        aRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        aZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        aZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
        aFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        aFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        aMix = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.mix);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aBlink);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aBounce);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aMove);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aRotate);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aZoomIn);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aZoomOut);
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aFadeIn);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aFadeOut);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setVisibility(View.VISIBLE);
                iv1.startAnimation(aMix);
            }
        });



    }
}