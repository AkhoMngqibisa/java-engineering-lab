package com.akhona.javalab.core;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
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

    /**
     * 1.  Declare two integer variables a = 20 and b = 10.
     * 2.  Perform the following operations:
     *  a. Add, subtract, multiply, and divide a and b
     *  b. Compare if a is greater than b and store the result in a boolean variable
     *  c. Check if a > b and b > 0 using a logical operator and store the result
     * 3.  Print the results of all operations using System.out.println() in the specified format.
     */
    private static void exercise2(){
        int a = 20;
        int b = 10;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        boolean results = a > b;
        System.out.println("Is a greater than b? " + results);

        boolean results2 = (a > b) && (b > 0);
        System.out.println("Is a > b and b > 0? " + results2);
    }
}
