package com.chuevalexander.lesson10;

public class ControlOperators {
    int a = 5, b = 7;
    boolean value = false;

    public void foo() {
        if (value) {
            System.out.println("True");
            a++;

            if (a < b) {
                System.out.println("Yes");
            }
        } else if (b < a) {
            System.out.println("False");
        } else {
            System.out.println("AAA");
        }
    }
}

class Test {
    public static void main(String[] args) {
        ControlOperators controlOperators = new ControlOperators();
        controlOperators.foo();
    }
}
