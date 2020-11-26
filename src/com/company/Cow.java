package com.company;

import java.awt.*;

public class Cow extends Animal {
    private String teeth;

    public Cow(int age, String color, String teeth) {
        super(age, color);
        this.teeth = teeth;
    }

    public String getTeeth() {
        return teeth;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Teeth: "+teeth);
    }
}

