package com.company;

public class Dog extends Animal implements Drawable, SoundProducable{

    @Override
    public String draw() {
        return "🐶" ;
    }

    public Dog() {
    }

    @Override
    public String callSound() {
        return "гав-гав";
    }
}

