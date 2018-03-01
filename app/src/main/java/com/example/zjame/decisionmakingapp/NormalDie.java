package com.example.zjame.decisionmakingapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class NormalDie extends AppCompatActivity {
    private String[] myString;
    private static final Random rgenerator = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        creates the normal dice page
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_die);
    }

    public void normalDieRoll(View view) {
        Resources res = getResources();
        myString = res.getStringArray(R.array.NormalDieArray);
        String q = myString[rgenerator.nextInt(myString.length)];
        TextView tv = findViewById(R.id.textView6);
        tv.setText(q);
    }
}
