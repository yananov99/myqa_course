package com.course.lessons;

public class Lesson3 {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        int c = 8;
        int d = --c;

        int e = 8;
        int f = e--;

        int x = 10 / 5 * 2;

        String text = "hello";
        String text2 = "hello";

        String text3 = new String("hello");
        String text4 = new String("hello");

        boolean bool = a != b;
        boolean bool2 = a == b;
        boolean bool3 = a > b;
        boolean bool4 = a < b;
        boolean bool5 = a >= b;
        boolean bool6 = a <= b;

        boolean bool7 = (5 > 6) || (4 < 6);
        boolean bool8 = (5 < 6) && (4 > 6);

        System.out.println(bool);
        System.out.println(bool7);
        System.out.println(bool8);
//IF
        if (a != b || a >= b) {
            System.out.println("Hello hello");
        }

//IF ELSE

        if (a == b) {
            System.out.println("Hello World if");
        } else {
            System.out.println("Hello World else");
        }
//IF ELSE ELSE IF

        if (a == 5) {
            System.out.println("Hello World " + a);
        } else if (a == 6) {
            System.out.println("Hello World " + a);
        } else if (a == 7) {
            System.out.println("Hello World " + a);
        }

//SWITCH
        int cars = 5;
        switch (cars) {
            case 5:
                System.out.println("Mercedes");
                a++;
                break;
            case 6:
                System.out.println("BMW");
                break;
            case 15:
                System.out.println("third case");
                break;
            default:
                System.out.println("default");

        }
        int z = a > b ? 10 : 5;
        if (a > b) {
            z = 10;
        } else {
            z = 5;

        }
    }
}

