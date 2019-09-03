package com.example.gof23.creational_patterns.singleton.expand;

import java.io.Serializable;

public class SingletonDemo implements Serializable {

    private static SingletonDemo instance = new SingletonDemo();

    //私有化构造器
    private SingletonDemo() {
        //防止反射获取私有化的构造方法，从而破解单例模式
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static SingletonDemo getInstance() {
        return instance;
    }

    //在反序列化时，如果定义了此方法，则直接返回此方法中的对象，无需单独再创建新对象
    private Object readResolve() {
        return instance;
    }

}
