package com.company;

public abstract class GeoTelo {
    protected String boja;
    protected final String measurement = "cm";

    public GeoTelo() {

    }

    public GeoTelo(String boja) {
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }

    public abstract double povrsina();
}
