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

    public void resourcesButtonClicked(View v){
       intent.putExtra("num", 7);
       startActivity(intent);
    }


}
