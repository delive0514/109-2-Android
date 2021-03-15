package com.example.android.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends MainActivity {
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Bundle bundle = getIntent().getExtras();
        Integer mCount = bundle.getInt("mCount");
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}