package com.course.other;

public class Book implements Printable {

    public String bookName;
       public Book(String bookName){
           this.bookName = bookName;
       }
       @Override
    public void print() {
           System.out.println(bookName);
    }
}
