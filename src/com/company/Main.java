package com.company;

import java.awt.print.Pageable;

public class Main {

    public static void main(String[] args) {


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