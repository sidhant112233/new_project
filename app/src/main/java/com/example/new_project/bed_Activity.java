package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bed_Activity extends AppCompatActivity {

    CardView sofa,bed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed);
        sofa = findViewById(R.id.sofa);
        bed = findViewById(R.id.bed);

        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(bed_Activity.this,bed_Activity.class);
                startActivity(intent);
            }
        });

        sofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bed_Activity.this,page3_Activity.class);
                startActivity(intent);
            }
        });
    }
}