package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NormalMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        creates the main page for the Normal settings
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_main);
    }

    public void normalBall(View view) {
        /*
        calls the Magic 8 Ball class for the Normal setting
         */
        Intent intent = new Intent(this, NormalBall.class);
        startActivity(intent);
    }

    public void normalCoin(View view) {
        /*
        calls the coin flip class for the Normal Setting
         */
        Intent intent = new Intent(this, NormalCoin.class);
        startActivity(intent);
    }

    public void normalDie(View view) {
        /*
        calls the dice roll for the Normal Setting
         */
        Intent intent = new Intent(this, NormalDie.class);
        startActivity(intent);
    }
}