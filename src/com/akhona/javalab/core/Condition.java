package com.akhona.javalab.core;

public class Condition {
    public static void main(String[] args) {
        implementIfElse();
        implementIfElseIf();
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

    private static void implementIfElseIf() {
        int x = 8;
        int y = 5;
        int z = 7;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else  {
            System.out.println(z);
        }

    }
}
