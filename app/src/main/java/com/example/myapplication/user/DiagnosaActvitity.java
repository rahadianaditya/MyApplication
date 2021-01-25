package com.example.myapplication.user;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class DiagnosaActvitity extends AppCompatActivity {

    private static StringRequest stringRequest;
    private static ArrayList<HashMap<String, String>> list_data;
    TextView gejala1;
    TextView penyakit1;
    TextView deskripsi1;
    public int getGejala;
    public int getPenyakit;
    public int getDeskripsi;
    RadioButton rbYa;
    RadioButton rbTidak;
    public static final String url_gejala = "http://192.168.1.11/android/getGejala.php?id_gejala=";
    public static final String url_penyakit = "http://192.168.1.11/android/getPenyakit.php?id_penyakit=";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        gejala1 = findViewById(R.id.textView1);
        penyakit1 = findViewById(R.id.textView2);
//        deskripsi1 = findViewById(R.id.textView3);
        rbYa = findViewById(R.id.rbYa);
        rbYa.setOnCheckedChangeListener(new radioCheck());
        rbTidak = findViewById(R.id.rbTidak);
        rbTidak.setOnCheckedChangeListener(new radioCheck());
        Intent intent = getIntent();
        getGejala = intent.getIntExtra("gejala", 0);
        getPenyakit = intent.getIntExtra("penyakit", 0);
        getDeskripsi = intent.getIntExtra("deskripsi", 0);
        getPenyakit();
        getGejala();
        getDeskripsi();
    }
        class radioCheck implements CompoundButton.OnCheckedChangeListener{

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(getGejala == 17 && rbYa.isChecked()){
                    int id = 30;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 17 && rbTidak.isChecked()){
                    int id = 2;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 30 && rbYa.isChecked()){
                    int id = 23;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 30 && rbTidak.isChecked()){
                    int id = 1;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 23 && rbTidak.isChecked()) {
                    int id = 28;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 23 && rbYa.isChecked()) {
                    int id = 48;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 28 && rbYa.isChecked()) {
                    int id = 42;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 28 && rbTidak.isChecked()) {
                    int id_penyakit = 15;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 42 && rbYa.isChecked()) {
                    int id = 43;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 42 && rbTidak.isChecked()) {
                    int id_penyakit = 15;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 43 && rbTidak.isChecked()) {
                    int id_penyakit = 15;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 43 && rbYa.isChecked()) {
                    int id_penyakit = 15;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 48 && rbYa.isChecked()){
                    int id = 54;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 54 && rbYa.isChecked()) {
                    int id = 60;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 54 && rbTidak.isChecked()) {
                    int id_penyakit = 4;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 60 && rbYa.isChecked()) {
                    int id = 41;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 60 && rbTidak.isChecked()) {
                    int id_penyakit = 4;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 41 && rbYa.isChecked()) {
                    int id = 55;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 41 && rbTidak.isChecked()) {
                    int id = 20;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 48 && rbTidak.isChecked()){
                    int id = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 13 && rbYa.isChecked()){
                    int id = 19;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 13 && rbTidak.isChecked()){
                    int id = 31;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 31 && rbYa.isChecked()){
                    int id = 25;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 31 && rbTidak.isChecked()){
                    int id_penyakit = 8;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 25 && rbYa.isChecked()){
                    int id = 24;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 25 && rbTidak.isChecked()){
                    int id_penyakit = 8;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 24 && rbTidak.isChecked()){
                    int id_penyakit = 8;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 24 && rbYa.isChecked()){
                    int id_penyakit = 8;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 16 && rbYa.isChecked()){
                    int id = 10;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 16 && rbTidak.isChecked()){
                    int id_penyakit = 6;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 10 && rbYa.isChecked()){
                    int id = 15;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 10 && rbTidak.isChecked()){
                    int id_penyakit = 6;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 15 && rbYa.isChecked()){
                    int id_penyakit = 6;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 15 && rbTidak.isChecked()){
                    int id_penyakit = 6;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 2 && rbYa.isChecked()){
                    int id = 7;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 2 && rbTidak.isChecked()){
                    int id = 41;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 7 && rbYa.isChecked()){
                    int id = 8;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 7 && rbTidak.isChecked()){
                    int id_penyakit = 10;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 8 && rbYa.isChecked()){
                    int id_penyakit = 2;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 8 && rbTidak.isChecked()){
                    int id_penyakit = 14;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 61 && rbYa.isChecked()){
                    int id_penyakit = 9;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 61 && rbTidak.isChecked()){
                    int id_penyakit = 11;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 20 && rbYa.isChecked()){
                    int id_penyakit = 1;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 20 && rbTidak.isChecked()){
                    int id = 26;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 34 && rbYa.isChecked()){
                    int id = 33;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 34 && rbTidak.isChecked()){
                    int id_penyakit = 16;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 33 && rbYa.isChecked()){
                    int id = 6;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 33 && rbTidak.isChecked()){
                    int id_penyakit = 7;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 6 && rbYa.isChecked()){
                    int id_penyakit = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 6 && rbTidak.isChecked()){
                    int id_penyakit = 5;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 1 && rbYa.isChecked()){
                    int id_penyakit = 12;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 1 && rbTidak.isChecked()){
                    int id_penyakit = 3;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 3 && rbYa.isChecked()){
                    int id = 21;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 3 && rbTidak.isChecked()){
                    int id_penyakit = 1;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 4 && rbYa.isChecked()){
                    int id_penyakit = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 4 && rbTidak.isChecked()){
                    int id_penyakit = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 5 && rbYa.isChecked()){
                    int id = 58;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 5 && rbTidak.isChecked()){
                    int id_penyakit = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 6 && rbYa.isChecked()){
                    int id = 12;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 6 && rbTidak.isChecked()){
                    int id = 14;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 9 && rbYa.isChecked()){
                    int id = 40;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 9 && rbTidak.isChecked()){
                    int id_penyakit = 14;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 11 && rbYa.isChecked()){
                    int id = 4;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 11 && rbTidak.isChecked()){
                    int id_penyakit = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 12 && rbYa.isChecked()){
                    int id = 5;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 12 && rbTidak.isChecked()){
                    int id_penyakit = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 14 && rbYa.isChecked()){
                    int id = 49;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 14 && rbTidak.isChecked()){
                    int id_penyakit = 5;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 18 && rbYa.isChecked()){
                    int id = 44;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 18 && rbTidak.isChecked()){
                    int id_penyakit = 12;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 19 && rbYa.isChecked()){
                    int id = 16;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 19 && rbTidak.isChecked()){
                    int id_penyakit = 6;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 21 && rbYa.isChecked()){
                    int id_penyakit = 1;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 21 && rbTidak.isChecked()){
                    int id_penyakit = 1;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 22 && rbYa.isChecked()){
                    int id = 24;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 22 && rbTidak.isChecked()){
                    int id_penyakit = 1;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 26 && rbYa.isChecked()) {
                    int id = 34;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 26 && rbTidak.isChecked()){
                    int id_penyakit = 17;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 29 && rbYa.isChecked()){
                    int id_penyakit = 10;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 29 && rbTidak.isChecked()){
                    int id_penyakit = 10;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 32 && rbYa.isChecked()){
                    int id = 29;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 32 && rbTidak.isChecked()){
                    int id_penyakit = 10;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 35 && rbYa.isChecked()){
                    int id = 37;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 35 && rbTidak.isChecked()){
                    int id_penyakit = 7;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 36 && rbYa.isChecked()){
                    int id = 38;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 36 && rbTidak.isChecked()){
                    int id_penyakit = 10;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 37 && rbYa.isChecked()){
                    int id_penyakit = 7;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 37 && rbTidak.isChecked()){
                    int id_penyakit = 7;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 38 && rbYa.isChecked()){
                    int id = 32;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 38 && rbTidak.isChecked()){
                    int id_penyakit = 10;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 39 && rbYa.isChecked()){
                    int id_penyakit = 11;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 39 && rbTidak.isChecked()){
                    int id_penyakit = 11;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 40 && rbYa.isChecked()){
                    int id = 59;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 40 && rbTidak.isChecked()){
                    int id_penyakit = 14;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 44 && rbYa.isChecked()){
                    int id_penyakit = 12;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 44 && rbTidak.isChecked()){
                    int id_penyakit = 12;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 45 && rbYa.isChecked()){
                    int id = 46;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 45 && rbTidak.isChecked()){
                    int id_penyakit = 3;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 46 && rbYa.isChecked()){
                    int id = 47;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 46 && rbTidak.isChecked()){
                    int id_penyakit = 3;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 47 && rbYa.isChecked()){
                    int id_penyakit = 3;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 47 && rbTidak.isChecked()){
                    int id_penyakit = 3;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 49 && rbYa.isChecked()){
                    int id_penyakit = 5;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 49 && rbTidak.isChecked()){
                    int id_penyakit = 5;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 50 && rbYa.isChecked()){
                    int id = 52;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 50 && rbTidak.isChecked()){
                    int id_penyakit = 9;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 51 && rbYa.isChecked()){
                    int id = 53;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 51 && rbTidak.isChecked()){
                    int id_penyakit = 16;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 52 && rbYa.isChecked()){
                    int id_penyakit = 9;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 52 && rbTidak.isChecked()){
                    int id_penyakit = 9;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 53 && rbYa.isChecked()){
                    int id = 57;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 53 && rbTidak.isChecked()){
                    int id_penyakit = 16;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 55 && rbYa.isChecked()){
                    int id = 50;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 55 && rbTidak.isChecked()){
                    int id_penyakit = 9;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 56 && rbYa.isChecked()){
                    int id = 45;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 56 && rbTidak.isChecked()){
                    int id_penyakit = 3;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 57 && rbYa.isChecked()){
                    int id_penyakit = 9;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 57 && rbTidak.isChecked()){
                    int id_penyakit = 9;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 58 && rbYa.isChecked()){
                    int id = 11;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 58 && rbTidak.isChecked()){
                    int id_penyakit = 13;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 59 && rbYa.isChecked()){
                    int id_penyakit = 14;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }else if(getGejala == 59 && rbTidak.isChecked()){
                    int id_penyakit = 14;
                    Intent intent = new Intent(DiagnosaActvitity.this, HasilActivity.class);
                    intent.putExtra("penyakit", id_penyakit);
                    intent.putExtra("deskripsi", id_penyakit);
                    startActivity(intent);
                }
            }
    }

    void getGejala(){
        list_data = new ArrayList<HashMap<String, String>>();
        RequestQueue requestQueue = Volley.newRequestQueue(DiagnosaActvitity.this);
        String url = url_gejala + getGejala;
        System.out.println(url);
        System.out.println(getGejala);
        stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                        JSONArray jsonArray = new JSONArray(response);
                    for (int a = 0; a < jsonArray.length(); a ++){

                         JSONObject jsonObject = jsonArray.getJSONObject(a);
                         String gejala = jsonObject.getString("gejala");
                         Log.d("gejala","gejala" + gejala);
                         if (getGejala == 17){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if (getGejala == 30){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 23){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 2){
                             gejala1.setText("Apakah ada "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 1){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 28){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 48){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 13){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 7){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 41){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 8){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 36){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 61){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 20){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 9){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 34){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 33){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 6){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 3){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 4){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 5){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 10){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 11){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 12){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 14){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 15){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 16){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 18){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 19){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 21){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 22){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 24){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 25){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 26){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 27){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 29){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 31){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 32){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 35){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 37){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 38){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 39){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 40){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 42){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 43){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 44){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 45){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 46){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 47){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 49){
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 50){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 51){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 52){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 53){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 54){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 55){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 56){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 57){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 58){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 59){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 60){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }else if(getGejala == 61){
                             gejala1.setText("Apakah "+String.valueOf(gejala)+"?");
                         }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DiagnosaActvitity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(stringRequest);
    }
    void getPenyakit(){
        list_data = new ArrayList<HashMap<String, String>>();
        RequestQueue requestQueue = Volley.newRequestQueue(DiagnosaActvitity.this);
        String url = url_penyakit + getPenyakit;
        System.out.println(url);
        System.out.println(getPenyakit);
        stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONArray(response);
                    for (int a = 0; a < jsonArray.length(); a ++){

                        JSONObject jsonObject = jsonArray.getJSONObject(a);
                        String penyakit = jsonObject.getString("penyakit");
                        Log.d("penyakit","penyakit" + penyakit);
                        if (getPenyakit == 4){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 1){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 2){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 3){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 5){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 6){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 7){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 8){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 9){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 10){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 11){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 12){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 13){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 14){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 15){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 16){
                            penyakit1.setText(String.valueOf(penyakit));
                        }else if(getPenyakit == 17){
                            penyakit1.setText(String.valueOf(penyakit));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DiagnosaActvitity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(stringRequest);
    }

    void getDeskripsi(){
        list_data = new ArrayList<HashMap<String, String>>();
        RequestQueue requestQueue = Volley.newRequestQueue(DiagnosaActvitity.this);
        String url = url_penyakit + getDeskripsi;
        System.out.println(url);
        System.out.println(getDeskripsi);
        stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONArray(response);
                    for (int a = 0; a < jsonArray.length(); a ++){

                        JSONObject jsonObject = jsonArray.getJSONObject(a);
                        String deskripsi = jsonObject.getString("deskripsi");
                        Log.d("deskripsi","deskripsi" + deskripsi);
                        if (getDeskripsi == 4){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 1){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 2){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 3){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 5){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 6){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 7){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 8){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 9){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 10){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 11){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 12){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 13){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 14){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 15){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 16){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }else if(getDeskripsi == 17){
                            deskripsi1.setText(String.valueOf(deskripsi));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DiagnosaActvitity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(stringRequest);
    }

        public void onBackPressed() {
            Intent intent = new Intent(DiagnosaActvitity.this, MainActivity.class);
            startActivity(intent);
        }
}



