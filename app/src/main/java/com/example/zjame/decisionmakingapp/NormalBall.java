package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class NormalBall extends AppCompatActivity {
    private String[] myString;
    private static final Random rgenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
         * creates the Normal Ball page
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_ball2);
    }
    public void normalResponse(View view) {
        /*
        when the Magic 8 Ball is tapped, the text is changed
         */
        Resources res = getResources();
        myString = res.getStringArray(R.array.NormalBallArray);
        String q = myString[rgenerator.nextInt(myString.length)];
        TextView tv = findViewById(R.id.textView3);
        tv.setText(q);
    }

}
