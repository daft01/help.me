package com.firstapp.helpme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class ResourcesActivity extends AppCompatActivity {
    HashMap<String,String> resourceDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
    }

    public void resourcesButtonClicked(View v){
        startActivity(new Intent(ResourcesActivity.this, MedicalDetailsActivity.class));
    }


}
