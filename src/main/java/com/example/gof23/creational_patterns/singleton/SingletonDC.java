package com.example.gof23.creational_patterns.singleton;

/**
 * @ProjectName:
 * @Package:        com.example.gof23.creational_patterns.singleton
 * @ClassName:      SingletonDC
 * @Description:    双重检测锁式单例模式（Double Checked Locking）
 * @Author:         Mr.Vincent
 * @CreateDate:     2019/8/5 0:14
 * @Version:        1.0.0
 */
public class SingletonDC {

    //使用了volatile关键字后，重排序被禁止，所有的写（write）操作都将发生在读（read）操作之前
    private volatile static SingletonDC instance;

    //私有化构造器
    private SingletonDC() {
    }

    //双重检测锁式
    public static SingletonDC getInstance() {
        if (instance == null) {
            synchronized (SingletonDC.class) {
                if (instance == null) {
                    instance = new SingletonDC();
                }
            }
        }
        return instance;
    }
}
