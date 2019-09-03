package com.example.gof23.creational_patterns.singleton;

/**
 * @ProjectName:
 * @Package:        com.example.gof23.creational_patterns.singleton
 * @ClassName:      SingletonLazy
 * @Description:    懒汉式单例模式（Lazy）
 * @Author:         Mr.Vincent
 * @CreateDate:     2019/8/4 23:44
 * @Version:        1.0.0
 */
public class SingletonLazy {

    //类初始化时，不初始化这个对象（实现懒加载 或者叫 延迟加载（lazy load），真正用到的时候才加载）
    private static SingletonLazy instance;

    //私有化构造器
    private SingletonLazy() {
    }

    //方法同步，调用效率低
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
