package com.pluralsight;

public class Format {
    public static void main(String[] args) {

        String name=formatName("Bob", "Smith");
        System.out.println(name);
    }

    public static String formatName(String first, String last){
        String name=last+", "+first;
        return name;

    }
}
