package com.example.stapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyCartListAdapter extends RecyclerView.Adapter<MyCartListAdapter.ViewHolder> {

    private MyCartListData[] listdata;

    public MyCartListAdapter(MyCartListData[] listdata) {
        this.listdata = listdata;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.cartlayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final MyCartListData myListData = listdata[position];
        holder.prodcutname.setText(listdata[position].getProductname());
        holder.brand.setText(listdata[position].getBrand());
        holder.price.setText(listdata[position].getPrice());
        //holder.imageView.setImageResource(listdata[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getProductname(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {

        return listdata.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView prodcutname, brand, price;
        public LinearLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.cartproductimg);
            this.prodcutname = (TextView) itemView.findViewById(R.id.cartproductname);
            this.brand = (TextView) itemView.findViewById(R.id.cartbrandname);
            this.price = (TextView) itemView.findViewById(R.id.cartprice);
            relativeLayout = (LinearLayout) itemView.findViewById(R.id.recyclermycartlayout);
        }
    }
}
