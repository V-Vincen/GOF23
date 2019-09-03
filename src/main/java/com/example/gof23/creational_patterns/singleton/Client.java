package com.example.gof23.creational_patterns.singleton;

public class Client {
    public static void main(String[] args) {
        //测试饿汉式单例模式（Hungry）
        SingletonHungry hungry1 = SingletonHungry.getInstance();
        SingletonHungry hungry2 = SingletonHungry.getInstance();
        System.out.println("饿汉式：" + hungry1);
        System.out.println("饿汉式：" + hungry2);

        //测试懒汉式单例模式
        SingletonLazy lazy1 = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println("懒汉式：" + lazy1);
        System.out.println("懒汉式：" + lazy2);

        //测试双重检测锁单例模式
        SingletonDC dc1 = SingletonDC.getInstance();
        SingletonDC dc2 = SingletonDC.getInstance();
        System.out.println("双重检测锁：" + dc1);
        System.out.println("双重检测锁：" + dc2);

        //测试静态内部类式单例模式
        SingletonSIC sic1 = SingletonSIC.getInstance();
        SingletonSIC sic2 = SingletonSIC.getInstance();
        System.out.println("静态内部类：" + sic1);
        System.out.println("静态内部类：" + sic2);

        //测试枚举单例模式
        SingletonEnum anEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum anEnum2 = SingletonEnum.INSTANCE;
        System.out.print("枚举单例：");
        System.out.println(anEnum1 == anEnum2);
    }
}


