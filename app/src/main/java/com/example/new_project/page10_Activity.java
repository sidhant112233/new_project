package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page10_Activity extends AppCompatActivity {

    Button btnbay3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);
        btnbay3 = findViewById(R.id.btnbay3);

        btnbay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page10_Activity.this,page11_Activity.class);
                startActivity(intent);
            }
        });
    }
}