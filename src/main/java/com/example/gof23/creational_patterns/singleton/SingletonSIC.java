package com.example.gof23.creational_patterns.singleton;

/**
 * @ProjectName:
 * @Package:        com.example.gof23.creational_patterns.singleton
 * @ClassName:      SingletonSIC
 * @Description:    静态内部类式单例模式（Static Inner Class）
 * @Author:         Mr.Vincent
 * @CreateDate:     2019/8/5 0:28
 * @Version:        1.0.0
 */
public class SingletonSIC {

    private static class SingletonClassInstance {
        private static final SingletonSIC instance = new SingletonSIC();
    }

    //私有化构造器
    private SingletonSIC() {
    }

    public static SingletonSIC getInstance(){
        return SingletonClassInstance.instance;
    }
}
