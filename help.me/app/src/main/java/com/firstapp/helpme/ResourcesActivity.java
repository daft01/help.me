package com.firstapp.helpme;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class ResourcesActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        intent = new Intent(getApplicationContext(), Results.class);
    }

    public void fracturesButtonClicked(View v){
       intent.putExtra("num", 7);
       startActivity(intent);
    }
    public void cutsButtonClicked(View v){
        intent.putExtra("num", 8);
        startActivity(intent);
    }
    public void burnsButtonClicked(View v){
        intent.putExtra("num", 9);
        startActivity(intent);
    }
    public void conscioussButtonClicked(View v){
        intent.putExtra("num", 10);
        startActivity(intent);
    }
    public void cprButtonClicked(View v){
        intent.putExtra("num", 11);
        startActivity(intent);
    }
    public void strokesButtonClicked(View v){
        intent.putExtra("num", 12);
        startActivity(intent);
    }
    public void crisisButtonClicked(View v){
        intent.putExtra("num", 13);
        startActivity(intent);
    }
    public void poisoningButtonClicked(View v){
        intent.putExtra("num", 14);
        startActivity(intent);
    }
    public void fluidsButtonClicked(View v){
        intent.putExtra("num", 15);
        startActivity(intent);
    }
    public void seizuresButtonClicked(View v){
        intent.putExtra("num", 16);
        startActivity(intent);
    }




}
