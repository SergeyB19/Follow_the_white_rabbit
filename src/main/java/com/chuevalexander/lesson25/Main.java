package com.chuevalexander.lesson25;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("Hot JAvA");
        String str2 = "Java";
        System.out.println(str1.charAt(0));
        System.out.println(str1.codePointAt(1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf(65));
        System.out.println(str1.isEmpty());
        System.out.println(str1.length());
        String[] strings = str1.split(" ");
        for (String element : strings) {
            System.out.println(element);
        }
        System.out.println(str1.substring(2, 8));
        char[] charArray = str1.toCharArray();
        for (char element : charArray) {
            System.out.println(element);
        }
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.trim());
        System.out.println(String.valueOf(65));
        String str3 = String.valueOf(65);


    }
}
