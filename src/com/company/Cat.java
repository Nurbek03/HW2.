package com.company;

public class Cat extends Animal {
    private String breed;

    public Cat(String breed, int age, String color) {
        super(age, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void print(){
        super.print();
        System.out.println("breed: "+breed);
    }
}


