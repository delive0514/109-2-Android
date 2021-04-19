package com.example.a108590044_hw44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void donutClicked(View view){
        Intent intent = new Intent(MainActivity.this,donuts.class);
        startActivity(intent);
    }
    public void froyoClicked(View view){
        Intent intent = new Intent(MainActivity.this,froyo.class);
        startActivity(intent);
    }
    public void iceClicked(View view){
        Intent intent = new Intent(MainActivity.this,icecream.class);
        startActivity(intent);
    }
}