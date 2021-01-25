package com.example.myapplication.user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterHelp;
import com.example.myapplication.login.LoginActivity;
import com.example.myapplication.model.ItemHelp;

import java.util.ArrayList;

import static com.example.myapplication.user.KamusActivity.TAG_ID;

public class HelpActivity extends AppCompatActivity {

    CardView cvPanduan, cvTentang;
    Button btnLogout;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        cvPanduan = findViewById(R.id.cvPanduan);
        cvTentang = findViewById(R.id.cvTentang);
        btnLogout = findViewById(R.id.btnLogout);
        sharedPreferences = getSharedPreferences(LoginActivity.shared_preferences, Context.MODE_PRIVATE);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean(LoginActivity.session_status, false);
                editor.putString(TAG_ID, null);
                editor.commit();

                Intent intent = new Intent(HelpActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        cvPanduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelpActivity.this, PanduanActivity.class);
                startActivity(intent);
            }
        });

        cvTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelpActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

    }
}
