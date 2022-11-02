package com.company;

public class Kvadar extends GeoTelo {
    private int a, b, c;

    public Kvadar(String boja, int a, int b, int c) {
        super(boja);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double povrsina() {
        return ((2 * (a * b)) + (2 * (b * c)) + (2 * (a * c)));
    }

    @Override
    public String toString() {
        return "Kvadar - boja: " + boja + ", duzina: " + a + measurement +
                ", sirina: " + b + measurement + ", visina: " + c + measurement +
                ", povrsina: " + povrsina() + measurement + "2";
    }
}
