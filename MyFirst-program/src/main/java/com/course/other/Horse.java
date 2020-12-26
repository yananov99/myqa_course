package com.course.other;

public class Horse extends Animal {
    public String horsefood = "hay";

    public Horse (String food, String location, String voice) {
        super(food, location, "igogo");

        this.location = "stable";
        this.food = "grass";
        this.voice = "igogo";

    }

    @Override
    public void makeNoise() {
        System.out.println("Cat asks for " + food);
    }

    @Override

    public void eat() {
        System.out.println("Cat's food is " + horsefood);

    }

}


