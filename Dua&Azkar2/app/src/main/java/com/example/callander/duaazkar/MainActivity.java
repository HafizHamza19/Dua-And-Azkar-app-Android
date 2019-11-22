package com.example.callander.duaazkar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    public static int Splash_Time_Out=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
Intent homeIntent= new Intent(MainActivity.this,HomeActivity.class);
              startActivity(homeIntent);
                finish();
            }
        },Splash_Time_Out);
    }
}