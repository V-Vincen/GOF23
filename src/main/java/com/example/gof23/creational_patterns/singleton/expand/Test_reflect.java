package com.example.gof23.creational_patterns.singleton.expand;

import java.lang.reflect.Constructor;

public class Test_reflect {

    public static void main(String[] args) throws Exception {

        //通过反射来破解单例模式（通过反射的方式直接调用私有化构造器）
        Class<SingletonDemo> clazz = (Class<SingletonDemo>) Class.forName("com.example.gof23.creational_patterns.singleton.expand.SingletonDemo");
        Constructor<SingletonDemo> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);//跳过权限的检测，使其可以访问私有的方法
        SingletonDemo sd1 = c.newInstance();
        SingletonDemo sd2 = c.newInstance();

        System.out.println(sd1);
        System.out.println(sd2);

    }
}


