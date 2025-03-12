package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String KATEGORIA="kategoria";
    public static final String INFORMACJE="informacje";
private ListView listViewKategorie;
private ListView listViewInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewKategorie=findViewById(R.id.listViewKategorie);
        listViewKategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String kategoria=listViewKategorie.getItemAtPosition(i).toString();

                        Intent intent=new Intent(MainActivity.this,ListaPrzepisowActivity.class);
                        intent.putExtra(KATEGORIA, kategoria);
                        startActivity(intent);
                    }
                }
        );
    }
}