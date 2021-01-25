package com.example.myapplication.user;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import com.example.myapplication.controller.Controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolusiActivity extends AppCompatActivity {

    TextView detailPenyakit;
    TextView detailSolusi;
    public int getPenyakit;
    public int getSolusi;
    int success;
    private static StringRequest stringRequest;
    private static ArrayList<HashMap<String, String>> list_data;
    public static final String url_penyakit = "http://192.168.1.11/android/getPenyakit.php?id_penyakit=";
    public static final String url_history = "http://192.168.1.11/android/addHist.php";
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";
    String tag_json_obj = "json_obj_req";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solusi);

        detailPenyakit = findViewById(R.id.detailPenyakit);
        detailSolusi = findViewById(R.id.detailSolusi);
//        imageView = findViewById(R.id.imageView);
        Intent intent = getIntent();
        getPenyakit = intent.getIntExtra("penyakit", 0);
        getSolusi = intent.getIntExtra("solusi", 0);
//        getImage = intent.getIntExtra("image", 0);
        getPenyakit();
        getSolusi();

    }

    private void checkRegister(final String hasil) {

        StringRequest strReq = new StringRequest(Request.Method.POST, url_history, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jObj = new JSONObject(response);
                    success = jObj.getInt(TAG_SUCCESS);

                    // Check for error node in json
                    if (success == 1) {

                        Log.e("Successfully Register!", jObj.toString());

                        Toast.makeText(getApplicationContext(),
                                jObj.getString(TAG_MESSAGE), Toast.LENGTH_LONG).show();

                        detailPenyakit.setText("");

                    } else {
                        Toast.makeText(getApplicationContext(),
                                jObj.getString(TAG_MESSAGE), Toast.LENGTH_LONG).show();

                    }
                } catch (JSONException e) {
                    // JSON error
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("hasil", hasil);

                return params;
            }

        };

        // Adding request to request queue
        Controller.getInstance().addToRequestQueue(strReq, tag_json_obj);
    }

    void getPenyakit(){
        list_data = new ArrayList<HashMap<String, String>>();
        RequestQueue requestQueue = Volley.newRequestQueue(SolusiActivity.this);
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
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.enteritis);
                        }else if(getPenyakit == 1){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.diabetes);
                        }else if(getPenyakit == 2){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.mikosis_2);
                        }else if(getPenyakit == 3){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.otitis);
                        }else if(getPenyakit == 5){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.asma);
                        }else if(getPenyakit == 6){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.flutd);
                        }else if(getPenyakit == 7){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.flu);
                        }else if(getPenyakit == 8){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.lambung);
                        }else if(getPenyakit == 9){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.gastritis);
                        }else if(getPenyakit == 10){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.kutu_kucing);
                        }else if(getPenyakit == 11){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.diare);
                        }else if(getPenyakit == 12){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.lambung);
                        }else if(getPenyakit == 13){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.rhinitis);
                        }else if(getPenyakit == 14){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.scabies);
                        }else if(getPenyakit == 15){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.toxoplasmosis);
                        }else if(getPenyakit == 16){
                            detailPenyakit.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.pcd);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SolusiActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(stringRequest);
    }

    void getSolusi(){
        list_data = new ArrayList<HashMap<String, String>>();
        RequestQueue requestQueue = Volley.newRequestQueue(SolusiActivity.this);
        String url = url_penyakit + getSolusi;
        System.out.println(url);
        System.out.println(getSolusi);
        stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonArray = new JSONArray(response);
                    for (int a = 0; a < jsonArray.length(); a ++){

                        JSONObject jsonObject = jsonArray.getJSONObject(a);
                        String solusi = jsonObject.getString("solusi");
                        Log.d("solusi","solusi" + solusi);
                        if (getSolusi == 4){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 1){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 2){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 3){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 5){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 6){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 7){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 8){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 9){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 10){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 11){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 12){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 13){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 14){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 15){
                            detailSolusi.setText(String.valueOf(solusi));
                        }else if(getSolusi == 16){
                            detailSolusi.setText(String.valueOf(solusi));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SolusiActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(stringRequest);
    }

    public void onBackPressed() {
        Intent intent = new Intent(SolusiActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
