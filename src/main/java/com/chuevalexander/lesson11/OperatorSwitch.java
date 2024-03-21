package com.chuevalexander.lesson11;

public class OperatorSwitch {
    public static void main(String[] args) {
        OperatorSwitch os = new OperatorSwitch();
        os.foo();
    }
    int value = 2, firstValue = 1, secondValue = 2, thirdValue = 3;

    public void foo() {
        switch (52) {
            case 25:
                System.out.println(25);
                break;
            case 73:
                System.out.println(73);
                break;
            case 48:
                System.out.println(48);
                break;
            default:
                System.out.println("Not found");
        }
    }
}
