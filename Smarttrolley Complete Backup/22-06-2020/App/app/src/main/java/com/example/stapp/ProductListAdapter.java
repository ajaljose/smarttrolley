package com.example.stapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ViewHolder>{
    private ProductListData[] listdata;

    public ProductListAdapter(ProductListData[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.productlistlayout, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ProductListData myListData = listdata[position];
        holder.prodcutname.setText(listdata[position].getPname());
        holder.brand.setText(listdata[position].getPbrand());
        holder.price.setText(listdata[position].getPprice());
        holder.block.setText(listdata[position].getBlock());
        holder.rack.setText(listdata[position].getRack());
        //holder.imageView.setImageResource(listdata[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getPname(),Toast.LENGTH_LONG).show();
            }
        });
    }





    @Override
    public int getItemCount() {

        return listdata.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView prodcutname, brand, price,block,rack;
        public LinearLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.pdtimg);
            this.prodcutname = (TextView) itemView.findViewById(R.id.pdtname);
            this.brand = (TextView) itemView.findViewById(R.id.bdname);
            this.price = (TextView) itemView.findViewById(R.id.price);
            this.block = (TextView) itemView.findViewById(R.id.block);
            this.rack = (TextView) itemView.findViewById(R.id.rack);
            relativeLayout = (LinearLayout) itemView.findViewById(R.id.recyclerproductlistlayout);
        }
    }
}
