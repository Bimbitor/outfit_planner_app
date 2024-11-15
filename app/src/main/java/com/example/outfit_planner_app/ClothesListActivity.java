package com.example.outfit_planner_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ClothesListActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes_list);

        ImageButton addButton = findViewById(R.id.button_clothes_list_add);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToClothesList = new Intent(ClothesListActivity.this, ClothesFormActivity.class);
                startActivity(intentToClothesList);
            }
        });

    }
}
