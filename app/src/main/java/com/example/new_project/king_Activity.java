package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class king_Activity extends AppCompatActivity {

    CardView wood,office,sofa,bed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_king);
        wood = findViewById(R.id.wood);
        office = findViewById(R.id.office);
        sofa = findViewById(R.id.sofa);
        bed = findViewById(R.id.bed);

        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(king_Activity.this,bed_Activity.class);
                startActivity(intent);
            }
        });

        sofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(king_Activity.this,page3_Activity.class);
                startActivity(intent);
            }
        });

        wood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(king_Activity.this,Cair_Activity.class);
                startActivity(intent);
            }
        });

        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(king_Activity.this,officeChair_Activity.class);
                startActivity(intent);
            }
        });
    }
}