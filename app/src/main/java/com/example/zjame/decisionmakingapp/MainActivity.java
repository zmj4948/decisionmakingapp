package com.example.zjame.decisionmakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*

         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void meme(View view){
        Intent intent=new Intent(this, MemeMain.class);
        startActivity(intent);
    }
    public void normal(View view){
        Intent intent=new Intent(this, NormalMain.class);
        startActivity(intent);
    }

}
