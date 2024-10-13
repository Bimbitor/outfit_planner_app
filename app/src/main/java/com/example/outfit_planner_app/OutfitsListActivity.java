package com.example.outfit_planner_app;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class OutfitsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_outfit_list);

        ImageButton addButton = findViewById(R.id.button_outfits_list_add);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToOutfitList = new Intent(OutfitsListActivity.this, OutfitFormActivity.class);
                startActivity(intentToOutfitList);
            }
        });
    }
}
