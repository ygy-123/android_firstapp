package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.*;

public class Fragment2 extends Fragment {
    Context context;
    List list;
    RecyclerView recyclerView;
    Myadapter myadapter;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab2, container, false);
        context = view.getContext();
        recyclerView = view.findViewById(R.id.recycleView);
        list = new ArrayList();
        for(int i=0;i<9;i++){
            list.add("这是第"+i+"行数据");}

        myadapter = new Myadapter(context, list);
        recyclerView.setAdapter(myadapter);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

        return view;


    }
}