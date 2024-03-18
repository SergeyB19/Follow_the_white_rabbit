package com.chuevalexander.lesson30;

import java.io.*;

public class Serializator {
    public boolean serialization(Cat cat) {

        boolean flag = false;


        File file = new File("C:/cat.data");

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return flag;
    }

    public Cat deserialization() throws InvalidObjectException {
        File file = new File("C:\\Users\\serge\\Desktop\\itproger\\cat.data");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Cat cat = (Cat) ois.readObject();
                return cat;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        throw new InvalidObjectException("Object fail");
    }
}

