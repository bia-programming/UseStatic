package com.company;

public class Suv extends Car{
    private static int hp;
    private static int an;

    public Suv(int nrUsi,String tip, int hp, int an) {
        super(nrUsi,tip);
        this.hp = hp;
        this.an = an;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        Suv.hp = hp;
    }

    public static int getAn() {
        return an;
    }

    public static void setAn(int an) {
        Suv.an = an;
    }
}
