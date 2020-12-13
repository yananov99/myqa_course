package com.course.lessons;

import com.course.other.Cat;
import com.course.other.Dog;
import com.course.other.Human;

public class Lesson4 {
    Dog dogJack = new Dog("Jack");
    Dog dogSharic = new Dog("Sharic");

    Cat cat = new Cat();


    public static void hello(String message) {
        System.out.println(message);
    }

    public static String hello2(String message) {
        return message + " world";
    }

    public static void main(String[] args) {
        String hello = hello2("Hello");
        hello("Hello World");

    }
}
/*
        for (int i = 0; i < 9; i++) {
            System.out.println("Hello World");
        }

        int j = 6;

        while (j > 0) {
            System.out.println("Hello World");
            j--;
        }

        int f = -6;

        do {
            System.out.println("Hello World");
            f--;

        } while (f > 0);


        //1 , 2 , 3 , 4 , 5
        //0 , 1 , 2 , 3 , 4
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 10;
        intArray[2] = 100;
        intArray[3] = 1000;
        intArray[4] = 10000;

        int[] newIntArray = {1, 10, 100, 1000, 10000};

        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println(newIntArray[i]);
        }

        for (int value : newIntArray) {
            System.out.println(value);
        }
        for (int i = 0; i < 9; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 9; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }*/









