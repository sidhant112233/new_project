package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page13_Activity extends AppCompatActivity {

    Button btnbay4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page13);

        btnbay4 = findViewById(R.id.btnbay4);

        btnbay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page13_Activity.this,page14_Activity.class);
                startActivity(intent);
            }
        });
    }
}