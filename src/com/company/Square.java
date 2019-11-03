package com.company;

public class Square extends Figure implements Drawable {

    private int side;


    public Square (int side) {
        this.side =side;

    }
    public String getInfo () {
        return  "Square";
    }
    public double getPerimeter (){
        return 4*side;

    }

    @Override
    public String draw() {
        return "\u25A0";
    }
}
