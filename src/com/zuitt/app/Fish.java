package com.zuitt.app;

public class Fish extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void swim() {
        System.out.println("Swimming");
    }
}
