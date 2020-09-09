package com.zuitt.app;

public class Dog extends Animal {
    private String breed;

//    constructor
    public Dog(String name) {
        this.setName(name);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void walk() {
        System.out.println("Walking");
    }
}
