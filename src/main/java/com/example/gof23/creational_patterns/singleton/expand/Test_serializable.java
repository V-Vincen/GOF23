package com.example.gof23.creational_patterns.singleton.expand;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test_serializable {

    public static void main(String[] args) throws Exception {

        //通过反序列化的方式构造多个对象
        SingletonDemo instance1 = SingletonDemo.getInstance();

        FileOutputStream fos = new FileOutputStream("e:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);

        FileInputStream fis = new FileInputStream("e:/a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SingletonDemo instance2 = (SingletonDemo) ois.readObject();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}


