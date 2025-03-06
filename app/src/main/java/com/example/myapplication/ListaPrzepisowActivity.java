package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
private ListView listViewPrzepisy;
private ArrayAdapter<Pzepis> arrayAdapter;
private ArrayList<Pzepis> wybranePrzepisy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria= (String) getIntent().getExtras().get(MainActivity.KATEGORIA);
        TextView textView=findViewById(R.id.textView2);
        textView.setText(kategoria);
        wybranePrzepisy= Repozytorium.wypiszPrzepisy(kategoria);
       arrayAdapter=new ArrayAdapter<>(ListaPrzepisowActivity.this, android.R.layout.simple_list_item_1,wybranePrzepisy);
       listViewPrzepisy=findViewById(R.id.listViewPrzepisy);
       listViewPrzepisy.setAdapter(arrayAdapter);
    }
}