package com.chuevalexander.lesson30;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");
        Serializator serializator = new Serializator();
        System.out.println(serializator.serialization(cat));
        try {
            serializator.deserialization();
        } catch (InvalidObjectException e) {
            throw new RuntimeException(e);
        }
    }


}
