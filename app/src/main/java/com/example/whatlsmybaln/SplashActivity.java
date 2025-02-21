package com.example.whatlsmybaln;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        //Vamos a unir la variable del mundo visual con la variable del mundo lógico
        ImageView splash = findViewById(R.id.splash1);
        //Creamos programaticamente la animación
        Animation fadeIn = new AlphaAnimation(0, 1);
        //Establecemos la duración de la animación
        fadeIn.setDuration(2000);
        //Establecemos la animación al ImageView (splash)
        splash.startAnimation(fadeIn);

        splash.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}











