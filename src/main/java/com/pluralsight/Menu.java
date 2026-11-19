package com.pluralsight;

public class Menu {
    public static void main(String[] args) {
        display();
        display();
    }


    public static void display(){
        String menu= """
                =====Menu=====
                1.Coffee= $3.99
                2.Tea= $2.99
                3.Cookie=$1.99
                """;
        System.out.println(menu);
    }
}
