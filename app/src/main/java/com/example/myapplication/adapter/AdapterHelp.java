package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.ItemHelp;

import java.util.ArrayList;

import ru.embersoft.expandabletextview.ExpandableTextView;

public class AdapterHelp extends RecyclerView.Adapter<AdapterHelp.ViewHolder> {

    private ArrayList<ItemHelp> items;
    private Context context;

    public AdapterHelp(ArrayList<ItemHelp> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterHelp.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_help,
                parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHelp.ViewHolder holder, final int position) {

        final ItemHelp item = items.get(position);
        holder.imageView.setImageResource(item.getImageResourse());
        holder.titleTextView.setText(item.getTitle());
        holder.descTextView.setText(item.getDesc());
        holder.descTextView.setOnStateChangeListener(new ExpandableTextView.OnStateChangeListener() {
            @Override
            public void onStateChange(boolean isShrink) {
                ItemHelp contentItem = items.get(position);
                contentItem.setShrink(isShrink);
                items.set(position, contentItem);
            }
        });
        holder.descTextView.setText(item.getDesc());
        holder.descTextView.resetState(item.isShrink());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        ExpandableTextView descTextView;
        TextView titleTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            descTextView = itemView.findViewById(R.id.descTextView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
        }
    }
}

