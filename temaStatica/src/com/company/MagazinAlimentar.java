package com.company;

public class MagazinAlimentar extends Magazin{
    private int orar;
    private String localizare;
    private String numeFirma;
    private int nrClienti;

    public MagazinAlimentar(int suprafata, int lungime, int latime, String tipMagazin,int orar, String localizare, String numeFirma, int nrClienti) {
        super(suprafata,lungime,latime,tipMagazin);
        this.orar = orar;
        this.localizare = localizare;
        this.numeFirma = numeFirma;
        this.nrClienti = nrClienti;
    }

    public int getOrar() {
        return orar;
    }

    public void setOrar(int orar) {
        this.orar = orar;
    }

    public String getLocalizare() {
        return localizare;
    }

    public void setLocalizare(String localizare) {
        this.localizare = localizare;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public void setNumeFirma(String numeFirma) {
        this.numeFirma = numeFirma;
    }

    public int getNrClienti() {
        return nrClienti;
    }

    public void setNrClienti(int nrClienti) {
        this.nrClienti = nrClienti;
    }
}
