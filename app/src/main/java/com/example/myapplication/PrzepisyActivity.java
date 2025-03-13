package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class PrzepisyActivity extends AppCompatActivity {
private TextView textViewNazwaPrzepisu;
private TextView textViewOpis;
private ImageView imageView;
private RatingBar ratingBarWyswietlany;
private RatingBar ratingBarZmieniany;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepisy);

        String nazwaPrzepisu=getIntent()
                .getExtras()
                .get(ListaPrzepisowActivity.PRZEPIS)
                .toString();
        Toast.makeText(this, nazwaPrzepisu, Toast.LENGTH_SHORT).show();

        textViewNazwaPrzepisu=findViewById(R.id.textView3);
        textViewOpis=findViewById(R.id.textView4);
        imageView=findViewById(R.id.imageView);
        ratingBarWyswietlany =findViewById(R.id.ratingBar);
        ratingBarZmieniany=findViewById(R.id.ratingBarZmienianny);
        button=findViewById(R.id.button);

        Pzepis przepis=Repozytorium.zwrocPrzepis(nazwaPrzepisu);
        textViewNazwaPrzepisu.setText(przepis.getNazwaPrzepisu());
        textViewOpis.setText(przepis.getSkladniki());
        imageView.setImageResource(przepis.getIdObrazka());
        ratingBarWyswietlany.setRating(przepis.getPolubienia());

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, przepis.getNazwaPrzepisu()+" "+przepis.getSkladniki());
                        intent.setType("text/plain");
                        Intent podzielSieIntent=Intent.createChooser(intent, null);
                        startActivity(podzielSieIntent);
                    }
                }
        );
        ratingBarZmieniany.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        przepis.setPolubienia((int)v);
                        ratingBar.setRating(przepis.getPolubienia());
                    }
                }
        );
    }
}