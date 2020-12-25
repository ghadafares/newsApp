package com.example.sec3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name =getIntent().getStringExtra("data1");
        int value=getIntent().getIntExtra("num1",-1);
        setTitle(value+name);
    }
}