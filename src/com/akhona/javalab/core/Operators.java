package com.akhona.javalab.core;

public class Operators {
    public static void main(String[] args) {
        implementArithmeticOperator();
    }

    private static void implementArithmeticOperator() {
        int num1 = 7;
        int num2 = 5;

        int result = num1 % num2;
        System.out.println(result);

        System.out.println(num1++);
        System.out.println(++num1);

    }
}
