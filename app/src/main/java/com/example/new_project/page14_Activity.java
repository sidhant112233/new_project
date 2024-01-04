package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page14_Activity extends AppCompatActivity {

    Button btndone4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14);
        btndone4 = findViewById(R.id.btndone3);

        btndone4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page14_Activity.this,page15_Activity.class);

                startActivity(intent);
            }
        });
    }
}