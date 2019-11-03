package com.company;

public class Circle extends Figure implements Drawable{

    private int radius;


    public Circle (int radius) {
        this.radius =radius;

    }
    public String getInfo () {
        return  "Circle";
    }
    public double getPerimeter (){
        return 2*Math.PI*radius;

    }

    @Override
    public String draw() {
        return "\u25CF";
    }
}
