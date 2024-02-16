package com.chuevalexander.lesson21;

public class Ostrich extends Birds {
    public Ostrich(String name, Wings wings) {
        super(name, wings);
    }

    public void hideHead() {
        System.out.println("I Ostrich and I scared");
        super.walk();
    }
}
