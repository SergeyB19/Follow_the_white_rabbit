package com.chuevalexander.lesson14;

public class MyArrays {
    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        myArrays.foo();
    }

    int[] array = new int[3];
    Candy[] box = new Candy[5];

    int[] array2 = {10, 3, 7};
    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird};

    Candy[] box3;

    public void foo() {
        Candy candy = new Candy();
        box[0] = candy;
        System.out.println(candy);
        System.out.println(box[0]);
        System.out.println(box2[2]);
        System.out.println(array2[0]);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }
    }

    public void foo2() {
        int[][] array = new int[2][2];
        int[][] array2 = {{2, 3}, {4, 5}};
        System.out.println(array2[1][0]);

    }
}
