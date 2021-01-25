package com.example.myapplication.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Data;

import java.util.List;

public class AdapterPenyakit extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> item;

    public AdapterPenyakit(Activity activity, List<Data> item) {
        this.activity = activity;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int location) {
        return item.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null){
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null){
            inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.list_penyakit, null);
            TextView txtPenyakit = (TextView) convertView.findViewById(R.id.txtPenyakit);
            txtPenyakit.setText(item.get(position).getPenyakit());
        }
        return convertView;
    }

}
