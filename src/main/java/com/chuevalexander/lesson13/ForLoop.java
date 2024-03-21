package com.chuevalexander.lesson13;

public class ForLoop {
    int[] array = {1, 2, 3};

    public void foo1() {
        for (int element : array) {
            System.out.println(element);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        ForLoop fl = new ForLoop();
        fl.foo();
        fl.foo1();
    }
    public void foo() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Они равнозначны");
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
    }

}
