package com.example.myapplication;
public class Pzepis{
    private String nazwaPrzepisu;
    private String skladniki;
    private String kategoria;
    private int idObrazka;
    private int polubienia;

    public Pzepis(String nazwaPrzepisu, String skladniki, String kategoria, int idObrazka, int polubienia) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.skladniki = skladniki;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.polubienia = polubienia;
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

    public int getPolubienia() {
        return polubienia;
    }

    public void setPolubienia() {
        this.polubienia ++;
    }

    @Override
    public String toString() {
        return  nazwaPrzepisu;
    }
}
