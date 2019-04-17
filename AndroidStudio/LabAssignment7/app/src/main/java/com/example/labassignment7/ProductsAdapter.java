package com.example.labassignment7;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {
    // Store a member variable for the products
    private ArrayList<String> mDataset;
    // Pass in the products array into the constructor
    public ProductsAdapter(ArrayList<String> products) {
        mDataset = products;
    }

    // Class ViewHolder Provide a reference to the views for each data item
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public TextView priceTextView;
        public ImageView imageView;
    // Constructor accepts the entire item row
    public ViewHolder(View itemView) {
        super(itemView);
        imageView =  itemView.findViewById(R.id.imageView);
        nameTextView =  itemView.findViewById(R.id.textView);
        priceTextView =  itemView.findViewById(R.id.textView2);
     }
    }

    @Override
    public ProductsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View productView = inflater.inflate(R.layout.row_layout, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(productView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ProductsAdapter.ViewHolder viewHolder, int position) {
         // Get the data row based on position
        String product = mDataset.get(position);

        // Set item views for the given data row
        ImageView imageView = viewHolder.imageView;
        imageView.setImageResource(R.drawable.food_crab);
        TextView textView = viewHolder.nameTextView;
        textView.setText(product);
        TextView textView2 = viewHolder.priceTextView;
        textView2.setText("$23.15");
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount(){
        return mDataset.size();
    }
}