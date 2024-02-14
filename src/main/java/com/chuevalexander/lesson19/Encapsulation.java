package com.chuevalexander.lesson19;

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setA(10);
        encapsulation.getA();
        System.out.println(encapsulation.showResult());
        encapsulation.pi = 3.14;
        System.out.println(encapsulation.pi);
    }
    private int a;
    private int b;
    private double pi = Math.PI;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int showResult() {
        return a + b;
    }

    public int getMeA() {
        return a;
    }

}
