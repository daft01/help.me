package com.firstapp.helpme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resourcesButtonClicked(View v){
        startActivity(new Intent(MainActivity.this, ResourcesActivity.class));
    }

    public void settingsButtonClicked(View v){
        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
    }

    public void lifeThreateningEmergencyOnClicked(View v){
        startActivity(new Intent(MainActivity.this, LifeThreateningAmergency.class));
    }

    public void saveButtonClicked(View v){
        startActivity(new Intent(MainActivity.this, MapsActivity.class));
    }


}
