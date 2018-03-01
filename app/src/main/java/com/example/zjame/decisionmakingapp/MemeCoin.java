package com.example.zjame.decisionmakingapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MemeCoin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        starts the meme coin activity
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_coin);
    }
    public void memeCoinFlip(View view) {
        Resources res = getResources();
        String q = res.getString(R.string.memecoin);
        TextView tv = findViewById(R.id.textView7);
        tv.setText(q);
    }
}
