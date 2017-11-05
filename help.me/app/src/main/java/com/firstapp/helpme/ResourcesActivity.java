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
        resourceDetails = new HashMap<>();
        resourceDetails.put("Burns","burnDetails");
        resourceDetails.put("Cuts","cutsDetails");
    }

    public void resourcesButtonClicked(View v){
        Intent intent = new Intent(ResourcesActivity.this, MedicalDetailsActivity.class);
        Button b = (Button) v;
        intent.putExtra("type", b.getText());
        String details = resourceDetails.get(b.getText());
        if(details == null) {
            details = "empty string";
        }
        intent.putExtra("details", details);
        startActivity(intent);
    }


}
