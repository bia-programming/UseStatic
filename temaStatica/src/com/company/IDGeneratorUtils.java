package com.company;

public class IDGeneratorUtils {
    private static int idCountInd = 0;
    private static int idCountAlmt = 0;
    private static int idCabrio = 0;
    private static int idSuv = 0;
    private static int idSupercar = 0;
    private static int idTruck = 0;
    private static int idVan = 0;

    public static String generateIdMagazin(String tipMagazin) {
        String id = "";
        if (tipMagazin.toLowerCase().equals("industrial")) {
            idCountInd++;
            id = idCountInd + "-ind-mag";
        } else if (tipMagazin.toLowerCase().equals("alimentar")) {
            idCountAlmt++;
            id = idCountAlmt + "-ali-mag";
        }
        return id;
    }

    public static String generateIdCar(String tip) {
        String id = " ";
        if (tip.toLowerCase().equals("cabrio")) {
            idCabrio++;
            id = idCabrio + "-car-Cabrio";
        } else if (tip.toLowerCase().equals("suv")) {
            idSuv++;
            id = idSuv + "-car-Suv";
        } else if (tip.toLowerCase().equals("supercar")) {
            idSupercar++;
            id = idSupercar + "-car-Supercar";
        } else if (tip.toLowerCase().equals("truck")) {
            idTruck++;
            id = idTruck + "-car-Truck";
        } else if (tip.toLowerCase().equals("van")) {
            idVan++;
            id = idVan + "-car-Van";
        }
        return id;
    }

}
