package com.example.myapplication;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Repozytorium {
    public static ArrayList<Pzepis> przepisy;


    public static void wygenerujPrzepisy() {
        przepisy = new ArrayList<>();
        przepisy.add(new Pzepis("Biala trufla", "Smietana, mleko, jajka, biszkopt,cukier,sol", "ciasta", R.drawable.ciasto1, 0));
        przepisy.add(new Pzepis("Jablecznik", "jablka, maka, jakjka, cukier, sol", "ciasta", R.drawable.ciasto2, 0));
        przepisy.add(new Pzepis("kremowka", "krem, mleko, jajka, sol", "ciasta", R.drawable.ciasto3, 0));
        przepisy.add(new Pzepis("Murzynek", "czekolada, jajka, cukier", "murzyny", R.drawable.ciasto4, 0));

    }

    public static ArrayList<Pzepis> wypiszPrzepisy(String kategoria) {
wygenerujPrzepisy();
ArrayList<Pzepis> wybranePrzepisy=new ArrayList<>();
        for (Pzepis przepis:przepisy
             ) {
            if(przepis.getKategoria().equals(kategoria)){
                wybranePrzepisy.add(przepis);
            }
        }

return wybranePrzepisy;

    }
    public static Pzepis zwrocPrzepis(String nazwa){
        wygenerujPrzepisy();
        for (Pzepis przepis:przepisy
             ) {
            if(przepis.getNazwaPrzepisu().equals(nazwa)){
            return przepis;
            }
        }
return null;
    }

}
