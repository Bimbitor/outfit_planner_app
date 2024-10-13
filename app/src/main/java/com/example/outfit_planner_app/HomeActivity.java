package com.example.outfit_planner_app;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton buttonInicio = findViewById(R.id.button_home_clothes_button);
        ImageButton buttonCalendario = findViewById(R.id.image_home_weather_button);
        ImageButton buttonIA = findViewById(R.id.button_home_IA_button);
        ImageButton buttonCrearOutfit = findViewById(R.id.button_home_outfit_button);

        buttonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToClothesList = new Intent(HomeActivity.this, ClothesListActivity.class);
                startActivity(intentToClothesList);
            }
        });
    }
}

