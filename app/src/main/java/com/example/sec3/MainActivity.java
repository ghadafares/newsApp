package com.example.sec3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private String[]arr={"oreo","kitkat","nogat","oreo","kitkat","nogat",
         "oreo","kitkat","nogat",
         "oreo","kitkat","nogat",
         "oreo","kitkat","nogat",
         "oreo","kitkat","nogat"};

 //https://newsapi.org/v2/top-headlines?country=de&category=business&apiKey=0ca591ab5e604f9d84abc87938ebe6fb
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    }
