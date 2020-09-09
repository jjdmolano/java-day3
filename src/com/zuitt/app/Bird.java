package com.zuitt.app;

public class Bird extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void fly() {
        System.out.println("Flying");
    }
}
