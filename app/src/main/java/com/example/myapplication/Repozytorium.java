package com.example.myapplication;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Repozytorium {
    public static ArrayList<Pzepis> przepisy;
    public static void wygenerujPrzepisy(){
        przepisy=new ArrayList<>();
        przepisy.add(new Pzepis("Biala trufla","Smietana, mleko, jajka, biszkopt,cukier,sol","ciasta", R.drawable.ciasto1,0));
        przepisy.add(new Pzepis("Jablecznik", "jablka, maka, jakjka, cukier, sol","ciasta",R.drawable.ciasto2,0));
        przepisy.add(new Pzepis("kremowka", "krem, mleko, jajka, sol", "ciasta", R.drawable.ciasto3,0));
        przepisy.add(new Pzepis("Murzynek", "czekolada, jajka, cukier", "murzyny",R.drawable.ciasto4,0));
    }
}
