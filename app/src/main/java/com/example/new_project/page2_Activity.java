package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2_Activity extends AppCompatActivity {


    Button btnsing_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        btnsing_up = findViewById(R.id.btnsing_up);

        btnsing_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(page2_Activity.this,page3_Activity.class);

                startActivity(intent);
            }
        });
    }
}