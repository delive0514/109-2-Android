package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LogDebug","Hello friend");
        Log.e("error","Hello my best friend");
        Log.i("info", "MainActivity layout is complete");
        Log.v("verbose","log.v output~~");
        Log.w("warning","log.w output~~");

    }
}