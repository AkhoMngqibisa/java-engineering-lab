package com.akhona.javalab.core;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
    }

    /**
     * Variables & data types Coding Exercise
     * Declare and initialize the following variables:
     * 1. An int variable named age with the value 25
     * 2. A double variable named height with the value 5.9
     * 3. A String variable named name with the value "Alex"
     * Use System.out.println() to print the values in the exact following format:
     * Name: Alex,Age: 25,Height: 5.9
     */
    private static void exercise1(){
        // write code here
        int age = 25;
        double height = 5.9;
        String name = "Alex";

        System.out.println("Name:"+name+",Age:"+age+",Height:"+height);
    }
}
