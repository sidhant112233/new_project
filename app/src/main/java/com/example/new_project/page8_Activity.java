package com.example.new_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page8_Activity extends AppCompatActivity {

    Button btndone2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        btndone2 = findViewById(R.id.btndone2);

        btndone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page8_Activity.this,page9_Activity.class);

                startActivity(intent);
            }
        });

    }
}