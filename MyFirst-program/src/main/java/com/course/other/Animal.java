package com.course.other;

public abstract class Animal {
    public String location;
    public String food;
    public String voice;

    public Animal(String food, String location, String voice) {
        this.food = food;
        this.location = location;
        this.voice = voice;

    }

    public void makeNoise() {
        System.out.println("Animal asks food");
}

    public void eat() {
        System.out.println("I like");

    }
    public void sleep(){

    }
}
