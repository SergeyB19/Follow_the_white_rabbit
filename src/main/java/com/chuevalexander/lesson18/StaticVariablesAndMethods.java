package com.chuevalexander.lesson18;

public class StaticVariablesAndMethods {

    public static void main(String[] args) {
        StaticVariablesAndMethods staticVariablesAndMethods1 = new StaticVariablesAndMethods();
        StaticVariablesAndMethods staticVariablesAndMethods2 = new StaticVariablesAndMethods();
        StaticVariablesAndMethods staticVariablesAndMethods3 = new StaticVariablesAndMethods();

        staticVariablesAndMethods1.variable = 5;
        staticVariablesAndMethods2.variable = 6;

        StaticVariablesAndMethods.variable = 5;
        StaticVariablesAndMethods.foo();

    }

    public static int foo() {
        System.out.println();
        return 1;
    }

    public int variable2;

    public void show() {
        System.out.println("No");
        foo();
    }
    static {
        variable = foo();
    }

    public static int variable;
}
