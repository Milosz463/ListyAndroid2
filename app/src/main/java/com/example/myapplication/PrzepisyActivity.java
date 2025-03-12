package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PrzepisyActivity extends AppCompatActivity {
private TextView textViewNazwaPrzepisu;
private TextView textViewOpis;
private ImageView imageView;
private RatingBar ratingBar;
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
        ratingBar=findViewById(R.id.ratingBar);
        button=findViewById(R.id.button);

        Pzepis przepis=Repozytorium.zwrocPrzepis(nazwaPrzepisu);
        textViewNazwaPrzepisu.setText(przepis.getNazwaPrzepisu());
        textViewOpis.setText(przepis.getSkladniki());
        imageView.setImageResource(przepis.getIdObrazka());
        ratingBar.setRating(przepis.getPolubienia());
    }
}