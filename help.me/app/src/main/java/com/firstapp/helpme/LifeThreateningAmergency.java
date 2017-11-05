package com.firstapp.helpme;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LifeThreateningAmergency extends AppCompatActivity {

    private SoundPool mSoundPool;
    private TextView question;
    private int clickButton;
    private int numQuestion;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_threatening_amergency);
        mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        clickButton = mSoundPool.load(getApplicationContext(), R.raw.click, 1);
        question = (TextView) findViewById(R.id.question);
        numQuestion = 1;
        intent = new Intent(getApplicationContext(), Results.class);
        start();
    }

    public void start()
    {
        switch(numQuestion) {
            case 1: question.setText("Are You Able to walk?");
                    break;
            case 2: question.setText("Do You Have Spontanuous Breathing?");
                break;
            case 3: question.setText("Is Your Respiratory Rate More Than 30?");
                break;
            case 4: question.setText("Can you feel their pulse on their wrist?");
                break;
            case 5: question.setText("Are You Able to Obey Commands");
                break;
        }
    }

    public void yesCheck()
    {
        if(numQuestion==1) {
            intent.putExtra("num", numQuestion);
            startActivity(intent);
        }
        else if(numQuestion==2){
            numQuestion++;
            start();
        }
        else if(numQuestion==3){
            numQuestion++;
            start();
        }
        else if(numQuestion== 4){
            numQuestion++;
            start();
        }
        else if(numQuestion== 5){
            intent.putExtra("num", numQuestion+1);
            startActivity(intent);
        }
    }

    public void noCheck(){
        if(numQuestion==1){
            numQuestion++;
            start();
        }
        else if(numQuestion==2){
            intent.putExtra("num", numQuestion);
            startActivity(intent);
        }
        else if(numQuestion==3){
            intent.putExtra("num", numQuestion);
            startActivity(intent);
        }
        else if(numQuestion==4){
            intent.putExtra("num", numQuestion);
            startActivity(intent);
        }
        else if(numQuestion== 5){
            intent.putExtra("num", numQuestion);
            startActivity(intent);
        }
    }

    public void yesButtonClicked(View v) {
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
        yesCheck();
    }

    public void noButtonClicked(View v) {
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
        noCheck();
    }
}

