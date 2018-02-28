package com.example.zjame.decisionmakingapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class NormalResponse extends AppCompatActivity {

    private String[] myString;
    private static final Random rgenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_response);

        Resources res = getResources();

        myString = res.getStringArray(R.array.NormalBallArray);

        String q = myString[rgenerator.nextInt(myString.length)];

        TextView tv = findViewById(R.id.textView);
        tv.setText(q);

    }

}
