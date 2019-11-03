package com.company;

public class Triangle extends Figure implements Drawable{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getInfo() {
        return "Triagle";
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;

    }

    @Override
    public String draw() {
        return "\u25B2";
    }
}
