package com.example.bharg.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class personAdapter extends RecyclerView.Adapter<personAdapter.viewholder>
{
    private ArrayList<person> people;
    public personAdapter(Context context,ArrayList<person> list){
        people = list;

    }
    public  class  viewholder extends RecyclerView.ViewHolder{

        ImageView ivPref;
        TextView tvName,tvSurname;
        public viewholder(View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvSurname=itemView.findViewById(R.id.tvSurname);
            ivPref=itemView.findViewById(R.id.ivPref);

        }
    }
    @NonNull
    @Override
    public personAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.listitems,parent,false);

        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull personAdapter.viewholder holder, int position) {
        holder.itemView.setTag(people.get(position));
        holder.tvName.setText(people.get(position).getName());
        holder.tvSurname.setText(people.get(position).getSurname());

        if(people.get(position).getPreference().equals("bus")){
            holder.ivPref.setImageResource(R.drawable.bus);
        }
        else{
            holder.ivPref.setImageResource(R.drawable.ic_airplanemode_active_black_24dp);
        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
