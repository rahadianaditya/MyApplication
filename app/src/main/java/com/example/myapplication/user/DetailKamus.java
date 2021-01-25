package com.example.myapplication.user;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class DetailKamus extends AppCompatActivity {
    TextView tvKata;
    TextView tvArti;
    int position;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_kamus);

        tvKata = findViewById(R.id.detailKata);
        tvArti = findViewById(R.id.detailArti);

        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");

        tvKata.setText(KamusActivity.dataList.get(position).getKata());
        tvArti.setText(KamusActivity.dataList.get(position).getArti());
    }
}
