package com.chuevalexander.lesson9;

public class Operation {
    Integer a = 5, b = 7, c;
    String str1 = "Hot", str2 = "Java", result;
    boolean v = a < b;
    public void foo() {
        c = a + b * a;
        result = str1 + str2;
        System.out.println(c);
        System.out.println(result);
    }
}

class OperationTest {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.foo();
    }
}
