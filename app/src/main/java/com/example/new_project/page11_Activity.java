package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page11_Activity extends AppCompatActivity {

    Button btndone3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        btndone3 = findViewById(R.id.btndone3);

        btndone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page11_Activity.this,page12_Activity.class);
                startActivity(intent);
            }
        });
    }
}