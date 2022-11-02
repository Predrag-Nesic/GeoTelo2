package com.company;

public class Valjak extends GeoTelo {
    private int r;
    private int h;

    public Valjak(String boja, int r, int h) {
        super(boja);
        this.r = r;
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double povrsina() {
        return (2 * (Math.pow(r, 2) * Math.PI) * ((2 * r * Math.PI) * h));
    }

    @Override
    public String toString() {
        return "Valjak - boja: " + boja + ", poluprecnik: " + r + measurement +
                ", visina: " + h + measurement + ", povrsina: " + povrsina() + measurement + "2";
    }
}
