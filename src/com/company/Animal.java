package com.company;


public abstract class  Animal implements Printable{
  private  int age;
  private String color;

  public  Animal(int age, String color){
      this.age = age;
      this.color = color;
  }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("age: "+age+"color: "+color);
    }
}
