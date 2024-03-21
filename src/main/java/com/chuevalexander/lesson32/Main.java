package com.chuevalexander.lesson32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);


        boolean remove = list.remove(person1);


        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(0);

        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);

        System.out.println(remove);
        System.out.println(list.size());
        System.out.println("list.contains(person1) = " + list.contains(person1));
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
//            Person iterPerson = iterator.next();
            iterator.remove();
        }

    }
}
