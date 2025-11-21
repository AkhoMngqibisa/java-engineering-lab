package com.akhona.javalab.core;

public class Condition {
    public static void main(String[] args) {
        implementIfElse();
    }

    private static void implementIfElse() {
        int x = 8;
        int y = 5;

        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}
