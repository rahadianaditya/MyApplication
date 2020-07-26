package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.login.LoginActivity;
import com.example.myapplication.user.DiagnosaActvitity;
import com.example.myapplication.user.KamusActivity;
import com.example.myapplication.user.PenyakitActivity;

import java.util.prefs.Preferences;

import static com.example.myapplication.user.KamusActivity.TAG_ID;

public class MainActivity extends AppCompatActivity {

    CardView cardViewKamus;
    CardView cardViewPenyakit;
    CardView cardViewGejala;
    SharedPreferences sharedPreferences;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewGejala = findViewById(R.id.cardView1);
        cardViewKamus = findViewById(R.id.cardView2);
        cardViewPenyakit = findViewById(R.id.cardView3);
        cardViewGejala.setOnClickListener(new Gejala());
        cardViewPenyakit.setOnClickListener(new Penyakit());
        cardViewKamus.setOnClickListener(new Kamus());
        sharedPreferences = getSharedPreferences(LoginActivity.shared_preferences, Context.MODE_PRIVATE);

    }
    class Kamus implements View.OnClickListener{
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this, KamusActivity.class);
            startActivity(intent);
        }
    }
    class Penyakit implements View.OnClickListener{
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this, PenyakitActivity.class);
            startActivity(intent);
        }
    }
    class Gejala implements View.OnClickListener{
        public void onClick(View view){
            int id = 17;
            Intent intent = new Intent(MainActivity.this, DiagnosaActvitity.class);
            intent.putExtra("gejala", id);
            startActivity(intent);
//            Intent intent = new Intent(MainActivity.this, DiagnosaActvitity.class);
//            startActivity(intent);
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            builder.setTitle("Blabla");
//            builder.setMessage("Ya masuk ke G30")
//                    .setCancelable(false)
//                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            int id = 30;
//                            Intent intent = new Intent(MainActivity.this, DiagnosaActvitity.class);
//                            intent.putExtra("gejala", id);
//                            startActivity(intent);
//                        }
//                    })
//                    .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            int id = 17;
//                            Intent intent = new Intent(MainActivity.this, DiagnosaActvitity.class);
//                            intent.putExtra("gejala", id);
//                            startActivity(intent);
//                        }
//                    });
//
//            AlertDialog alertDialog = builder.create();
//            alertDialog.show();

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.log_out:
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean(LoginActivity.session_status, false);
                editor.putString(TAG_ID, null);
                editor.commit();

                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}