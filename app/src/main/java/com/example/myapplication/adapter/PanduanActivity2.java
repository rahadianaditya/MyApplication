package com.example.myapplication.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class PanduanActivity2 extends AppCompatActivity {

    Button btnYaa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan2);

        btnYaa = findViewById(R.id.btnYaa);

        btnYaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PanduanActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
