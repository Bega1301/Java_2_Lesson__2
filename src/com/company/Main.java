package com.company;

public class Main {

    public static void main(String[] args) {


        Circle сircle = new Circle(5);

        System.out.println(сircle.getInfo() + " " + сircle.getPerimeter());

        Square square = new Square(10);

        System.out.println(square.getInfo() + " " + square.getPerimeter());

        Triangle triangle = new Triangle(5, 4, 6);

        System.out.println(triangle.getInfo() + " " + triangle.getPerimeter());

        Retangle retangle = new Retangle(5, 3);

        System.out.println(retangle.getInfo() + " " + retangle.getPerimeter());

        Figure figure[] = new Figure[6];
        figure[0] = сircle;
        figure[1] = triangle;
        figure[2] = square;
        figure[3] = triangle;
        figure[4] = retangle;
        figure[5] = square;
        for (int i = 0; i < figure.length; i++) {

            System.out.println(figure[i].getInfo() + " " + figure[i].getPerimeter() + " " + figure[i].draw());


        }

        Dog dog = new Dog();
        dog.setName("Sam");
        System.out.println(dog.getName() + " "+ dog.draw()+ " " + dog.callSound());


    }
}
