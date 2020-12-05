package com.company;

public class Supercar extends Car {
    private static String brand;
    private static boolean isNew;

    public Supercar(int nrUsi,String tip, String brand, boolean isNew) {
        super(nrUsi,tip);
        this.brand = brand;
        this.isNew = isNew;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Supercar.brand = brand;
    }

    public static boolean isIsNew() {
        return isNew;
    }

    public static void setIsNew(boolean isNew) {
        Supercar.isNew = isNew;
    }
}
