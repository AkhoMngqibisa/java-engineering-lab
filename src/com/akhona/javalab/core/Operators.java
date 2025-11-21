package com.akhona.javalab.core;

public class Operators {
    public static void main(String[] args) {
        implementArithmeticOperator();
        implementRelationalOperator();
        implementLogicalOperator();
    }

    private static void implementArithmeticOperator() {
        System.out.println("Method: implementArithmeticOperator");
        int num1 = 7;
        int num2 = 5;

        int result = num1 % num2;
        System.out.println(result);

        System.out.println(num1++);
        System.out.println(++num1);

    }

    private static void implementRelationalOperator() {
        System.out.println("\nMethod: implementRelationalOperator");

        int x = 7;
        int y = 5;

        boolean result = x >= y;
        System.out.println(result);
    }

    private static void implementLogicalOperator() {
        System.out.println("\nMethod: implementLogicalOperator");
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x<y || a<b;
        System.out.println(result);

    }
}
