package com.firstapp.helpme;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class ResourcesActivity extends AppCompatActivity {
    private Intent intent;
    private SoundPool mSoundPool;
    private int clickButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        intent = new Intent(getApplicationContext(), Results.class);
        mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        clickButton = mSoundPool.load(getApplicationContext(), R.raw.click, 1);
    }

    public void fracturesButtonClicked(View v){
       intent.putExtra("num", 7);
       startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void cutsButtonClicked(View v){
        intent.putExtra("num", 8);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void burnsButtonClicked(View v){
        intent.putExtra("num", 9);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void conscioussButtonClicked(View v){
        intent.putExtra("num", 10);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void cprButtonClicked(View v){
        intent.putExtra("num", 11);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void strokesButtonClicked(View v){
        intent.putExtra("num", 12);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void crisisButtonClicked(View v){
        intent.putExtra("num", 13);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void poisoningButtonClicked(View v){
        intent.putExtra("num", 14);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void fluidsButtonClicked(View v){
        intent.putExtra("num", 15);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }
    public void seizuresButtonClicked(View v){
        intent.putExtra("num", 16);
        startActivity(intent);
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }

}
