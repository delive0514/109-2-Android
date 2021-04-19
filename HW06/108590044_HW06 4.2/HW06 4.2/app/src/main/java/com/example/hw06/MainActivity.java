package com.example.hw06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);

    }
    public void show_Toast(View view){
        String message = "Toppings: ";
        if(checkBox1.isChecked()){
            message += checkBox1.getText();
            message +=" ";
        }
        if(checkBox2.isChecked()){
            message += checkBox2.getText();
            message +=" ";
        }
        if(checkBox3.isChecked()){
            message += checkBox3.getText();
            message +=" ";
        }
        if(checkBox4.isChecked()){
            message += checkBox4.getText();
            message +=" ";
        }
        if(checkBox5.isChecked()){
            message += checkBox5.getText();
            message +=" ";
        }
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}