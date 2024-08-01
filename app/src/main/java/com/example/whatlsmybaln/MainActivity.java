package com.example.whatlsmybaln;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Aqui vamos a enlazar el mundo visual con el mundo logico
        TextView tituloL = findViewById(R.id.titulo);

        //Vamos a crear la animación
        Animation anim_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise );

        //Vamos a ejecutar la animación
        tituloL.startAnimation(anim_out);




    }
}