package com.akhona.javalab.core;

public class Operators {
    public static void main(String[] args) {
        implementArithmeticOperator();
        implementRelationalOperator();
    }

    private static void implementArithmeticOperator() {
        int num1 = 7;
        int num2 = 5;

        int result = num1 % num2;
        System.out.println(result);

        System.out.println(num1++);
        System.out.println(++num1);

    }

    private static void implementRelationalOperator() {
        int x = 7;
        int y = 5;

        boolean result = x >= y;
        System.out.println(result);
    }
}
