package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.login.LoginActivity;
import com.example.myapplication.user.AboutActivity;
import com.example.myapplication.user.DiagnosaActvitity;
import com.example.myapplication.user.HelpActivity;
import com.example.myapplication.user.HistoryActivity;
import com.example.myapplication.user.KamusActivity;
import com.example.myapplication.user.PenyakitActivity;

import static com.example.myapplication.user.KamusActivity.TAG_ID;

public class MainActivity extends AppCompatActivity {

    CardView cardViewKamus;
    CardView cardViewPenyakit;
    CardView cardViewDiagnosa;
    CardView cardViewHelp;
//    CardView cardViewAbout;
    CardView cardViewHistory;
    ImageView logout;
    SharedPreferences sharedPreferences;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        logout = findViewById(R.id.logout);
        cardViewDiagnosa = findViewById(R.id.cardView1);
        cardViewKamus = findViewById(R.id.cardView2);
        cardViewPenyakit = findViewById(R.id.cardView3);
        cardViewHelp = findViewById(R.id.cardView5);
//        cardViewAbout = findViewById(R.id.cardView6);
        cardViewHistory = findViewById(R.id.cardView4);
        cardViewDiagnosa.setOnClickListener(new Gejala());
        cardViewPenyakit.setOnClickListener(new Penyakit());
        cardViewKamus.setOnClickListener(new Kamus());
        cardViewHelp.setOnClickListener(new Help());
//        cardViewAbout.setOnClickListener(new About());
        cardViewHistory.setOnClickListener(new History());
//        logout.setOnClickListener(new Logout());
        sharedPreferences = getSharedPreferences(LoginActivity.shared_preferences, Context.MODE_PRIVATE);

    }

    class Kamus implements View.OnClickListener {
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, KamusActivity.class);
            startActivity(intent);
        }
    }

    class Penyakit implements View.OnClickListener {
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, PenyakitActivity.class);
            startActivity(intent);
        }
    }

    class Gejala implements View.OnClickListener {
        public void onClick(View view) {
            int id = 17;
            Intent intent = new Intent(MainActivity.this, DiagnosaActvitity.class);
            intent.putExtra("gejala", id);
            startActivity(intent);
        }
    }

    class Help implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(intent);
        }
    }

//    class About implements View.OnClickListener {
//
//        @Override
//        public void onClick(View view) {
//            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
//            startActivity(intent);
//        }
//    }

    class History implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(intent);
        }
    }

//    class Logout implements View.OnClickListener {
//
//        @Override
//        public void onClick(View view) {
//            SharedPreferences.Editor editor = sharedPreferences.edit();
//            editor.putBoolean(LoginActivity.session_status, false);
//                editor.putString(TAG_ID, null);
//                editor.commit();
//
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//                finish();
//        }
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.logout_menu, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//            case R.id.log_out:
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.putBoolean(LoginActivity.session_status, false);
//                editor.putString(TAG_ID, null);
//                editor.commit();
//
//                Intent intent = new Intent(this, LoginActivity.class);
//                startActivity(intent);
//                finish();
//                return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}