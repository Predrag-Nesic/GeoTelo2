package com.company;

public class Kupa extends GeoTelo {
    private int r;
    private int s;

    public Kupa(String boja, int r, int s) {
        super(boja);
        this.r = r;
        this.s = s;
    }
    @Override
    public double povrsina() {
        return ((Math.pow(r, 2) * Math.PI) + (r * Math.PI * s));
    }

    @Override
    public String toString() {
        return "Kupa - boja: " + boja + ", poluprecnik: " + r + measurement +
                ", visina: " + s + measurement + ", povrsina: " + povrsina() + measurement + "2";
    }
}
