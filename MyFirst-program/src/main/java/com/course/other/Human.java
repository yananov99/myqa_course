package com.course.other;

public class Human {
    private String firstName;
    private String lastName;

    public Human (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public void printName(){
        System.out.println(firstName + " " + lastName);
    }
    public static void main(String [] args) {
        Human me = new Human ("Yana", "Novojeni");
        me.printName();
    }
}
