package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Fragment1 fragment;
    Fragment fragment1,fragment2,fragment3,fragment4;

    FragmentManager fm;
    FragmentTransaction ft;
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragment3=new Fragment3();
        fragment4=new Fragment4();
        linearLayout1=findViewById(R.id.LinearLayout1);
        linearLayout2=findViewById(R.id.LinearLayout2);
        linearLayout3=findViewById(R.id.LinearLayout3);
        linearLayout4=findViewById(R.id.LinearLayout4);
        fm=getSupportFragmentManager();
        initial();
        fragmenthide();
        fragmentshow(fragment1);
        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);
    }

    private void fragmenthide() {
        FragmentTransaction ft=fm.beginTransaction()
                .hide(fragment1)
                .hide(fragment2)
                .hide(fragment3)
                .hide(fragment4);
        ft.commit();

    }

    private void initial() {
        FragmentTransaction ft=fm.beginTransaction()
                .add(R.id.content1,fragment1)
                .add(R.id.content1,fragment2)
                .add(R.id.content1,fragment3)
                .add(R.id.content1,fragment4);
        ft.commit();
    }

    @Override
    public void onClick(View view){
        fragmenthide();


        if(view.getId()== R.id.LinearLayout1){
            fragmenthide();
            fragmentshow(fragment1);
        }
        if(view.getId()==R.id.LinearLayout2){
            fragmenthide();
            fragmentshow(fragment2);
        }
        if(view.getId()==R.id.LinearLayout3){
            fragmenthide();
            fragmentshow(fragment3);
        }
        if(view.getId()==R.id.LinearLayout4){
            fragmenthide();
            fragmentshow(fragment4);
        }


    }

    private void fragmentshow(Fragment fragment) {
        FragmentTransaction transaction=fm.beginTransaction()
                .show(fragment);
        transaction.commit();
    }
}