package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;
import java.util.zip.Inflater;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myholder> {

    Context context1;
    List<String> list1;


    public Myadapter(Context context, List list){
        context1=context;
        list1=list;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context1).inflate(R.layout.item,parent,false);

        Myholder myholder=new Myholder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {

        holder.textView.setText(list1.get(position));


    }

    @Override
    public int getItemCount() {
        return list1.size();
    }
    protected class Myholder extends RecyclerView.ViewHolder {
        TextView textView;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView6);
        }
    }
}