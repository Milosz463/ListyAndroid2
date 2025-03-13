package com.example.myapplication;

import java.util.ArrayList;

public class Pzepis{
    private String nazwaPrzepisu;
    private String skladniki;
    private String kategoria;
    private int idObrazka;
    private float polubienia;
    private ArrayList<Float>wszystkieOceny=new ArrayList<>();

    public Pzepis(String nazwaPrzepisu, String skladniki, String kategoria, int idObrazka, int polubienia) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.skladniki = skladniki;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.polubienia = polubienia;
        wszystkieOceny.add(this.polubienia);
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public float getPolubienia() {
        float srednia=0;
        for (int i = 0; i < wszystkieOceny.size(); i++) {
            srednia=wszystkieOceny.get(i);
        }
        srednia=srednia/wszystkieOceny.size();
        return srednia;
    }

    public void setPolubienia(int polubienia) {
        wszystkieOceny.add((float)polubienia);
    }

    @Override
    public String toString() {
        return  nazwaPrzepisu;
    }
}
