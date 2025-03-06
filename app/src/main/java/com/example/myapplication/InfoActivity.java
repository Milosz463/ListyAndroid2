package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        String informacje=(String) getIntent().getExtras().get(MainActivity.INFORMACJE);
        TextView textView=findViewById(R.id.textView3);
        textView.setText(informacje);
    }
}