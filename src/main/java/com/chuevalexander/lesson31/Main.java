package com.chuevalexander.lesson31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        int b = 0;
        try {

            fileInputStream = new FileInputStream("1.txt");
            while ((b=fileInputStream.read()) != -1) {
                System.out.println((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
