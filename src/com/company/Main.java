package com.company;

import java.awt.print.Pageable;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(2, "17", "Violetta");
        dog.print();
        Cat cat = new Cat("BULLETPROOF_SUIT", 3, "Jack");
        cat.print();
        Cow cow = new Cow(3, "15", "Shastik");
        cow.print();
        Printable[] printables = {cat, dog, cow};

        createObject("cat").print();
        createObject("dog").print();
        createObject("cow").print();
    }

    public static Printable createObject(String className) {
        Printable print = null;
        switch (className) {
            case "1":
                print = new Dog(2, "17", "Violetta");
                break;
            case "2":
                print = new Cat("BULLETPROOF_SUIT", 3, "Jack");
                break;
            case "3":
                print = new Cow(3, "15", "Shastik");
                break;
        }
        return print;

    }
}