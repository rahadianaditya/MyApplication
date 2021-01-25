package com.example.myapplication.user;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

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

public class HasilActivity extends AppCompatActivity {

    TextView penyakit1;
    TextView deskripsi1;
    TextView detailPenyakit;
    ImageView imageView;
    AppCompatButton btnHist;
    Button btnDown;
    Button btnSolusi;
    CardView cardView2;
    public int getPenyakit;
    public int getDeskripsi;
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
        setContentView(R.layout.activity_hasil);

        detailPenyakit = findViewById(R.id.detailPenyakit);
        penyakit1 = findViewById(R.id.textView2);
        deskripsi1 = findViewById(R.id.textView3);
//        imageView = findViewById(R.id.imageView);
        btnHist = findViewById(R.id.btnHist);
        btnDown = findViewById(R.id.btnDown);
        cardView2 = findViewById(R.id.cardView2);
        btnSolusi = findViewById(R.id.btnSolusi);
        Intent intent = getIntent();
        getPenyakit = intent.getIntExtra("penyakit", 0);
        getDeskripsi = intent.getIntExtra("deskripsi", 0);
//        getImage = intent.getIntExtra("image", 0);
        getPenyakit();
        getDeskripsi();

        btnHist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String penyakit = penyakit1.getText().toString();
                checkRegister(penyakit);
                int id = 17;
                Intent intent = new Intent(HasilActivity.this, DiagnosaActvitity.class);
                intent.putExtra("gejala", id);
                startActivity(intent);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cardView2.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    cardView2.setVisibility(View.VISIBLE);
                    deskripsi1.setVisibility(View.VISIBLE);
                    btnDown.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else{
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    cardView2.setVisibility(View.GONE);
                    deskripsi1.setVisibility(View.GONE);
                    btnDown.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

        btnSolusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String penyakit = penyakit1.getText().toString();
                checkRegister(penyakit);
                if(getPenyakit == 1) {
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 2){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 3){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 4){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 5){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 6){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 7){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 8){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 9){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 10){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 11){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 12){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 13){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 14){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 15){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 16){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }else if(getPenyakit == 17){
                    Intent intent = new Intent(HasilActivity.this, SolusiActivity.class);
                    intent.putExtra("penyakit", getPenyakit);
                    intent.putExtra("solusi", getPenyakit);
                    startActivity(intent);
                }
            }
        });

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

                        penyakit1.setText("");

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
        RequestQueue requestQueue = Volley.newRequestQueue(HasilActivity.this);
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
//                            imageView.setImageResource(R.drawable.enteritis);
                        }else if(getPenyakit == 1){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.diabetes);
                        }else if(getPenyakit == 2){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.mikosis_2);
                        }else if(getPenyakit == 3){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.otitis);
                        }else if(getPenyakit == 5){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.asma);
                        }else if(getPenyakit == 6){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.flutd);
                        }else if(getPenyakit == 7){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.flu);
                        }else if(getPenyakit == 8){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.lambung);
                        }else if(getPenyakit == 9){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.gastritis);
                        }else if(getPenyakit == 10){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.kutu_kucing);
                        }else if(getPenyakit == 11){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.diare);
                        }else if(getPenyakit == 12){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.lambung);
                        }else if(getPenyakit == 13){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.rhinitis);
                        }else if(getPenyakit == 14){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.scabies);
                        }else if(getPenyakit == 15){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.toxoplasmosis);
                        }else if(getPenyakit == 16){
                            penyakit1.setText(String.valueOf(penyakit));
//                            imageView.setImageResource(R.drawable.pcd);
                        }else if(getPenyakit == 17){
                            penyakit1.setText(String.valueOf(penyakit));
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
                Toast.makeText(HasilActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(stringRequest);
    }

    void getDeskripsi(){
        list_data = new ArrayList<HashMap<String, String>>();
        RequestQueue requestQueue = Volley.newRequestQueue(HasilActivity.this);
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
                Toast.makeText(HasilActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(stringRequest);
    }

    public void onBackPressed() {
        String penyakit = penyakit1.getText().toString();
        checkRegister(penyakit);
        Intent intent = new Intent(HasilActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
