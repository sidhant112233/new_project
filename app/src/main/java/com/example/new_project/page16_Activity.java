package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page16_Activity extends AppCompatActivity {

    Button btnbay5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page16);

        btnbay5 = findViewById(R.id.btnbay5);

        btnbay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page16_Activity.this,page17_Activity.class);
                startActivity(intent);
            }
        });
    }
}