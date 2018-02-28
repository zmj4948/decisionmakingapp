package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MemeMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        creates the meme main page
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_main);
    }
    public void MemeBall(View view) {
        /*
        calls the memeball page
         */
        Intent intent = new Intent(this, MemeBall.class);
        startActivity(intent);
    }
    public void MemeCoin(View view) {
        /*
        calls the memecoin page
         */
        Intent intent = new Intent(this,MemeCoin.class);
        startActivity(intent);
    }
    public void MemeDie(View view) {
        /*
        calls the meme dice roll page
         */
        Intent intent = new Intent(this, MemeDie.class);
        startActivity(intent);
    }
}
