package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cair_Activity extends AppCompatActivity {

    CardView office,king,sofa,bed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cair);
        office = findViewById(R.id.office);
        king = findViewById(R.id.king);
        sofa = findViewById(R.id.sofa);
        bed = findViewById(R.id.bed);

        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cair_Activity.this,bed_Activity.class);
                startActivity(intent);
            }
        });

        sofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cair_Activity.this,page3_Activity.class);
                startActivity(intent);
            }
        });

        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cair_Activity.this,officeChair_Activity.class);
                startActivity(intent);
            }
        });

        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cair_Activity.this,king_Activity.class);
                startActivity(intent);
            }
        });
    }

}