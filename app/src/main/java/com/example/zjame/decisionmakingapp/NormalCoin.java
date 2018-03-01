package com.example.zjame.decisionmakingapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class NormalCoin extends AppCompatActivity {
    private String[] myString;
    private static final Random rgenerator = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        creates the normal coin page
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_coin);
    }
    public void coinflip(View view) {
        Resources res = getResources();
        myString = res.getStringArray(R.array.coin);
        String q = myString[rgenerator.nextInt(myString.length)];
        TextView tv = findViewById(R.id.textView8);
        tv.setText(q);
    }
}
