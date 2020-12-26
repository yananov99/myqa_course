package com.course.other;

public class Print {

    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book("Mr.Mercedes");
        printables[1] = new Magazine("Gucci");

        for (Printable i : printables) {
            i.print();

        }
    }
}





