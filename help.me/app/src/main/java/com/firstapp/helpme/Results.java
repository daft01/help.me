package com.firstapp.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        TextView title = (TextView) findViewById(R.id.title);
        TextView help = (TextView) findViewById(R.id.help);
        Intent intent = getIntent();
        int num = intent.getIntExtra("num", 0);
        String str = "Here is Some Information While the Help Arrives";

        if(num == 1) {
            title.setText(str);
            help.setText("@string/walk");
        }
        else if(num ==2){
            title.setText(str);
            help.setText("");
        }
        else if(num ==3){
            title.setText(str);
            help.setText("");
        }
        else if(num ==4){
            title.setText(str);
            help.setText("");
        }
        else if(num ==5){
            title.setText(str);
            help.setText("");
        }
        else if(num ==6){
            title.setText(str);
            help.setText("");
        }
        else if(num ==7){
            title.setText("");
            help.setText("");
        }
        else if(num ==8){
            title.setText("");
            help.setText("");
        }
        else if(num ==9){
            title.setText("");
            help.setText("");
        }
        else if(num ==10){
            title.setText("");
            help.setText("");
        }
        else if(num ==11){
            title.setText("");
            help.setText("");
        }
        else if(num ==12){
            title.setText("");
            help.setText("");
        }
        else if(num ==13){
            title.setText("");
            help.setText("");
        }
        else if(num ==14){
            title.setText("");
            help.setText("");
        }
        else if(num ==15){
            title.setText("");
            help.setText("");
        }
        else if(num ==16){
            title.setText("");
            help.setText("");
        }

    }



}
