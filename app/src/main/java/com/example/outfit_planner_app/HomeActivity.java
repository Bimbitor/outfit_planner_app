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

        ImageButton buttonClothes = findViewById(R.id.button_home_clothes_button);
        ImageButton buttonOutfits = findViewById(R.id.button_home_outfit_button);
        ImageButton buttonIA = findViewById(R.id.button_home_IA_button);
        ImageButton buttonCalendar = findViewById(R.id.image_home_calendar_button);
        ImageButton buttonWeather = findViewById(R.id.image_home_weather_button);


        buttonClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToClothesList = new Intent(HomeActivity.this, ClothesListActivity.class);
                startActivity(intentToClothesList);
            }
        });

        buttonOutfits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToOutfitsList = new Intent(HomeActivity.this, OutfitsListActivity.class);
                startActivity(intentToOutfitsList);
            }
        });

        buttonIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToIA = new Intent(HomeActivity.this, OutfitFormActivity.class);
                startActivity(intentToIA);
                }
        });

        buttonCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToCalendar = new Intent(HomeActivity.this, CalendarActivity.class);
                startActivity(intentToCalendar);

                }
        });

        buttonWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToWeather = new Intent(HomeActivity.this, WeatherActivity.class);
                startActivity(intentToWeather);

            }
        });
    }
}

