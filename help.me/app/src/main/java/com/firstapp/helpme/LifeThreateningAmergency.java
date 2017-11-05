package com.firstapp.helpme;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LifeThreateningAmergency extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_threatening_amergency);
        mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        clickButton = mSoundPool.load(getApplicationContext(), R.raw.click, 1);
    }

    public void yesButtonClicked(View v){
        mSoundPool.play(clickButton, 1.0f,1.0f, 0, 0, 1.0f);
    }

    public void noButtonClicked(View v){
        mSoundPool.play(clickButton, 1.0f,1.0f, 0, 0, 1.0f);
    }

}
