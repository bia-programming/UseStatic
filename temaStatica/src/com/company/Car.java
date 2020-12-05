package com.company;

public class Car {
    private int nrUsi;
    private String tip;
    private String id;

    public Car(int nrUsi, String tip) {
        this.nrUsi = nrUsi;
        this.tip = tip;
        this.id = IDGeneratorUtils.generateIdCar(tip);
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
