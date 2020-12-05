package com.company;

public class Van extends Car {
    private static String culoare;
    private static String model;

    public Van(int nrUsi,String tip, String culoare, String model) {
        super(nrUsi,tip);
        this.culoare = culoare;
        this.model = model;
    }

    public static String getCuloare() {
        return culoare;
    }

    public static void setCuloare(String culoare) {
        Van.culoare = culoare;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Van.model = model;
    }
}
