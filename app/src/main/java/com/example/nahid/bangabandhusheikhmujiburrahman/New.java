package com.example.nahid.bangabandhusheikhmujiburrahman;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class New extends AppCompatActivity {

    private  static int SPLASH_TIME_OUT=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        //Splash Start//
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent homeIntent = new Intent(New.this, Home.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

        //Splash End//
    }
}
