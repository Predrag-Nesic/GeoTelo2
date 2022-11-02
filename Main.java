package com.company;

public class Main {
    public static void main(String[] args) {
        GeoTelo[] niz = new GeoTelo[6];

        for(int i = 0; i < niz.length; i++) {
            if(i % 3 == 0) {
                niz[i] = new Valjak("crvena", 2, 5);
            } else if(i % 3 == 1) {
                niz[i] =  new Kupa("plava", 3, 6);
            } else {
                niz[i] = new Kvadar("zelena", 2, 3, 4);
            }
        }

        ispis(niz);
    }

    public static void ispis(GeoTelo[] niz) {
        for(GeoTelo g : niz) {
            System.out.println(g);
        }
    }
}