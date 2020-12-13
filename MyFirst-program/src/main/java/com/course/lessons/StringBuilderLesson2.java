package com.course.lessons;

public class StringBuilderLesson2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mercedes Benz Cars");
        sb.delete(0, 1);
        sb.deleteCharAt(0);
        sb.replace(sb.length() - 5, sb.length() - 1, "Sclass");
        sb.insert(sb.length() - 1, "The best or nothing -");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        System.out.println(sb.substring(10));
        System.out.println(sb.substring(0, 10));
    }
}
