package com.example.myapplication.user;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class DetailPenyakit extends AppCompatActivity {

    TextView tvPenyakit;
    TextView tvDeskripsi;
    int position;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_penyakit);

        tvPenyakit = findViewById(R.id.detailPenyakit);
        tvDeskripsi = findViewById(R.id.detailDesc);

        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");

        tvPenyakit.setText(PenyakitActivity.list.get(position).getPenyakit());
        tvDeskripsi.setText(PenyakitActivity.list.get(position).getDeskripsi());
    }
}
