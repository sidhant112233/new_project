package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page7_Activity extends AppCompatActivity {

    Button btnbay2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);

        btnbay2 = findViewById(R.id.btnbay2);

        btnbay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page7_Activity.this,page8_Activity.class);

                startActivity(intent);
            }
        });
    }
}