package com.company;

public class Magazin {
    private int suprafata;
    private int lungime;
    private int latime;
    private String tipMagazin;
    private String id;

    public Magazin(int suprafata, int lungime, int latime, String tipMagazin) {
        this.suprafata = suprafata;
        this.lungime = lungime;
        this.latime = latime;
        this.tipMagazin = tipMagazin;
        this.id=IDGeneratorUtils.generateIdMagazin(tipMagazin);
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public String getTipMagazin() {
        return tipMagazin;
    }

    public void setTipMagazin(String tipMagazin) {
        this.tipMagazin = tipMagazin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
