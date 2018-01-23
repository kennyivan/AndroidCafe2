package com.example.a207_1.androidcafe2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;


/**
 * Created by 207-1 on 19/01/2018.
 */

public class DetailActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //Retrive the data coming from MainActivity.java
        Menu menu = getIntent().getParcelableExtra("menu");
        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentDetail detailFragment = (FragmentDetail)fragmentManager.findFragmentById(R.id.fragmentD);
        detailFragment.displayData(menu);
    }
}
