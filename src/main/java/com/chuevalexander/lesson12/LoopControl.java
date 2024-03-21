package com.chuevalexander.lesson12;

public class LoopControl {
    boolean value = true;
    int a = 5, b = 7;
    public void foo() {
        while (a<b) {
            System.out.println(a);
            a++;
        }
    }

    public void foo2() {
        do {
            a++;
            System.out.println(a);
        } while (a<b);
    }

    public static void main(String[] args) {
        LoopControl lp = new LoopControl();
        lp.foo();
        lp.foo2();
    }
}
