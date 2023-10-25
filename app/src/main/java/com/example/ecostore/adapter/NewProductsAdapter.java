package com.example.ecostore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ecostore.R;
import com.example.ecostore.models.NewProductsModel;

import java.util.List;

public class NewProductsAdapter extends RecyclerView.Adapter<NewProductsAdapter.ViewHolder> {

    private Context context;
    private List<NewProductsModel> list;

    public NewProductsAdapter(Context context, List<NewProductsModel> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public NewProductsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new  ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.new_products, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NewProductsModel item = list.get(position);

        // Check for null values to avoid potential NullPointerExceptions
        if (item != null) {
            Glide.with(context).load(item.getImg_url()).into(holder.newImg);
            holder.newName.setText(item.getName());
            holder.newPrice.setText(String.valueOf(item.getPrice()));
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        ImageView newImg;
        TextView newName,newPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            newImg = itemView.findViewById(R.id.new_img);
            newName = itemView.findViewById(R.id.new_product_name);
            newPrice = itemView.findViewById(R.id.new_price);

        }
    }
}
