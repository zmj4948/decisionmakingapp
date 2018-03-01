package com.example.zjame.decisionmakingapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MemeDie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        opens the meme dice page
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_die);
    }
    public void memeDieRoll(View view) {
        Resources res = getResources();
        String q = res.getString(R.string.memeDie);
        TextView tv = findViewById(R.id.textView5);
        tv.setText(q);
    }
}
