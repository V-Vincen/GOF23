package com.example.gof23.creational_patterns.singleton;


/**
 * @ProjectName:
 * @Package:        com.example.gof23.creational_patterns.singleton
 * @ClassName:      SingletonHg
 * @Description:    饿汉式单例模式（Hungry）
 * @Author:         Mr.Vincent
 * @CreateDate:     2019/8/4 23:33
 * @Version:        1.0.0
 */
public class SingletonHungry {

    //类初始化时，立即加载这个对象
    //（在类加载器加载时，是天然的线程安全模式；同时因为是立即加载，所以没有延迟加载的优势）
    private static SingletonHungry instance = new SingletonHungry();

    //私有化构造器
    private SingletonHungry() {
    }

    //方法没有同步，调用效率高
    public static SingletonHungry getInstance() {
        return instance;
    }
}
