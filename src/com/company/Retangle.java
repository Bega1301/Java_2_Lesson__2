package com.company;

public class Retangle extends Figure  implements Drawable {
    private int side1;
    private int side2;

    public Retangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public String getInfo () {
        return  "Retangle";
    }

    @Override
    public String draw() {
        return "\u25AE" ;
    }

    public double getPerimeter (){
        return 2*(side1+side2);

    }
}
