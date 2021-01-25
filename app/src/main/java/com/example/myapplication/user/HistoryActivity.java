package com.example.myapplication.user;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterHistory;
import com.example.myapplication.controller.Controller;
import com.example.myapplication.model.Data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HistoryActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{

    ProgressDialog dialog;
    public static ArrayList<Data> dataList = new ArrayList<>();
    AdapterHistory adapter;
    SwipeRefreshLayout swipe;
    ListView listView;

    public static final String url_view = "http://192.168.1.11/android/viewHist.php";

    private static final String TAG = HistoryActivity.class.getSimpleName();

    public static final String TAG_ID = "id";
    public static final String TAG_ID_HIST = "id_hasil";
    public static final String TAG_HIST = "hasil";
    public static final String TAG_TGL = "tanggal";
    public static final String TAG_HASIL = "results";
    public static final String TAG_PESAN = "message";
    public static final String TAG_VALUE = "value";

    String tag_json_obj = "json_obj_req";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        listView = (ListView) findViewById(R.id.list_view2);
        adapter = new AdapterHistory(HistoryActivity.this, dataList);
        listView.setAdapter(adapter);

        swipe.setOnRefreshListener(this);

        swipe.post(new Runnable() {
                       @Override
                       public void run() {
                           swipe.setRefreshing(true);
                           getData();
                       }
                   }
        );
    }

    private void getData() {
        dataList.clear();
        adapter.notifyDataSetChanged();
        swipe.setRefreshing(true);

        // Creating volley request obj
        JsonArrayRequest jArr = new JsonArrayRequest(url_view, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {
                Log.e(TAG, response.toString());

                // Parsing json
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject obj = response.getJSONObject(i);

                        Data item = new Data();

                        item.setId(obj.getString(TAG_ID_HIST));
                        item.setHasil(obj.getString(TAG_HIST));
                        item.setTanggal(obj.getString(TAG_TGL));

                        dataList.add(item);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                // notifying list adapter about data changes
                // so that it renders the list view with updated data
                adapter.notifyDataSetChanged();
                swipe.setRefreshing(false);
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e(TAG, "Error: " + error.getMessage());
                Toast.makeText(HistoryActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                swipe.setRefreshing(false);
            }
        });

        // Adding request to request queue
        Controller.getInstance().addToRequestQueue(jArr);
    }

    @Override
    public void onRefresh() {
        getData();
    }
}
