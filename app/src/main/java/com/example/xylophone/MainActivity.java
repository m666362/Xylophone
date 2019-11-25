package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //helpful constant
    private final int no_of_sinultaneous_sound = 7;
    private final float left_volume = 1.0f;
    private final float right_volume = 1.0f;
    private final int no_of_loop = 0;
    private final int priority = 0;
    private final float normal_play_rate = 1.0f;

    //todo: add member vriable
    private SoundPool masoundpool;
    private int maCsoundid;
    private int maDsoundid;
    private int maEsoundid;
    private int maFsoundid;
    private int maGsoundid;
    private int maAsoundid;
    private int maBsoundid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create new soundpool
        masoundpool = new SoundPool(no_of_sinultaneous_sound, AudioManager.STREAM_MUSIC, 0);

        //load and get the  ids to identify the sound
        maCsoundid = masoundpool.load(getApplicationContext(), R.raw.note1_c, 1);
        maDsoundid = masoundpool.load(getApplicationContext(), R.raw.note2_d, 1);
        maEsoundid = masoundpool.load(getApplicationContext(), R.raw.note3_e, 1);
        maFsoundid = masoundpool.load(getApplicationContext(), R.raw.note4_f, 1);
        maGsoundid = masoundpool.load(getApplicationContext(), R.raw.note5_g, 1);
        maAsoundid = masoundpool.load(getApplicationContext(), R.raw.note6_a, 1);
        maBsoundid = masoundpool.load(getApplicationContext(), R.raw.note7_b, 1);

    }


    //add the play method triggered by the buttons
    public void playC(View v){
        masoundpool.play(maCsoundid, left_volume, right_volume, priority, no_of_loop, normal_play_rate);
    }

    public void playD(View v){
        masoundpool.play(maDsoundid, left_volume, right_volume, priority, no_of_loop, normal_play_rate);
    }

    public void playE(View v){
        masoundpool.play(maEsoundid, left_volume, right_volume, priority, no_of_loop, normal_play_rate);
    }

    public void playF(View v){
        masoundpool.play(maFsoundid, left_volume, right_volume, priority, no_of_loop, normal_play_rate);
    }

    public void playG(View v){
        masoundpool.play(maGsoundid, left_volume, right_volume, priority, no_of_loop, normal_play_rate);
    }

    public void playA(View v){
        masoundpool.play(maAsoundid, left_volume, right_volume, priority, no_of_loop, normal_play_rate);
    }

    public void playB(View v){
        masoundpool.play(maBsoundid, left_volume, right_volume, priority, no_of_loop, normal_play_rate);
    }
}
