package com.company;




public class Dog extends Animal  {
    private String commands;

    public Dog(int age , String
            color , String commands) {
        super(age, color);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("commands: "+commands);
    }
}

