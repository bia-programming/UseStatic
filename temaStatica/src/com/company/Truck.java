package com.company;

public class Truck extends Car {
    private static int price;
    private String colorCab;

    public Truck(int nrUsi,String tip,int price, String colorCab) {
        super(nrUsi,tip);
        this.price = price;
        this.colorCab = colorCab;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Truck.price = price;
    }

    public String getColorCab() {
        return colorCab;
    }

    public void setColorCab(String colorCab) {
        this.colorCab = colorCab;
    }
}
