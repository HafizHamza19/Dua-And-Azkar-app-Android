package com.example.callander.duaazkar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Calendar;

public class HomeActivity extends AppCompatActivity {
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Click(View view) {
        Intent s = new Intent(HomeActivity.this, Masnoonmain.class);
        startActivity(s);
    }

    public void Click2(View view) {
        Intent i = new Intent(HomeActivity.this, QuranElajmain.class);
        startActivity(i);
    }

    public void Click3(View view) {
        Intent i = new Intent(HomeActivity.this, Calander.class);
        startActivity(i);
    }
}
