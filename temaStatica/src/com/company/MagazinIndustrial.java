package com.company;

public class MagazinIndustrial extends Magazin{
    private String nume;
    private String patron;
    private boolean eDeschis;

    public MagazinIndustrial(int suprafata, int lungime, int latime, String tipMagazin,String nume, String patron, boolean eDeschis) {
        super(suprafata, lungime, latime, tipMagazin);
        this.nume = nume;
        this.patron = patron;
        this.eDeschis = eDeschis;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public boolean iseDeschis() {
        return eDeschis;
    }

    public void seteDeschis(boolean eDeschis) {
        this.eDeschis = eDeschis;
    }
}
