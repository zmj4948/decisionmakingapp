package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NormalMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_main);
    }

    public void normalBall(View view) {
        Intent intent = new Intent(this, NormalBall.class);
        startActivity(intent);
    }

    public void normalCoin(View view) {
        Intent intent = new Intent(this, NormalCoin.class);
        startActivity(intent);
    }

    public void normalDie(View view) {
        Intent intent = new Intent(this, NormalDie.class);
        startActivity(intent);
    }
}