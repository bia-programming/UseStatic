package com.company;

public class Main {

    public static void main(String[] args) {
        MagazinIndustrial ind1 = new MagazinIndustrial(2000, 1000, 200, "industrial", "nume", "patron", true);
        MagazinAlimentar almt1 = new MagazinAlimentar(2000, 3482, 29384, "alimentar", 10, "alsjf", "sldjf", 9);
        MagazinIndustrial ind2 = new MagazinIndustrial(2000, 1000, 200, "industrial", "nume", "patron", true);
        MagazinAlimentar almt2 = new MagazinAlimentar(2000, 3482, 29384, "alimentar", 10, "alsjf", "sldjf", 9);
        System.out.println(ind1.getId());
        System.out.println(ind2.getId());
        System.out.println(almt1.getId());
        System.out.println(almt2.getId());


        Truck truck = new Truck(4, "truck", 2000, "red");
        Van van = new Van(4,"VaN","white","new");
        Supercar supercar = new Supercar(4,"SuPeRcAr","audi",true);
        Cabrio cabrio = new Cabrio(4,"cabrio",true,"new");
        Suv suv = new Suv(4,"suv",2000,2015);
        System.out.println(truck.getId());
        System.out.println(van.getId());
        System.out.println(supercar.getId());
        System.out.println(cabrio.getId());
        System.out.println(suv.getId());

    }
}
