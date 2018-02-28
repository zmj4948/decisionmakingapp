package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MemeBall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_ball);
    }
    public void memeResponse(View view) {
        Intent intent = new Intent(this, memeResponse.class);
        startActivity(intent);
    }
}
