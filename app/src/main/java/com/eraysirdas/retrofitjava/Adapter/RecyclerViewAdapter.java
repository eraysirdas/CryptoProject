package com.eraysirdas.retrofitjava.Adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eraysirdas.retrofitjava.Model.CryptoModel;
import com.eraysirdas.retrofitjava.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    private ArrayList<CryptoModel> cryptoModelArrayList;
    private String[] colors = {"#ffbc0d","#d27c60","#16537e","#5a8200","#00cccc","#a2798f","#97a79e","#ffec02"};

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoModelArrayList) {
        this.cryptoModelArrayList = cryptoModelArrayList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoModelArrayList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptoModelArrayList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        TextView textName,textPrice;
        public RowHolder(@NonNull View itemView) {
            super(itemView);

        }

        public void bind(CryptoModel cryptoModel,String[] colors,Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]));
            textName = itemView.findViewById(R.id.textName);
            textPrice = itemView.findViewById(R.id.textPrice);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);
        }
    }
}
