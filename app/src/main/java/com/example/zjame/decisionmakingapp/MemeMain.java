package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MemeMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_main);
    }
    public void MemeBall(View view) {
        Intent intent = new Intent(this, MemeBall.class);
        startActivity(intent);
    }
    public void MemeCoin(View view) {
        Intent intent = new Intent(this,MemeCoin.class);
        startActivity(intent);
    }
    public void MemeDie(View view) {
        Intent intent = new Intent(this, MemeDie.class);
        startActivity(intent);
    }
}
