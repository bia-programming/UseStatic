package com.company;

public class Cabrio extends Car {
    private static boolean decapotabila;
    private static String model;

    public Cabrio(int nrUsi,String tip, boolean decapotabila, String model) {
        super(nrUsi,tip);
        this.decapotabila = decapotabila;
        this.model = model;
    }

    public static boolean isDecapotabila() {
        return decapotabila;
    }

    public static void setDecapotabila(boolean decapotabila) {
        Cabrio.decapotabila = decapotabila;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cabrio.model = model;
    }
}
