package com.course.other;

public class Magazine implements Printable {

    public String name;
    public Magazine(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);

    }
}

