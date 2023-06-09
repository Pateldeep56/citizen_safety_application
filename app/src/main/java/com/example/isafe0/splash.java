package com.example.isafe0;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends AppCompatActivity {
    private LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lottieAnimationView = findViewById (R.id.lottie_layer_name);


        lottieAnimationView.addAnimatorListener (new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {

                startActivity (new Intent(splash.this,MainActivity.class));
                finish ();

            }
        });


    }
}