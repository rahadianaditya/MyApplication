package com.example.myapplication.user;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.adapter.Adapter;
import com.example.myapplication.controller.Controller;
import com.example.myapplication.model.Data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiagnosaActvitity extends AppCompatActivity {

    private static StringRequest stringRequest;
    private static ArrayList<HashMap<String, String>> list_data;
    TextView gejala1;
    public int getGejala;
    RadioButton rbYa;
    RadioButton rbTidak;
    int position;
    public static final String url_gejala = "http://192.168.1.5/android/getGejala.php?id_gejala=";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        gejala1 = findViewById(R.id.textView1);
        rbYa = findViewById(R.id.rbYa);
        rbYa.setOnCheckedChangeListener(new radioCheck());
        rbTidak = findViewById(R.id.rbTidak);
        rbTidak.setOnCheckedChangeListener(new radioCheck());
        Intent intent = getIntent();
        getGejala = intent.getIntExtra("gejala", 0);
        getData();
    }
        class radioCheck implements CompoundButton.OnCheckedChangeListener{

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(getGejala == 17 && rbYa.isChecked()){
                    int id = 30;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }else if(getGejala == 17 || rbTidak.isChecked()){
                    int id = 2;
                    Intent intent = new Intent(DiagnosaActvitity.this, DiagnosaActvitity.class);
                    intent.putExtra("gejala", id);
                    startActivity(intent);
                }
            }
    }

    void getData(){
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
                             gejala1.setText("Apakah kucing anda "+String.valueOf(gejala)+"?");
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

}



