package com.example.bharg.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class productadapter extends ArrayAdapter<product> {
    private final Context context;
    private final ArrayList<product> value;

    public productadapter(Context context, ArrayList<product> list) {
        super(context,R.layout.row_layout,list);
        this.context = context;
        this.value = list;
    }
    @NonNull
    @Override
    public View getView(int postion, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View rowview=inflater.inflate(R.layout.row_layout,parent,false);

        TextView tvProduct =(TextView) rowview.findViewById(R.id.tv_product);
        TextView tvPrice = (TextView)rowview.findViewById(R.id.tv_price);
        TextView tvDecs= (TextView)rowview.findViewById(R.id.tv_decs);
        ImageView  ivProduct= (ImageView)rowview.findViewById(R.id.iv);

        tvProduct.setText(value.get(postion).getTitle());
        tvPrice.setText("R"+value.get(postion).getPrice());
        tvDecs.setText(value.get(postion).getDesc());

        return rowview;
    }
}
