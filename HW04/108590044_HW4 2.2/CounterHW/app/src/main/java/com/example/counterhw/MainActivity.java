package com.example.counterhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count=0;
    private TextView ShowCount;
    private TextView EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount = (TextView)findViewById(R.id.show_count);
        EditText =(TextView)findViewById(R.id.editTextTextPersonName);
        if(savedInstanceState != null){
            boolean isVisible =
                    savedInstanceState.getBoolean("reply_visible");
            // Show both the header and the message views. If isVisible is
            // false or missing from the bundle, use the default layout.
            if (isVisible) {

               EditText.setText(savedInstanceState.getString("reply_text"));
               EditText.setVisibility(View.VISIBLE);
               ShowCount.setText(savedInstanceState.getString("reply_text"));
               ShowCount.setVisibility(View.VISIBLE);
          }
        }
    }
    public void countUP(View view){
        count++;
        if(ShowCount != null){
            ShowCount.setText(Integer.toString(count));
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (EditText.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text",EditText.getText().toString());
        }
        if (ShowCount.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text",ShowCount.getText().toString());
        }
    }
}