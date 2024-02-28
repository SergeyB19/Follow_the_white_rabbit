package com.chuevalexander.lesson26;

public class Main {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println(str.concat(" Hot"));
        System.out.println(str);
        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(" Hot");
        stringBuilder.ensureCapacity(20);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);
        stringBuilder.setLength(15);
        System.out.println(stringBuilder.capacity());
        stringBuilder.insert(1,"G");
        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
