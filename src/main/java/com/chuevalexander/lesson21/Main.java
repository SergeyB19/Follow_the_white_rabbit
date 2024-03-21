package com.chuevalexander.lesson21;

public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich("Ostrich", new Wings());
        Crow crow = new Crow("Crow", new Wings());
        ostrich.setName("Ostrich");
        Birds ostrich2 = new Ostrich("ostrich2", new Wings());

    }
}
