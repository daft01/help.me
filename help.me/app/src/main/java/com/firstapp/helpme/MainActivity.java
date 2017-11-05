package com.firstapp.helpme;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool mSoundPool;
    private int clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        clickButton = mSoundPool.load(getApplicationContext(), R.raw.click, 1);
    }

    public void resourcesButtonClicked(View v){
        startActivity(new Intent(MainActivity.this, ResourcesActivity.class));
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void settingsButtonClicked(View v){
        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void lifeThreateningEmergencyOnClicked(View v){
        startActivity(new Intent(MainActivity.this, LifeThreateningAmergency.class));
        mSoundPool.play(clickButton, 1.0f, 1.0f, 0, 0, 1.0f);
    }

}
