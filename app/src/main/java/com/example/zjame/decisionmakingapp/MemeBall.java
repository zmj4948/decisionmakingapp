package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MemeBall extends AppCompatActivity {
    private String[] myString;
    private static final Random rgenerator = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        starts the meme Magic 8 Ball
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_ball);
    }
    public void memeResponse(View view) {
        Resources res = getResources();
        myString = res.getStringArray(R.array.MemeBallArray);
        String q = myString[rgenerator.nextInt(myString.length)];
        TextView tv = findViewById(R.id.textView);
        tv.setText(q);
    }
}
