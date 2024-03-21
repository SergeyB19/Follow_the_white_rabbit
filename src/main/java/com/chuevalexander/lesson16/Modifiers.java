package com.chuevalexander.lesson16;

public class Modifiers {
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();
        modifiers.foo();
        String name = modifiers.name;
        /*FirstClass firstClass = new FirstClass();
        String color = firstClass.color;*/
    }

    public String name;

    public Modifiers() {

    }

    public void foo() {

    }

    private class FirstClass {
        public FirstClass() {
        }

        public FirstClass(String color, String name) {
            this.color = color;
            this.name = name;
        }

        public String color;
        private String name;
    }
}

