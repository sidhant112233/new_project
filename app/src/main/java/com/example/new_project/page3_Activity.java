package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class page3_Activity extends AppCompatActivity {


    CardView sofa1,sofa2,sofa3,sofa4,sofa5,chair,bed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        sofa1 = findViewById(R.id.sofa1);
        sofa2 = findViewById(R.id.sofa2);
        sofa3 = findViewById(R.id.sofa3);
        sofa4 = findViewById(R.id.sofa4);
        sofa5 = findViewById(R.id.sofa5);
        chair = findViewById(R.id.chair);
        bed = findViewById(R.id.bed);


        sofa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page3_Activity.this,page4_Activity.class);

                startActivity(intent);
            }
        });

        sofa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page3_Activity.this,page7_Activity.class);

                startActivity(intent);
            }
        });

        sofa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page3_Activity.this,page10_Activity.class);
                startActivity(intent);
            }
        });

        sofa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page3_Activity.this,page13_Activity.class);
                startActivity(intent);
            }
        });

        chair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page3_Activity.this,Cair_Activity.class);
                startActivity(intent);
            }
        });

        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page3_Activity.this,bed_Activity.class);
                startActivity(intent);
            }
        });
    }
}