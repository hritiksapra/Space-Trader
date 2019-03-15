package com.gitschwifty.cs2340.gatech.space_trader.ViewModel;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.gitschwifty.cs2340.gatech.space_trader.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    String TAG = "RecyclerViewAdapter";

    public RecyclerViewAdapter(ArrayList<String> item_names, Context mcontext) {
        this.item_names = item_names;
        this.mcontext = mcontext;
    }

    private ArrayList<String> item_names = new ArrayList<String>();
    private Context mcontext;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_buyitem_list ,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

        Log.d(TAG, "onBindView Holder Called");

        holder.parent_Layout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Toast.makeText(mcontext, "Item Added", Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    public int getItemCount() {
        return item_names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView item_name;
        RelativeLayout parent_Layout;
        public ViewHolder( View itemView) {
            super(itemView);
            item_name = itemView.findViewById(R.id.itemname);
            parent_Layout = itemView.findViewById(R.id.parent_layout);

        }
    }


}